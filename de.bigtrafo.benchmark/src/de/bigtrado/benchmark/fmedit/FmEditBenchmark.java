/**
 * <copyright>
 * Copyright (c) 2010-2012 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package de.bigtrado.benchmark.fmedit;

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

import de.bigtrado.benchmark.fmrecog.FmRecogBenchmark;
import de.bigtrafo.measurement.compactness.RuleSetMetricsCalculator;
import de.imotep.featuremodel.variability.metamodel.FeatureModel.FeatureModel;
import de.imotep.featuremodel.variability.metamodel.FeatureModel.FeatureModelPackage;
import metrics.RuleSetMetrics;

public class FmEditBenchmark {
	private static final String FILE_PATH_RULES = "fmedit/";
	private static final String FILE_NAME_RULES_CLASSIC = "featuremodeleditoperations.henshin";

	enum mode {
		CLASSIC
	}

	/**
	 * Relative path to the model files.
	 */
	public static final String PATH = "files/ocl";

	public static void main(String[] args) {
		runMaintainabilityBenchmark();
	}


	private static void runMaintainabilityBenchmark() {
		Module module = loadModule();
	    Set<Rule> rules = module.getUnits().stream().filter(p -> p instanceof Rule)
	            .map(p -> (Rule) p).collect(Collectors.toSet());
		RuleSetMetricsCalculator c = new RuleSetMetricsCalculator();
		RuleSetMetrics metrics = c.calculcate(rules);
		System.out.println(metrics.createPresentationString());
	}

	private static Module loadModule() {
		FeatureModelPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("symmetric", new XMIResourceFactoryImpl());
		m.put("featuremodel", new XMIResourceFactoryImpl());

		// Create a resource set with a base directory:
		HenshinResourceSet rs = new HenshinResourceSet(FILE_PATH_RULES);
		EPackage diffPackage = rs.registerDynamicEPackages("Symmetric.ecore")
				.get(0);
		rs.getPackageRegistry().put(diffPackage.getNsURI(), diffPackage);
		rs.getPackageRegistry().put(FeatureModelPackage.eINSTANCE.getNsURI(),
				FeatureModelPackage.eINSTANCE);

		// Load the module
		String location = null;
			location = FILE_NAME_RULES_CLASSIC;
		Module module = rs.getModule(location, false);
		return module;
	}

}
