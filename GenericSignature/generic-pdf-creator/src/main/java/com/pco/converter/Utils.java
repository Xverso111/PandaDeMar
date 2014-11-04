package com.pco.converter;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Utils {

	protected static String getKey(String rutaXML) {
		String claveAcceso = "";

		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(rutaXML);
			XPathFactory xPathfactory = XPathFactory.newInstance();
			XPath xpath = xPathfactory.newXPath();
			XPathExpression expr = xpath
					.compile("//factura/infoTributaria/claveAcceso");
			NodeList nl = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
			if (nl.getLength() > 0) {
				Node nodo = nl.item(0);
				claveAcceso = nodo.getFirstChild().getNodeValue();
			}
		} catch (XPathExpressionException | DOMException
				| ParserConfigurationException | SAXException | IOException e) {
			claveAcceso = "";
		}

		return claveAcceso;
	}
}
