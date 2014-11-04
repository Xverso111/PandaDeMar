package com.pco.converter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.Barcode;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

public class XML2PDF {
	protected static boolean convertXML2PDF(String rutaOrigenXML, String rutaDestinoPDF) {
		String claveAcceso = Utils.getKey(rutaOrigenXML);

		TransformerFactory tFactory = TransformerFactory.newInstance();

		// Cabecera
		try {
			Transformer transformerCabecera = tFactory
					.newTransformer(new StreamSource(
							"./src/main/resoruces/facturaCabeceraXSL.xsl"));
			StringWriter outWriterCabecera = new StringWriter();
			transformerCabecera.transform(new StreamSource(rutaOrigenXML),
					new StreamResult(outWriterCabecera));
			StringBuffer sbCabecera = outWriterCabecera.getBuffer();
			String stringCabecera = sbCabecera.toString();

			Document document = new Document(PageSize.A4);
			PdfWriter pdfWriter = PdfWriter.getInstance(document,
					new FileOutputStream(
							rutaDestinoPDF));
			XMLWorkerHelper worker = XMLWorkerHelper.getInstance();
			document.open();
			worker.parseXHtml(pdfWriter, document, new StringReader(
					stringCabecera));

			// BarCode
			PdfContentByte cb = pdfWriter.getDirectContent();
			Barcode128 uccEan128 = new Barcode128();
			uccEan128.setCodeType(Barcode.CODE128_UCC);
			uccEan128.setCode(claveAcceso);
			document.add(uccEan128.createImageWithBarcode(cb, BaseColor.BLACK,
					BaseColor.BLACK));
			// Detalle
			Transformer transformerDetalle = tFactory
					.newTransformer(new StreamSource(
							"./src/main/resoruces/facturaDetalleXSL.xsl"));
			StringWriter outWriterDetalle = new StringWriter();
			transformerDetalle.transform(new StreamSource(
					rutaOrigenXML),
					new StreamResult(outWriterDetalle));
			StringBuffer sbDetalle = outWriterDetalle.getBuffer();
			String stringDetalle = sbDetalle.toString();
			worker.parseXHtml(pdfWriter, document, new StringReader(
					stringDetalle));

			document.close();
		} catch (TransformerException | DocumentException | IOException e) {
			return false;
		}

		return true;

	}
}
