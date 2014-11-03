package com.pco.signature.memory;

import java.util.ArrayList;
import java.util.List;
/**
 * Clase para el manejo de los archivos que estan siendo procesados
 * @author pablo
 *
 */
public class SharedFilesMemory {
	
	private static List<String> filesOnProcess= new ArrayList<String>();
	
	public static synchronized void addFileToProcess(String file){
		filesOnProcess.add(file);
	}
	
	public static List<String> getFilesinProgress(){
		return filesOnProcess;
	}
	
	public static synchronized void removeFile(String file){
		filesOnProcess.remove(file);
	}
}
