package de.bigtrafo.benchmark.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

public class LoadingHelper {

	public static Set<String> getRuleLocations(String filePath, String filePathRules) {
		Set<String> result = new HashSet<String>();
		try {
			Files.walk(Paths.get(filePath+"/"+filePathRules))
			.filter(Files::isRegularFile)
			.forEach(f -> result.add(filePathRules+"/"+
					f.getParent().getParent().getFileName()+"/"+f.getParent().getFileName()+"/"+f.getFileName()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result.stream().filter(s->s.endsWith(".henshin")).collect(Collectors.toSet());
	}

	public static Set<String> getModelLocations(String filePath, String filePathInstances,
			String filePathInstancesCore, String fileNameInstance) {
		Set<String> result = new HashSet<String>();
		try {
			Files.walk(Paths.get(filePath+"/"+filePathInstances))
			.filter(Files::isRegularFile)
			.filter(f ->f.getFileName().toString().equals(fileNameInstance))
			.filter(f ->!f.getParent().toString().equals(filePathInstancesCore))
			.forEach(f -> result.add(filePathInstances+"/"+
					f.getParent().getParent().getFileName()+"/"+f.getParent().getFileName()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public static Module loadAllRulesAsOneModule(HenshinResourceSet rs, String filePath, String filePathRules) {
		Module module = null;
		for (String location : getRuleLocations(filePath, filePathRules)) {
			if (module == null) {
				module = rs.getModule(location, false); 
			} else {
				Module mod = rs.getModule(location, false); 
				module.getUnits().add(mod.getUnits().get(0));
			}
		}
		return module;
	}

}
