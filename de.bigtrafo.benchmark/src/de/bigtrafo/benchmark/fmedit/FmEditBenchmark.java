/**
 * <copyright>
 * Copyright (c) 2010-2012 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package de.bigtrafo.benchmark.fmedit;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

import de.bigtrafo.benchmark.util.MaintainabilityBenchmarkUtil;
import de.imotep.featuremodel.variability.metamodel.FeatureModel.FeatureModelPackage;

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
		Module module = loadModule();
		MaintainabilityBenchmarkUtil.runMaintainabilityBenchmark(module);
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
