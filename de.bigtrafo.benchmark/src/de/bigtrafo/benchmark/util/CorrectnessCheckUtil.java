package de.bigtrafo.benchmark.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.DiffBuilder;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.diff.IDiffProcessor;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

public class CorrectnessCheckUtil {
	public static void main(String[] args) {
		compare("ocl/A.ecore", "ocl/B.ecore");
	}

//	
//	public static void compare(String filePath1, String filePath2) {
//		URI uri1 = URI.createFileURI(filePath1);
//		HenshinResourceSet resourceSet1 = new HenshinResourceSet();
//		registerPackages(resourceSet1);
//		resourceSet1.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
//		Resource resource1 = resourceSet1.getResource(uri1, true);
//
//		URI uri2 = URI.createFileURI(filePath2);
//		HenshinResourceSet resourceSet2 = new HenshinResourceSet();
//		registerPackages(resourceSet2);
//		resourceSet2.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
//		Resource resource2 = resourceSet2.getResource(uri2, true);
//		
//		System.out.println(InterpreterUtil.areIsomorphic(resource1, resource2));
//	}
	
	public static void compare(String filePath1, String filePath2) {
		URI uri1 = URI.createFileURI(filePath1);
		HenshinResourceSet resourceSet1 = new HenshinResourceSet();
		registerPackages(resourceSet1);
		resourceSet1.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		resourceSet1.getResource(uri1, true);
		EcoreUtil.resolveAll(resourceSet1);

		URI uri2 = URI.createFileURI(filePath2);
		HenshinResourceSet resourceSet2 = new HenshinResourceSet();
		registerPackages(resourceSet2);
		resourceSet2.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		resourceSet2.getResource(uri2, true);
		EcoreUtil.resolveAll(resourceSet2);
		
		// Configure EMF Compare
		IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
		IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());

		IDiffEngine diffEngine = createIgnoreOrderDiffEngine();

		IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory);
		matchEngineFactory.setRanking(20);
		IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
		matchEngineRegistry.add(matchEngineFactory);

		EMFCompare comparator = EMFCompare.builder()
				.setMatchEngineFactoryRegistry(matchEngineRegistry).setDiffEngine(diffEngine).build();

		IComparisonScope scope = new DefaultComparisonScope(resourceSet1, resourceSet2, null);
		Comparison comparison = comparator.compare(scope);

		List<Diff> differences = comparison.getDifferences();
		System.out.println("Compared " + filePath1 + " vs. " + filePath2 + ": " + differences.size() + " differences.");
	    for(Diff d: differences)
	    {
	        System.err.println("d.getKind(): "+d.getKind());
	        System.err.println("d.getMatch(): " + d.getMatch());
	        System.err.println("State: " + d.getState());
	    }

	}

	private static IDiffEngine createIgnoreOrderDiffEngine() {
		IDiffProcessor diffProcessor = new DiffBuilder();
		IDiffEngine diffEngine = new DefaultDiffEngine(diffProcessor) {
			@Override
			protected FeatureFilter createFeatureFilter() {
				return new FeatureFilter() {
					@Override
					public boolean checkForOrderingChanges(EStructuralFeature feature) {
						return true;
					}
				};
			}
		};
		return diffEngine;
	}

	private static void registerPackages(HenshinResourceSet resourceSet1) {
		resourceSet1.registerDynamicEPackages("ocl/Pivot.ecore");
		resourceSet1.registerDynamicEPackages("ocl/GraphConstraint.ecore");

	}

	public static boolean checkCorrectness(String resultPath, String referencePath, String fileExtension) {
		String resultFile = resultPath + "/" + findFile(resultPath, fileExtension);
		String referenceFile = referencePath + "/" + findFile(referencePath, fileExtension);
		compare(resultFile, referenceFile);
		return true;
	}

	private static String findFile(String path, String fileExtension) {
		List<String> result = new ArrayList<String>();
		try {
			Files.walk(Paths.get(path))
					// .filter(Files::isRegularFile)
					.filter(s -> s.toString().endsWith(fileExtension))
					.forEach(f -> result.add(f.getFileName().toString()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (result.size() != 1)
			throw new IllegalStateException(
					"Expected exactly one " + fileExtension + " file in " + path + ", found " + result.size() + ".");
		return result.get(0);
	}
	
}
