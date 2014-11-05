package com.pco.converter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Map.Entry;

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
	public void convertXML2PDF(String sourceDir, String targetDir) {

		Utils utils = new Utils();

		Path sourceDirectoryPath = Paths.get(sourceDir);
		Map<String, Path> xmlFiles = utils
				.getXmlFilesOnSourceDirectory(sourceDirectoryPath);
		for (Entry<String, Path> xmlFile : xmlFiles.entrySet()) {
			String stringXmlFile = xmlFile.getValue().toString();
			System.out.println("PDF - SourceDir: " + stringXmlFile);
			int idxFileSeparator = stringXmlFile.lastIndexOf(System.getProperty("file.separator"));
			int idxPeriod = stringXmlFile.lastIndexOf(".");
			String fileName = stringXmlFile.substring(idxFileSeparator+1, idxPeriod);
			String stringPdfFile = targetDir+System.getProperty("file.separator")+fileName+".pdf";
			System.out.println("PDF - TargetDir: " + stringPdfFile);
			
			transformFile(stringXmlFile, stringPdfFile);
		}

	}

	private boolean transformFile(String rutaOrigenXML, String rutaDestinoPDF) {

		Utils utils = new Utils();

		String claveAcceso = utils.getKey(rutaOrigenXML);

		TransformerFactory tFactory = TransformerFactory.newInstance();

		// Cabecera
		try {
			Transformer transformerCabecera = tFactory
					.newTransformer(new StreamSource(
							"../generic-pdf-creator/src/main/resources/facturaCabeceraXSL.xsl"));
			StringWriter outWriterCabecera = new StringWriter();
			transformerCabecera.transform(new StreamSource(rutaOrigenXML),
					new StreamResult(outWriterCabecera));
			StringBuffer sbCabecera = outWriterCabecera.getBuffer();
			String stringCabecera = sbCabecera.toString();

			Document document = new Document(PageSize.A4);
			PdfWriter pdfWriter = PdfWriter.getInstance(document,
					new FileOutputStream(rutaDestinoPDF));
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
							"../generic-pdf-creator/src/main/resources/facturaDetalleXSL.xsl"));
			StringWriter outWriterDetalle = new StringWriter();
			transformerDetalle.transform(new StreamSource(rutaOrigenXML),
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
