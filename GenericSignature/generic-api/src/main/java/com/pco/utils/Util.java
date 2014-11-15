package com.pco.utils;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.pco.model.Factura;

public class Util {
	private boolean generateObjectToXML(String fileName, Object object,
			JAXBContext jc) {
		boolean continuar = true;
		try {
			String stringXmlFile = "./xmlDirectory"
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
}
