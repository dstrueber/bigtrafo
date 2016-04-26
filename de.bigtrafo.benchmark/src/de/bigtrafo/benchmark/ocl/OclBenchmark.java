package de.bigtrafo.benchmark.ocl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.henshin.interpreter.ApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.BasicApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.interpreter.util.InterpreterUtil;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.emf.henshin.trace.Trace;
import org.eclipse.ocl.examples.pivot.Class;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Root;

import GraphConstraint.GraphConstraintPackage;
import GraphConstraint.NestedGraphConstraint;
import de.bigtrafo.benchmark.util.MaintainabilityBenchmarkUtil;
import de.bigtrafo.measurement.compactness.RuleSetMetricsCalculator;
import metrics.RuleMetrics;
import metrics.RuleSetMetrics;

public class OclBenchmark {
//	private static final String FILE_PATH_RULES = "D:/git/mergein/org.eclipse.emf.henshin.variability.test/ocl/";
//	private static final String FILE_PATH_INSTANCE = "D:/git/mergein/org.eclipse.emf.henshin.variability.test/ocl/instances/";
	private static final String FILE_PATH_RULES = "ocl/";
	private static final String FILE_PATH_INSTANCE = "instances/";
	private static final String FILE_NAME_RULES = "OCL2NGC.henshin";
	private static final String FILE_NAME_METAMODEL = "/PetriNetWithOCLPaper.ecore";
	private static final String FILE_NAME_INSTANCE = "/PetriNetWithOCLPaper.ecoreecore.oclas";

	private static final String TRACEROOT = "traceroot";
	private static final String INVARIANT = "invariant";
	private static final String NGC = "ngc";

	enum mode {
		CLASSIC
	}

	/**
	 * Relative path to the model files.
	 */
	public static final String PATH = "files/ocl";


	public static void main(String[] args) {
		Module module = loadModule();
		MaintainabilityBenchmarkUtil.runMaintainabilityBenchmark(module);
		String[] examples = { 
//				"01", "02", "03",
				"04", "05a", "05b", "06", "07",
				"08", "09" };
		int runs = 1;

		for (String example : examples) {
			System.out.print("Example " + example + "\t");
				for (int i = 0; i < runs; i++) {
					run(PATH, example);
					System.gc();
				}
			}
		}



	/**
	 * Run the benchmark.
	 * 
	 * @param path
	 *            Relative path to the model files.
	 * @param iterations
	 *            Number of iterations.
	 */
	public static String run(String path, String exampleID) {
		Module module = loadModule();
		HenshinResourceSet resourceSet = (HenshinResourceSet) module.eResource().getResourceSet();

		Unit initUnit = module.getUnit("init");
		Unit mainUnit = module.getUnit("main");

		// Load the model into a graph:
		Resource metamodel = resourceSet.getResource(FILE_PATH_INSTANCE
				+ exampleID + FILE_NAME_METAMODEL);
		Root root = (Root) resourceSet.getEObject(FILE_PATH_INSTANCE
				+ exampleID + FILE_NAME_INSTANCE);
		EGraph graph = new EGraphImpl();
		graph.addTree(metamodel.getContents().get(0));
		graph.addGraph(root);

		int graphInitially = graph.size();

		// Create an engine and a rule application:
		Engine engine = new EngineImpl();

		UnitApplication initUnitApplication = new UnitApplicationImpl(engine,
				graph, initUnit, null);
		ApplicationMonitor monitor = new BasicApplicationMonitor();
		System.gc();
		BasicEList<Constraint> invariants = new BasicEList<Constraint>();
		TreeIterator<EObject> iter = root.eAllContents();
		while (iter.hasNext()) {
			EObject eObject = iter.next();
			if (eObject instanceof Class) {
				invariants.addAll(((Class) eObject).getOwnedInvariant());
			}
		}

		Trace trace = null;
		NestedGraphConstraint nestedGraphConstraint = null;
		if (initUnitApplication != null) {
			for (Constraint inv : invariants) {
				initUnitApplication.setParameterValue(INVARIANT, inv);
				InterpreterUtil.executeOrDie(initUnitApplication);
				nestedGraphConstraint = (NestedGraphConstraint) initUnitApplication
						.getResultParameterValue(NGC);
				trace = (Trace) initUnitApplication
						.getResultParameterValue(TRACEROOT);
			}
		}
		initUnitApplication.execute(monitor);
		if (!initUnitApplication.execute(monitor)) {
			throw new RuntimeException("Error during initialization");
		}

		UnitApplication mainUnitApplication = new UnitApplicationImpl(engine, graph,
					mainUnit, null);
		monitor = new BasicApplicationMonitor();
		System.gc();

		long startTime = System.currentTimeMillis();
		if (!mainUnitApplication.execute(monitor)) {
			throw new RuntimeException("Error during transformation");
		}
		long runtime = (System.currentTimeMillis() - startTime);
		int graphChanged = graph.size();
		
		String info = sec(runtime)+ " sec, "+graphInitially+ " -> "+graphChanged+" ("+(graphChanged-graphInitially)+")";
		System.out.println(info);
		
		
		return info;
	}


	private static Module loadModule() {
		PivotPackage.eINSTANCE.eClass();
		GraphConstraintPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("ecore", new XMIResourceFactoryImpl());
		m.put("oclas", new XMIResourceFactoryImpl());

		// Create a resource set with a base directory:
		HenshinResourceSet resourceSet = new HenshinResourceSet(FILE_PATH_RULES);

		// Load the module and find the rule:
		String location = FILE_NAME_RULES;
	
		Module module = resourceSet.getModule(location, false);
		return module;
	}

	private static double sec(long msecTime) {
		return (msecTime*1.0)/1000;
	}


	private static void saveNestedGraphConstraint(Date date,
			NestedGraphConstraint ngc, Root root, Trace trace) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmss");
		String path = new Path(PATH + "/graphconstraints/" + sdf.format(date))
				.toOSString();
		HenshinResourceSet resourceSet = new HenshinResourceSet(path);
		resourceSet.saveEObject(ngc,
				path + "/" + ngc.getName().concat("GraphConstraint"));
		resourceSet.saveEObject(root,
				path + "/" + root.getName().concat(".ecore.oclass"));
		resourceSet.saveEObject(trace, path + "/"
				+ ngc.getName().concat("1" + ".trace"));
		resourceSet.saveEObject(trace, path + "/"
				+ ngc.getName().concat("2" + ".trace"));
	}

}
