
package de.bigtrafo.benchmark.umlrecog;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.henshin.interpreter.ApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.interpreter.impl.BasicApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.RuleApplicationImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLPackage;

import de.bigtrafo.benchmark.util.MaintainabilityBenchmarkUtil;

public class UmlRecogBenchmark {
	private static final String FILE_PATH = "umlrecog";
	private static final String FILE_PATH_RULES = "rules";
	private static final String FILE_PATH_INSTANCES = "instances";
	private static final String FILE_PATH_INSTANCES_CORE = "instances/core_model_v2";
	private static final String FILE_NAME_INSTANCE = "bCMS_x_bCMS_UUIDMatcher_lifted_post-processed.symmetric";
	private static final String FILE_NAME_MODEL = "bCMS.uml";

	enum mode {
		CLASSIC
	}


	public static void main(String[] args) {
		Module module = loadModule();
//		MaintainabilityBenchmarkUtil.runMaintainabilityBenchmark(module);
		for (String example : getModelLocations())
			runPerformanceBenchmark(module,example);
	}


	private static Module loadModule() {
		UMLPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("symmetric", new XMIResourceFactoryImpl());
		m.put("uml", new XMIResourceFactoryImpl());
		
		// Create a resource set with a base directory:
		HenshinResourceSet rs = new HenshinResourceSet(FILE_PATH);
		EPackage diffPackage = rs.registerDynamicEPackages("Symmetric.ecore")
				.get(0);
		rs.getPackageRegistry().put(diffPackage.getNsURI(), diffPackage);
		rs.getPackageRegistry().put(UMLPackage.eINSTANCE.getNsURI(),
				UMLPackage.eINSTANCE);

		Module module1 = null;
		for (String location : getRuleLocations()) {
			if (module1 == null) {
				module1 = rs.getModule(location, false); 
			} else {
				Module mod = rs.getModule(location, false); 
				module1.getUnits().add(mod.getUnits().get(0));
			}
		}
		
		return module1;
	}

	/**
	 * Run the performance benchmark.
	 * 
	 * @param path
	 *            Relative path to the model files.
	 * @param iterations
	 *            Number of iterations.
	 */
	public static String runPerformanceBenchmark(Module module,  String exampleID) {
		HenshinResourceSet rs = (HenshinResourceSet) module.eResource().getResourceSet();
		// Load the model into a graph:
		EObject instance = rs.getEObject(exampleID + "/" + FILE_NAME_INSTANCE);
		Model model1 = (Model) rs.getEObject(FILE_PATH_INSTANCES_CORE + "/" + FILE_NAME_MODEL);
		Model model2 = (Model) rs.getEObject(exampleID + "/" +FILE_NAME_MODEL);
		EGraph graph = new EGraphImpl(UMLPackage.eINSTANCE);
		graph.addGraph(instance);
		graph.addGraph(model2);
		graph.addGraph(model1);

		// Create an engine and rule applications:

		long startTime = System.currentTimeMillis();

		ApplicationMonitor monitor = new BasicApplicationMonitor();
		monitor = new BasicApplicationMonitor();
		int graphInitially = graph.size();

		Engine engine = new EngineImpl();
//		engine.getOptions().put(Engine. OPTION_SORT_VARIABLES, false);
		
		System.gc();
		System.out.println("Starting benchmark run for model: "+exampleID);
		startTime = System.currentTimeMillis();
		
		for (Unit unit : module.getUnits()) {
			if (unit instanceof Rule) {
				Rule rule = (Rule)unit;
				Iterator<Match> it = engine.findMatches(rule, graph, null)
						.iterator();
				int numberOfMatches = 0;
				while (it.hasNext()) {
					Match match = it.next();
					RuleApplication application = new RuleApplicationImpl(
							engine, graph, rule, match);
					application.execute(monitor);
					numberOfMatches++;
				}
			}
			long runtime = (System.currentTimeMillis() - startTime);
			System.out.println("Finished "+unit.getName()+" after "+runtime+" msec, changes: "+(graph.size()-graphInitially));
		}

		long runtime = (System.currentTimeMillis() - startTime);
		int graphChanged = graph.size();
		String info = runtime+ " msec, "+graphInitially+ " -> "+graphChanged+" ("+(graphChanged-graphInitially)+")";
		System.out.println(info);
		return info;
	}


	private static Set<String> getRuleLocations() {
		Set<String> result = new HashSet<String>();
		try {
			Files.walk(Paths.get(FILE_PATH+"/"+FILE_PATH_RULES))
			.filter(Files::isRegularFile)
			.forEach(f -> result.add(FILE_PATH_RULES+"/"+
					f.getParent().getParent().getFileName()+"/"+f.getParent().getFileName()+"/"+f.getFileName()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result.stream().filter(s->s.endsWith(".henshin")).collect(Collectors.toSet());
	}

	private static Set<String> getModelLocations() {
		Set<String> result = new HashSet<String>();
		try {
			Files.walk(Paths.get(FILE_PATH+"/"+FILE_PATH_INSTANCES))
			.filter(Files::isRegularFile)
			.filter(f ->f.getFileName().toString().equals(FILE_NAME_INSTANCE))
			.filter(f ->!f.getParent().toString().equals(FILE_PATH_INSTANCES_CORE))
			.forEach(f -> result.add(FILE_PATH_INSTANCES+"/"+
					f.getParent().getParent().getFileName()+"/"+f.getParent().getFileName()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
