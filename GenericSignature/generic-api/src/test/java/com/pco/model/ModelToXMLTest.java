package com.pco.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.pco.utils.Util;

public class ModelToXMLTest {

	@Test
	public void ShouldGenerateFactura() {

		Factura f = new Factura("comprobante", "1.0.0");

		// Info Tributaria
		f.setInfoTributaria(new InfoTributaria(1, 2, "EDISON SUAREZ", "ESU",
				"1718389321", "1234567890", "01", "02", "03", "123", "CARAPUGO"));

		// TotalConImpuestos
		Impuesto impuesto1 = new Impuesto(1, 2, BigDecimal.valueOf(25.50),
				null, BigDecimal.valueOf(12.34), BigDecimal.valueOf(120.35));
		Impuesto impuesto2 = new Impuesto(10, 20, null, null,
				BigDecimal.valueOf(22.54), BigDecimal.valueOf(140.55));

		List<Impuesto> impuestos = new ArrayList<Impuesto>();
		impuestos.add(impuesto1);
		impuestos.add(impuesto2);

		// Info Factura
		f.setInfoFactura(new InfoFactura("14/11/2014", "Santa Lucia", 3, "SI",
				"2", "1432", "ANDREA SUAREZ", "1719343616", BigDecimal
						.valueOf(230.06), BigDecimal.valueOf(100.02),
				impuestos, BigDecimal.valueOf(10.50), BigDecimal
						.valueOf(350.23), "DOLAR"));

		// Detalles Adicionales
		List<DetalleAdicional> detallesAdicionales = new ArrayList<DetalleAdicional>();
		DetalleAdicional d1 = new DetalleAdicional("Marca", "Hyundai");
		DetalleAdicional d2 = new DetalleAdicional("Modelo", "2014");
		DetalleAdicional d3 = new DetalleAdicional("Chasis", "1298870");
		detallesAdicionales.add(d1);
		detallesAdicionales.add(d2);
		detallesAdicionales.add(d3);

		// Impuestos
		Impuesto impuestoDetalle1 = new Impuesto(6, 7, null, 20,
				BigDecimal.valueOf(82.34), BigDecimal.valueOf(190.35));
		Impuesto impuestoDetalle2 = new Impuesto(160, 170, null, 50,
				BigDecimal.valueOf(92.54), BigDecimal.valueOf(240.55));

		List<Impuesto> impuestosDetalle = new ArrayList<Impuesto>();
		impuestosDetalle.add(impuestoDetalle1);
		impuestosDetalle.add(impuestoDetalle2);

		// Detalles
		List<Detalle> detalles = new ArrayList<Detalle>();
		Detalle detalle = new Detalle("12", "22", "DETALLE TEST",
				BigDecimal.valueOf(70.0), BigDecimal.valueOf(1.50),
				BigDecimal.valueOf(10), BigDecimal.valueOf(65),
				detallesAdicionales, impuestosDetalle);

		detalles.add(detalle);

		f.setDetalles(detalles);

		// Retenciones
		Retencion retencion1 = new Retencion(16, 17,
				BigDecimal.valueOf(282.34), BigDecimal.valueOf(290.35));
		Retencion retencion2 = new Retencion(460, 470,
				BigDecimal.valueOf(192.54), BigDecimal.valueOf(140.55));

		List<Retencion> retenciones = new ArrayList<Retencion>();
		retenciones.add(retencion1);
		retenciones.add(retencion2);
		f.setRetenciones(retenciones);

		// Info Adicional
		List<InfoAdicional> infoAdicionalList = new ArrayList<InfoAdicional>();
		InfoAdicional ia1 = new InfoAdicional("Codigo Impuesto ISD", "4580");
		InfoAdicional ia2 = new InfoAdicional("Impuesto ISD", "15.42");
		infoAdicionalList.add(ia1);
		infoAdicionalList.add(ia2);
		f.setInfoAdicional(infoAdicionalList);

		Util util = new Util();
		util.generateFactura(f);

	}

}
