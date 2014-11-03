package com.pco.signature.timer;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TimerTask;

import com.pco.signature.Signer;
import com.pco.signature.memory.SharedFilesMemory;



public class TaskSigner extends TimerTask{
	private String sourceDir;
	private int fileBlock;
	private String targetDir;
	
	private Signer signature;


	@Override
	public void run() {
		Map<String,String> filesOnDir= new HashMap<String, String>();
		File sourceFolder= new File(sourceDir);
		int fileCounter=0;
		if(!"NO_DIR".equals(sourceFolder)&& sourceFolder.exists()&& sourceFolder.isDirectory()){
			System.out.println("[Tarea de Firma] archivos encontrados "+sourceFolder.listFiles().length);
			for (final File fileEntry : sourceFolder.listFiles()) {
				if (!fileEntry.isDirectory() && (fileEntry.getName().endsWith(".xml")||fileEntry.getName().endsWith(".XML"))) {
					fileCounter++;
					if(fileCounter<=fileBlock){
						filesOnDir.put(fileEntry.getName(),fileEntry.getAbsolutePath());
					}
					else{
						break;
					}
				} 
			}
			//consultar si no esta siendo procesado por otro timerTask
			for(Entry<String, String> xml:filesOnDir.entrySet()){
				System.out.println("***** inicio");
				if(!SharedFilesMemory.getFilesinProgress().contains(xml.getKey())){
					System.out.println("[Tarea de Firma] "+xml.getKey());
					SharedFilesMemory.addFileToProcess(xml.getKey());
					//termino de firmar y se va de la lista
					
					signature.ejecutarFirmaXades(targetDir, xml.getValue(), targetDir+System.getProperty("file.separator")+"Signed-"+xml.getKey());
					File f = new File(xml.getValue());
					f.delete();
					SharedFilesMemory.removeFile(xml.getKey());
				}
			}
		}
		else{
			System.err.println("El directorio de origen es incorrecto, no se procesaran los comprobantes de venta");
		}

	}
	
	
	private Map<String,String> getFilesOnSourceDirectory(){
		return null;
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
