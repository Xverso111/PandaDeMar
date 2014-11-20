package com.pco.recepcion;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;

import javax.xml.ws.WebServiceRef;

import com.pco.recepcion.recepcion.ws.sri.gob.ec.RecepcionComprobantesService;

public class RecepcionServiceClient {
	 public static final String ESTADO_RECIBIDA = "RECIBIDA";
	  public static final String ESTADO_DEVUELTA = "DEVUELTA";
	  public static final String URL_WSDL = "http://10.21.50.187:8080/comprobantes-electronicos-ws/RecepcionComprobantes?wsdl";
	  
	  @WebServiceRef
	  private RecepcionComprobantesService service;
	
	public void sendDocument(Path document){
		
	}

	public static byte[] archivoToByte(File file)
		    throws IOException
		  {
		    byte[] buffer = new byte[(int)file.length()];
		    InputStream ios = null;
		    try {
		      ios = new FileInputStream(file);
		      if (ios.read(buffer) == -1)
		        throw new IOException("EOF reached while trying to read the whole file");
		    }
		    finally {
		      try {
		        if (ios != null)
		          ios.close();
		      }
		      catch (IOException e) {
		    	  
		      }
		    }
		    return buffer;
		  }
}
