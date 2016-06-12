
package de.bigtrafo.benchmark.umlrecog;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.henshin.interpreter.ApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.BasicApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.RuleApplicationImpl;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.interpreter.util.InterpreterUtil;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLPackage;

import de.bigtrafo.benchmark.ocl.OclBenchmark;
import de.bigtrafo.benchmark.util.LoadingHelper;
import de.bigtrafo.benchmark.util.MaintainabilityBenchmarkUtil;
import de.bigtrafo.benchmark.util.RuntimeBenchmarkReport;

public class UmlRecogBenchmark {
	private static final String FILE_PATH = "umlrecog/";
	private static final String FILE_PATH_RULES = "rules";
	private static final String FILE_PATH_INSTANCES = "instances";
	private static final String FILE_PATH_INSTANCES_CORE = "instances/core_model_v2";
	private static final String FILE_NAME_INSTANCE = "bCMS_x_bCMS_UUIDMatcher_lifted_post-processed.symmetric";
	private static final String FILE_PATH_OUTPUT = "output/";
	private static final String FILE_NAME_MODEL = "bCMS.uml";

	enum mode {
		CLASSIC
	}

	public static void main(String[] args) {
		Module module = loadModule();
		// // Uncomment the following line to print statistics about the
		// transformation.
		// MaintainabilityBenchmarkUtil.runMaintainabilityBenchmark(module);

		RuntimeBenchmarkReport reporter = new RuntimeBenchmarkReport(OclBenchmark.class.getSimpleName(),
				FILE_PATH + FILE_PATH_OUTPUT);
		reporter.start();
//		for (String example : LoadingHelper.getModelLocations(FILE_PATH, FILE_PATH_INSTANCES, FILE_PATH_INSTANCES_CORE,
//				FILE_NAME_INSTANCE)) {
//			runPerformanceBenchmark(module, example, reporter);
//		}
		runPerformanceBenchmark(module, "instances/authentication_vp/authentication_v_BiometricBased", reporter);
	}

	private static Module loadModule() {
		UMLPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("symmetric", new XMIResourceFactoryImpl());
		m.put("uml", new XMIResourceFactoryImpl());

		// Create a resource set with a base directory:
		HenshinResourceSet rs = new HenshinResourceSet(FILE_PATH);
		EPackage diffPackage = rs.registerDynamicEPackages("Symmetric.ecore").get(0);
		rs.getPackageRegistry().put(diffPackage.getNsURI(), diffPackage);
		rs.getPackageRegistry().put(UMLPackage.eINSTANCE.getNsURI(), UMLPackage.eINSTANCE);

		Module module = LoadingHelper.loadAllRulesAsOneModule(rs, FILE_PATH, FILE_PATH_RULES);

		return module;
	}

	/**
	 * Run the performance benchmark.
	 * 
	 * @param reporter
	 * 
	 * @param path
	 *            Relative path to the model files.
	 * @param iterations
	 *            Number of iterations.
	 */
	public static void runPerformanceBenchmark(Module module, String exampleID, RuntimeBenchmarkReport reporter) {
		reporter.beginNewEntry(exampleID);
		HenshinResourceSet rs = (HenshinResourceSet) module.eResource().getResourceSet();

		// Load the model into a graph:
		EObject instance = rs.getEObject(exampleID + "/" + FILE_NAME_INSTANCE);
		EGraph graph = new EGraphImpl(instance);
		graph.addGraph(instance);
		
		long startTime = System.currentTimeMillis();
		ApplicationMonitor monitor = new BasicApplicationMonitor();
		
		int graphInitially = graph.size();
		Engine engine = new EngineImpl();
		// engine.getOptions().put(Engine. OPTION_SORT_VARIABLES, false);

		System.gc();
		startTime = System.currentTimeMillis();

		for (Unit unit : module.getUnits()) {
			long currentRunTime = System.currentTimeMillis();
			int graphCurrent = graph.size();
			
			List<Match> matches = InterpreterUtil.findAllMatches(engine, module, graph);
			for (Match m : matches) {
				UnitApplication mainUnitApplication = new UnitApplicationImpl(engine, graph, unit, m);
				mainUnitApplication.execute(monitor);	
			}
			
			long runtime = (System.currentTimeMillis() - currentRunTime);
			int graphChanged = graph.size();
			reporter.addSubEntry(unit, graphCurrent, graphChanged, runtime);
		}

		long runtime = (System.currentTimeMillis() - startTime);
		int graphChanged = graph.size();

		reporter.finishEntry(graphInitially, graphChanged, runtime);
	}

}
