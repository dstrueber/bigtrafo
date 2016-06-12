package de.bigtrafo.benchmark.util;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.DiffBuilder;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.diff.IDiffProcessor;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

public class CorrectnessCheckUtil {
	
	/**
	 * Checks if the input files are identical. <br>
	 * TODO: Implement a more intelligent, semantic way to compare the files.
	 * @param filePath1
	 * @param filePath2
	 */
	private static boolean checkEquality(String filePath1, String filePath2) {
		try {
			String text1 = new String(Files.readAllBytes(Paths.get(filePath1)));
			String text2 = new String(Files.readAllBytes(Paths.get(filePath2)));
			return text1.equals(text2);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

	}

	// TODO: Get the following EMF compare running (currently finds differences
	// in identical files)
	//
	// public static void compare(String filePath1, String filePath2) {
	// URI uri1 = URI.createFileURI(filePath1);
	// HenshinResourceSet resourceSet1 = new HenshinResourceSet();
	// registerPackages(resourceSet1);
	// resourceSet1.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*",
	// new XMIResourceFactoryImpl());
	// resourceSet1.getResource(uri1, true);
	// EcoreUtil.resolveAll(resourceSet1);
	//
	// URI uri2 = URI.createFileURI(filePath2);
	// HenshinResourceSet resourceSet2 = new HenshinResourceSet() ;
	// registerPackages(resourceSet2);
	// resourceSet2.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*",
	// new XMIResourceFactoryImpl());
	// resourceSet2.getResource(uri2, true);
	// EcoreUtil.resolveAll(resourceSet2);
	//
	// // Configure EMF Compare
	// IEObjectMatcher matcher =
	// DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
	// IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new
	// DefaultEqualityHelperFactory());
	//
	// IDiffEngine diffEngine = createIgnoreOrderDiffEngine();
	//
	// IMatchEngine.Factory matchEngineFactory = new
	// MatchEngineFactoryImpl(matcher, comparisonFactory);
	// matchEngineFactory.setRanking(20);
	// IMatchEngine.Factory.Registry matchEngineRegistry = new
	// MatchEngineFactoryRegistryImpl();
	// matchEngineRegistry.add(matchEngineFactory);
	//
	// EMFCompare comparator = EMFCompare.builder()
	// .setMatchEngineFactoryRegistry(matchEngineRegistry).setDiffEngine(diffEngine).build();
	//
	// IComparisonScope scope = new DefaultComparisonScope(resourceSet1,
	// resourceSet2, null);
	// Comparison comparison = comparator.compare(scope);
	//
	// List<Diff> differences = comparison.getDifferences();
	// System.out.println("Compared " + filePath1 + " vs. " + filePath2 + ": " +
	// differences.size() + " differences.");
	// for(Diff d: differences)
	// {
	// System.err.println("d.getKind(): "+d.getKind());
	// System.err.println("d.getMatch(): " + d.getMatch());
	// System.err.println("State: " + d.getState());
	// }
	//
	// }

	private static IDiffEngine createIgnoreOrderDiffEngine() {
		IDiffProcessor diffProcessor = new DiffBuilder();
		IDiffEngine diffEngine = new DefaultDiffEngine(diffProcessor) {
			@Override
			protected FeatureFilter createFeatureFilter() {
				return new FeatureFilter() {
					@Override
					public boolean checkForOrderingChanges(EStructuralFeature feature) {
						return false;
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

	public static boolean performCorrectnessCheck(String resultPath, String referencePath, String fileExtension, RuntimeBenchmarkReport report) {
		String resultFile = resultPath + "/" + findFile(resultPath, fileExtension);
		String referenceFile = referencePath + "/" + findFile(referencePath, fileExtension);
		if (!checkEquality(resultFile, referenceFile))
			report.addIncorrectnessEntry();
		
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
