package com.pco.signature;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.CertificateException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import es.mityc.firmaJava.libreria.utilidades.UtilidadTratarNodo;
import es.mityc.firmaJava.libreria.xades.DataToSign;
import es.mityc.firmaJava.libreria.xades.FirmaXML;
import es.mityc.javasign.pkstore.CertStoreException;
import es.mityc.javasign.pkstore.IPKStoreManager;
import es.mityc.javasign.pkstore.keystore.KSStore;

public abstract class FirmaPKCS12Generica
{
  private String archivoPKCS12;
  private String contraseniaPKCS12;
  private String directorioSalidaFirma;

  protected void execute()
  {
    IPKStoreManager storeManager = getPKStoreManager();
    if (storeManager == null) {
      System.err.println("El gestor de claves no se ha obtenido correctamente.");
      return;
    }

    X509Certificate certificado = getFirstCertificate(storeManager);

    if (certificado == null) {
      System.err.println("No existe ningun certificado para firmar.");
      return;
    }
    try
    {
      System.err.println("getType: " + certificado.getType());
      System.err.println("getClass: " + certificado.getClass());
      System.err.println("getKeyUsage: " + certificado.getKeyUsage());
      System.err.println("ExtendedKeyUsage: " + certificado.getExtendedKeyUsage());
    } catch (CertificateParsingException e1) {
      e1.printStackTrace();
    }

    PrivateKey privateKey;
    try
    {
      privateKey = storeManager.getPrivateKey(certificado);
    } catch (CertStoreException e) {
      System.err.println("Error al acceder al obtener la clave privada del almacen.");
      return;
    }

    Provider provider = storeManager.getProvider(certificado);

    DataToSign datosAFirmar = createDataToSign();

    Document documentoFirmado = null;
    try
    {
      FirmaXML firma = createFirmaXML();
      Object[] res = firma.signFile(certificado, datosAFirmar, privateKey, provider);
      documentoFirmado = (Document)res[0];
    } catch (Exception ex) {
      System.err.println("Error realizando la firma");
      ex.printStackTrace();
      return;
    }

    saveDocumentToFile(documentoFirmado, getSignatureFileName());
  }

  protected abstract DataToSign createDataToSign();

  protected abstract String getSignatureFileName();

  protected FirmaXML createFirmaXML()
  {
    return new FirmaXML();
  }

  private void saveDocumentToFile(Document document, String pathfile)
  {
	  FileOutputStream fos=null;
    try
    {
      fos= new FileOutputStream(pathfile);
      UtilidadTratarNodo.saveDocumentToOutputStream(document, fos, true);
    } catch (FileNotFoundException e) {
      System.err.println("FileNotFoundException: Error al salvar el documento");
      e.printStackTrace();
      System.exit(-1);
    }finally{
    	if(fos!=null){
    		try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
  }

  protected Document getDocument(String resource)
    throws SAXException, IOException, ParserConfigurationException
  {
    Document doc = null;
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    dbf.setNamespaceAware(true);
    doc = dbf.newDocumentBuilder().parse(getClass().getResourceAsStream(resource));

    return doc;
  }

  protected String getDocumentAsString(String resource)
    throws SAXException, IOException, ParserConfigurationException
  {
    Document doc = getDocument(resource);
    TransformerFactory tfactory = TransformerFactory.newInstance();

    StringWriter stringWriter = new StringWriter();
    try {
      Transformer serializer = tfactory.newTransformer();
      serializer.transform(new DOMSource(doc), new StreamResult(stringWriter));
    } catch (TransformerException e) {
      System.err.println("Error al imprimir el documento");
    }

    return stringWriter.toString();
  }

  private IPKStoreManager getPKStoreManager()
  {
    IPKStoreManager storeManager = null;
    try {
      KeyStore ks = KeyStore.getInstance("PKCS12");
      ks.load(new FileInputStream(this.archivoPKCS12), this.contraseniaPKCS12.toCharArray());
      storeManager = new KSStore(ks, new PassStoreKSGenerica(this.contraseniaPKCS12));
    } catch (KeyStoreException ex) {
      System.err.println("No se puede generar KeyStore PKCS12");
      ex.printStackTrace();
      System.exit(-1);
    } catch (NoSuchAlgorithmException ex) {
      System.err.println("No se puede generar KeyStore PKCS12");
      ex.printStackTrace();
      System.exit(-1);
    } catch (CertificateException ex) {
      System.err.println("No se puede generar KeyStore PKCS12");
      ex.printStackTrace();
      System.exit(-1);
    } catch (IOException ex) {
      System.err.println("No se puede generar KeyStore PKCS12");
      ex.printStackTrace();
      System.exit(-1);
    }
    return storeManager;
  }

  private X509Certificate getFirstCertificate(IPKStoreManager storeManager)
  {
    @SuppressWarnings("rawtypes")
	List certs = null;
    try {
      certs = storeManager.getSignCertificates();
    } catch (CertStoreException ex) {
      System.err.println("Fallo obteniendo listado de certificados");
      System.exit(-1);
    }
    if ((certs == null) || (certs.size() == 0)) {
      System.err.println("Lista de certificados vacia");
      System.exit(-1);
    }

    X509Certificate certificado = (X509Certificate)certs.get(0);
    return certificado;
  }

  public String getArchivoPKCS12()
  {
    return this.archivoPKCS12;
  }

  public void setArchivoPKCS12(String archivoPKCS12)
  {
    this.archivoPKCS12 = archivoPKCS12;
  }

  public String getContraseniaPKCS12()
  {
    return this.contraseniaPKCS12;
  }

  public void setContraseniaPKCS12(String contraseniaPKCS12)
  {
    this.contraseniaPKCS12 = contraseniaPKCS12;
  }

  public String getDirectorioSalidaFirma()
  {
    return this.directorioSalidaFirma;
  }

  public void setDirectorioSalidaFirma(String directorioSalidaFirma)
  {
    this.directorioSalidaFirma = directorioSalidaFirma;
  }
}