package com.pco.signature;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import es.mityc.javasign.EnumFormatoFirma;
import es.mityc.firmaJava.libreria.xades.DataToSign;
import es.mityc.firmaJava.libreria.xades.XAdESSchemas;
import es.mityc.javasign.xml.refs.InternObjectToSign;
import es.mityc.javasign.xml.refs.ObjectToSign;

public class Signer extends FirmaPKCS12Generica{

	private String archivoAFirmar;

	private String archivoFirmado;


	/***
	 * inicializa la firma
	 * @param certificate la ruta del certificado .p12
	 * @param password el password del certificado
	 */
	public void inicializar(String certificate, String password){
		this.setArchivoPKCS12(certificate);
		this.setContraseniaPKCS12(password);
	}

	protected Document getDocument(String filepath)
			throws ParserConfigurationException, SAXException, IOException
	{
		Document doc = null;

		File file = new File(filepath);
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);

		DocumentBuilder db = dbf.newDocumentBuilder();
		doc = db.parse(file);

		return doc;
	}

	/**
	 * Metodo que ejecuta el proceso de firma
	 * @param pathDirectorioSalida
	 * @param pathArchivoXMLFirmar
	 * @param nombreArchivoFirmado
	 */
	public void ejecutarFirmaXades(String pathDirectorioSalida, String pathArchivoXMLFirmar, String nombreArchivoFirmado)
	{
		this.setDirectorioSalidaFirma(pathDirectorioSalida);

		this.archivoAFirmar = pathArchivoXMLFirmar;
		this.archivoFirmado = nombreArchivoFirmado;
		this.execute();
	}

	protected DataToSign createDataToSign()
	{
		DataToSign datosAFirmar = new DataToSign();
		datosAFirmar.setXadesFormat(EnumFormatoFirma.XAdES_BES);
		datosAFirmar.setEsquema(XAdESSchemas.XAdES_132);
		datosAFirmar.setXMLEncoding("UTF-8");
		datosAFirmar.setEnveloped(true);
		Document docToSign = null;
		try {
			docToSign = getDocument(this.archivoAFirmar);
		}
		catch (SAXException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		datosAFirmar.setDocument(docToSign);
		datosAFirmar.addObject(new ObjectToSign(new InternObjectToSign("comprobante"), "contenido comprobante", null, "text/xml", null));

		datosAFirmar.setParentSignNode("comprobante");

		return datosAFirmar;
	}

	protected String getSignatureFileName()
	{
		return this.archivoFirmado;
	}

	public String getArchivoAFirmar()
	{
		return this.archivoAFirmar;
	}

	public void setArchivoAFirmar(String archivoAFirmar)
	{
		this.archivoAFirmar = archivoAFirmar;
	}

	public String getArchivoFirmado()
	{
		return this.archivoFirmado;
	}

	public void setArchivoFirmado(String archivoFirmado)
	{
		this.archivoFirmado = archivoFirmado;
	}
}
