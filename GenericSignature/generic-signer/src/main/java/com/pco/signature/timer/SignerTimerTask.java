package com.pco.signature.timer;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TimerTask;

import com.pco.signature.Signer;
import com.pco.signature.memory.SharedFilesMemory;



public class SignerTimerTask extends TimerTask{
	private String sourceDir;
	private int fileBlock;
	private String targetDir;

	private Signer signature;


	@Override
	public void run() {
		if(isAValidDirectory(sourceDir)){
			
			Path sourceDirectoryPath= Paths.get(sourceDir);
			Map<String,Path> xmlFiles=getXmlFilesOnSourceDirectory(sourceDirectoryPath);
			//consultar si no esta siendo procesado por otro timerTask
			System.out.println("[Tarea de Firma] archivos encontrados "+xmlFiles.size());
			for(Entry<String, Path> xmlFile:xmlFiles.entrySet()){
				if(!SharedFilesMemory.getFilesinProgress().contains(xmlFile.getKey())){
					System.out.println("[Tarea de Firma] "+xmlFile.getKey());
					SharedFilesMemory.addFileToProcess(xmlFile.getKey());
					//termino de firmar y se va de la lista
					signature.ejecutarFirmaXades(targetDir, xmlFile.getValue().toString(), targetDir+System.getProperty("file.separator")+"Signed-"+xmlFile.getKey());
//					try {
//						Files.deleteIfExists(xmlFile.getValue());
//					} catch (IOException e) {
//						System.out.println("problemas eliminando el archivo");
//					}
					SharedFilesMemory.removeFile(xmlFile.getKey());
				}
			}
		}
		else{
			System.err.println("El directorio de origen es incorrecto, no se procesaran los comprobantes de venta");
		}

	}


	private Map<String,Path> getXmlFilesOnSourceDirectory(Path sourceDirectory){
		Map<String,Path> filesOnDirectory= new HashMap<>();
		int fileCounter=0;
		try (DirectoryStream<Path> directoryContents = Files.newDirectoryStream(sourceDirectory,Constants.XML_EXTENSION)) {
			for (Path file: directoryContents) {
				if(!Files.isDirectory(file)){
					fileCounter++;
					if(fileCounter<=fileBlock){
						filesOnDirectory.put(file.getFileName().toString(),file);
					}
					else{
						break;
					}
				}
			}
		} catch (IOException | DirectoryIteratorException x) {
			// IOException can never be thrown by the iteration.
			System.err.println(x);
		}
		return filesOnDirectory;
	}

	private boolean isAValidDirectory(String sourceDirectory){
		Path sourceDirectoryPath= Paths.get(sourceDirectory);
		return Files.exists(sourceDirectoryPath) &&	Files.isDirectory(sourceDirectoryPath)&&!Constants.NO_DIRECTORY.equals(sourceDirectory);
	}


	public String getSourceDir() {
		return sourceDir;
	}


	public void setSourceDir(String sourceDir) {
		this.sourceDir = sourceDir;
	}


	public int getFileBlock() {
		return fileBlock;
	}


	public void setFileBlock(int fileBlock) {
		this.fileBlock = fileBlock;
	}


	public Signer getSignature() {
		return signature;
	}


	public void setSignature(Signer signature) {
		this.signature = signature;
	}


	public String getTargetDir() {
		return targetDir;
	}


	public void setTargetDir(String targetDir) {

		File targetDirFile= new File(targetDir);
		if(!targetDirFile.isDirectory()||!targetDirFile.exists()){
			System.err.println("El directorio de destino no existe, se colocara en el directorio del usuario"+System.getProperty("user.dir"));
			targetDir=System.getProperty("user.dir");
		}
		else{
			this.targetDir = targetDir;
		}
	}




}
