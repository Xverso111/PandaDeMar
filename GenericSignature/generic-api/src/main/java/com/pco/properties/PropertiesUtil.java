package com.pco.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


/**
 * Class util to read a properties file
 * @author pablo
 *
 */
public class PropertiesUtil {

	private static PropertiesUtil instance=null;
	private static Properties properties;

	/**
	 * returns a PropertiesUtil instance
	 * @return
	 */
	public static PropertiesUtil getInstance(){
		if(instance==null){
			instance= new PropertiesUtil();
		}
		return instance;
	}

	private PropertiesUtil(){
		properties= new Properties();
		
		File propertiesFile= new File("./configuration/signer.properties");
		try {
			properties.load(new FileInputStream(propertiesFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public  String getProperty(String key, String defaultValue){
		if(properties.getProperty(key)!=null){
			return properties.getProperty(key); 
		}
		else{
			return defaultValue;
		}
	}
}
