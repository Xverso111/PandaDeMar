package com.pco.signature.daemon;

import java.util.Timer;

import com.pco.signature.Signer;
import com.pco.signature.timer.Constants;
import com.pco.signature.timer.SignerTimer;
import com.pco.signature.timer.SignerTimerTask;
import com.pco.properties.PropertiesUtil;

public class MainSignerDaemon {
	//Logger log= Logger.getLogger(MainSignerDaemon.class);

	public static final String NO_CERT="NO_CERT";





	public static void start(String[] args) {
		System.out.println("start");
		try{
			PropertiesUtil propertiesReader= PropertiesUtil.getInstance();
			long time=Long.parseLong(propertiesReader.getProperty("time","600000"));
			int fileBlock=Integer.parseInt(propertiesReader.getProperty("fileBlock", "10"));
			String sourceDir=propertiesReader.getProperty("sourceDirectory",Constants.NO_DIRECTORY);
			String certDir=propertiesReader.getProperty("certDir",NO_CERT);
			String password=propertiesReader.getProperty("password","NO_PSWD");
			String targetDir=propertiesReader.getProperty("targetDirectory","c://temp");
			Signer signature = new Signer();
			if(!NO_CERT.equals(certDir)){
				signature.inicializar(certDir,password);
				SignerTimerTask task=new SignerTimerTask();
				task.setFileBlock(fileBlock);
				task.setSourceDir(sourceDir);
				task.setSignature(signature);
				task.setTargetDir(targetDir);
				Timer signer= new SignerTimer();
				signer.scheduleAtFixedRate(task, 0, time);
			}
			else{
				System.err.println("No esta ingresado el path del certificado");
			}
		}catch(Exception ex){
			System.err.println("No se puede inicializar el servicio revise el archivo de configuracion"+ex.getMessage());
		}
	}


	public static void stop(String[] args) {
		System.out.println("stop");
		//stop = true;
	}

	public static void main(String[] args) {
		if ("start".equals(args[0])) {
			start(args);
		} else if ("stop".equals(args[0])) {
			stop(args);
		}

	}


}


