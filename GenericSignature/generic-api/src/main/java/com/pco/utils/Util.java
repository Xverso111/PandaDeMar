package com.pco.utils;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.pco.model.ComprobanteRetencion;
import com.pco.model.Factura;
import com.pco.model.GuiaRemision;
import com.pco.model.NotaCredito;
import com.pco.model.NotaDebito;

public class Util {
	private boolean generateObjectToXML(String fileName, Object object,
			JAXBContext jc) {
		boolean continuar = true;
		try {
			String stringXmlFile = "xmlDirectory"
					+ System.getProperty("file.separator") + fileName + ".xml";
			File file = new File(stringXmlFile);
			Marshaller m = jc.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(object, file);
		} catch (JAXBException e1) {
			continuar = false;
		}

		return continuar;
	}

	public boolean generateFactura(Factura factura) {

		boolean continuar = true;

		try {
			JAXBContext jc = JAXBContext.newInstance(Factura.class);
			continuar = generateObjectToXML("factura", factura, jc);
		} catch (JAXBException e) {
			continuar = false;
		}

		return continuar;
	}
	
	public boolean generateCompRetencion(ComprobanteRetencion comprobanteRetencion) {

		boolean continuar = true;

		try {
			JAXBContext jc = JAXBContext
					.newInstance(ComprobanteRetencion.class);
			continuar = generateObjectToXML("compRetencion", comprobanteRetencion, jc);
		} catch (JAXBException e) {
			continuar = false;
		}

		return continuar;
	}
	
	public boolean generateGuiaRemision(GuiaRemision guiaRemision) {

		boolean continuar = true;

		try {
			JAXBContext jc = JAXBContext
					.newInstance(GuiaRemision.class);
			continuar = generateObjectToXML("guiaRemision", guiaRemision, jc);
		} catch (JAXBException e) {
			continuar = false;
		}

		return continuar;
	}
	
	public boolean generateNotaCredito(NotaCredito notaCredito) {

		boolean continuar = true;

		try {
			JAXBContext jc = JAXBContext
					.newInstance(NotaCredito.class);
			continuar = generateObjectToXML("notaCredito", notaCredito, jc);
		} catch (JAXBException e) {
			continuar = false;
		}

		return continuar;
	}
	
	public boolean generateNotaDebito(NotaDebito notaDebito) {

		boolean continuar = true;

		try {
			JAXBContext jc = JAXBContext
					.newInstance(NotaDebito.class);
			continuar = generateObjectToXML("notaDebito", notaDebito, jc);
		} catch (JAXBException e) {
			continuar = false;
		}

		return continuar;
	}
	
}
