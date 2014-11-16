package com.pco.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.pco.utils.Util;

public class ModelToXMLTest {

	@Test
	public void ShouldGenerateFactura() {
		// Principal
		Factura f = new Factura("comprobante", "1.0.0");

		// Info Tributaria
		f.setInfoTributaria(new InfoTributaria(1, 2, "EDISON SUAREZ SILVA",
				"ESU", "1718389321", "1234567890", "01", "02", "03", "123",
				"CARAPUGO"));

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
		Impuesto impuestoDetalle1 = new Impuesto(6, 7, null,
				BigDecimal.valueOf(20), BigDecimal.valueOf(82.34),
				BigDecimal.valueOf(190.35));
		Impuesto impuestoDetalle2 = new Impuesto(160, 170, null,
				BigDecimal.valueOf(50), BigDecimal.valueOf(92.54),
				BigDecimal.valueOf(240.55));

		List<Impuesto> impuestosDetalle = new ArrayList<Impuesto>();
		impuestosDetalle.add(impuestoDetalle1);
		impuestosDetalle.add(impuestoDetalle2);

		// Detalles
		List<Detalle> detalles = new ArrayList<Detalle>();
		Detalle detalle = new Detalle(null, null, "12", "22", "DETALLE TEST",
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

	@Test
	public void ShouldGenerateCompRetencion() {
		// Principal
		ComprobanteRetencion cr = new ComprobanteRetencion("comprobante",
				"1.0.0");
		// Info Tributaria
		cr.setInfoTributaria(new InfoTributaria(8, 9, "GRACE PAOLA CANO",
				"GPC", "1719348765001", "0987655", "10", "12", "13", "890",
				"CARAPUGO 2"));

		// Info Comp Retencion
		cr.setInfoCompRetencion(new InfoCompRetencion("15/11/2014",
				"Rodrigo Moreno S/N Francisco García", 5348, "SI", "04",
				"Juan Pablo Chávez Núñez", "1713328506001", "03/2012"));

		// Impuestos
		Impuesto impuesto1 = new Impuesto(1, BigDecimal.valueOf(10904.50),
				"323B1", 2, BigDecimal.valueOf(218.09), "01",
				"002001000000001", "20/01/2012");

		Impuesto impuesto2 = new Impuesto(6, BigDecimal.valueOf(2000), "4580",
				5, BigDecimal.valueOf(100), "12", "002001000000001",
				"21/01/2012");

		List<Impuesto> impuestos = new ArrayList<Impuesto>();
		impuestos.add(impuesto1);
		impuestos.add(impuesto2);

		cr.setImpuestos(impuestos);

		// Info Adicional
		List<InfoAdicional> infoAdicionalList = new ArrayList<InfoAdicional>();
		InfoAdicional ia1 = new InfoAdicional("ConvenioDobleTributacion",
				"MA123456");
		InfoAdicional ia2 = new InfoAdicional("documentoIFIS", "BP2010-01-0014");
		InfoAdicional ia3 = new InfoAdicional(
				"valorpagadoIRsociedaddividendos", "20000");
		infoAdicionalList.add(ia1);
		infoAdicionalList.add(ia2);
		infoAdicionalList.add(ia3);
		cr.setInfoAdicional(infoAdicionalList);

		Util util = new Util();
		util.generateCompRetencion(cr);
	}

	@Test
	public void ShouldGenerateGuiaRemision() {
		// Principal
		GuiaRemision gr = new GuiaRemision("comprobante", "1.0.0");

		// Info Tributaria
		gr.setInfoTributaria(new InfoTributaria(
				1,
				1,
				"Distribuidora de Suministros Nacional S.A",
				"Empresa Importadora y Exportadora de Piezas y Partes de Equipos de Oficina",
				"1792146739001",
				"2110201106179214673900100110020010000000011234567815", "06",
				"002", "001", "000000001",
				"Enrique Guerrero Portilla OE1-34 AV. Galo Plaza Lasso"));

		// Info Guia Remision
		gr.setInfoGuiaRemision(new InfoGuiaRemision(
				"Sebastián Moreno S/N Francisco García",
				"Av. Eloy Alfaro 34 y Av. Libertad Esq.", "Transportes S.A.",
				"04", "1796875790001",
				"Contribuyente Regimen Simplificado RISE", "SI", 5368,
				"21/10/2011", "22/10/2011", "MCL0827"));

		// Destinatarios
		List<Destinatario> destinatarios = new ArrayList<Destinatario>();
		// Detalles Adicionales
		List<DetalleAdicional> detallesAdicionales = new ArrayList<DetalleAdicional>();
		DetalleAdicional da1 = new DetalleAdicional("Marca", "Chevrolet");
		DetalleAdicional da2 = new DetalleAdicional("Modelo", "2012");
		DetalleAdicional da3 = new DetalleAdicional("Chasis",
				"8LDETA03V20003289");

		detallesAdicionales.add(da1);
		detallesAdicionales.add(da2);
		detallesAdicionales.add(da3);
		// Detalles
		List<Detalle> detalles = new ArrayList<Detalle>();
		Detalle detalle = new Detalle("125BJC-01", "1234D56789-A",
				"CAMIONETA 4X4 DIESEL 3.7", BigDecimal.valueOf(10.00),
				detallesAdicionales);
		detalles.add(detalle);

		Destinatario destinatario = new Destinatario("1716849140001",
				"Alvarez Mina John Henry",
				"Av. Simón Bolívar S/N Intercambiador",
				"Venta de Maquinaria de Impresión", "0041324846887", "001",
				"Quito – Cayambe - Otavalo", "01", "002-001-000000001",
				"2110201116302517921467390011234567891", "21/10/2011", detalles);
		destinatarios.add(destinatario);

		gr.setDestinatarios(destinatarios);

		// Info Adicional
		List<InfoAdicional> infoAdicionalList = new ArrayList<InfoAdicional>();
		InfoAdicional ia1 = new InfoAdicional("TELEFONO", "098568541");
		InfoAdicional ia2 = new InfoAdicional("E-MAIL", "info@organizacion.com");
		InfoAdicional ia3 = new InfoAdicional("SUCURSAL 03",
				"Guayaquil–12 de Octubre y Universo");
		infoAdicionalList.add(ia1);
		infoAdicionalList.add(ia2);
		infoAdicionalList.add(ia3);
		gr.setInfoAdicional(infoAdicionalList);

		Util util = new Util();
		util.generateGuiaRemision(gr);
	}

	@Test
	public void ShouldGenerateNotaCredito() {
		// Principal
		NotaCredito nc = new NotaCredito("comprobante", "1.0.0");
		// Info Tributaria
		nc.setInfoTributaria(new InfoTributaria(1, 1,
				"Distribuidora de Suministros Nacional S.A.",
				"Empresa Importadora y Exportadora de Piezas",
				"1792146739001001",
				"2110201104179214673900110020010000000011234567812", "04",
				"002", "001", "000000001",
				"ENRIQUE GUERRERO PORTILLA OE1-34 AV. GALO PLAZA LASSO"));

		List<Impuesto> totalConImpuestos = new ArrayList<Impuesto>();
		Impuesto i1 = new Impuesto(3, 3072, BigDecimal.valueOf(295000.00),
				BigDecimal.valueOf(14750.00));
		Impuesto i2 = new Impuesto(2, 2, BigDecimal.valueOf(339250.25),
				BigDecimal.valueOf(37170.00));
		totalConImpuestos.add(i1);
		totalConImpuestos.add(i2);

		nc.setInfoNotaCredito(new InfoNotaCredito("21/10/2012",
				"Sebastián Moreno S/N Francisco García", "04",
				"PRUEBAS SERVICIO DERENTAS INTERNAS", "1713328506001", 5368,
				"SI", "Contribuyente Régimen Simplificado RISE", "01",
				"002-001-000000001", "21/10/2011", BigDecimal
						.valueOf(295000.00), BigDecimal.valueOf(346920.00),
				"DOLAR", totalConImpuestos, "DEVOLUCION"));

		// Detalles
		List<DetalleAdicional> detallesAdicionales = new ArrayList<DetalleAdicional>();
		DetalleAdicional d1 = new DetalleAdicional("Marca", "Chevrolet");
		DetalleAdicional d2 = new DetalleAdicional("Modelo", "2012");
		DetalleAdicional d3 = new DetalleAdicional("Chasis",
				"8LDETA03V20003289");
		detallesAdicionales.add(d1);
		detallesAdicionales.add(d2);
		detallesAdicionales.add(d3);

		// Impuestos
		Impuesto impuestoDetalle1 = new Impuesto(3, 3072, null,
				BigDecimal.valueOf(5), BigDecimal.valueOf(295000.00),
				BigDecimal.valueOf(14750.00));
		Impuesto impuestoDetalle2 = new Impuesto(2, 2, null,
				BigDecimal.valueOf(12), BigDecimal.valueOf(309750.00),
				BigDecimal.valueOf(37170.00));

		List<Impuesto> impuestosDetalle = new ArrayList<Impuesto>();
		impuestosDetalle.add(impuestoDetalle1);
		impuestosDetalle.add(impuestoDetalle2);

		// Detalles
		List<Detalle> detalles = new ArrayList<Detalle>();
		Detalle detalle = new Detalle("125BJC-01", "1234D56789-A", null, null,
				"CAMIONETA 4X4 DIESEL 3.7", BigDecimal.valueOf(10.00),
				BigDecimal.valueOf(30000.00), BigDecimal.valueOf(5000.00),
				BigDecimal.valueOf(295000.00), detallesAdicionales,
				impuestosDetalle);

		detalles.add(detalle);

		nc.setDetalles(detalles);

		// Info Adicional
		List<InfoAdicional> infoAdicionalList = new ArrayList<InfoAdicional>();
		InfoAdicional ia1 = new InfoAdicional("E-MAIL", "info@organizacion.com");
		infoAdicionalList.add(ia1);

		nc.setInfoAdicional(infoAdicionalList);

		Util util = new Util();
		util.generateNotaCredito(nc);
	}

	@Test
	public void ShouldGenerateNotaDebito() {
		// Principal
		NotaDebito nd = new NotaDebito("comprobante", "1.0.0");
		// Info Tributaria
		nd.setInfoTributaria(new InfoTributaria(1, 1,
				"Distribuidora de Suministros Nacional S.A.",
				"Empresa Importadora y Exportadora de Piezas",
				"1792146739001001",
				"2110201104179214673900110020010000000011234567812", "05",
				"002", "001", "000000001",
				"Enrique Guerrero Portilla OE1-34 AV. GALO PLAZA LASSO"));

		// Info Nota Debito
		List<Impuesto> impuestos = new ArrayList<Impuesto>();
		// Impuestos
		Impuesto impuestoDetalle = new Impuesto(2, 2, null,
				BigDecimal.valueOf(12.00), BigDecimal.valueOf(1000.00),
				BigDecimal.valueOf(120.00));

		impuestos.add(impuestoDetalle);

		nd.setInfoNotaDebito(new InfoNotaDebito("06/03/2012",
				"Rodrigo Moreno S/N Francisco Cuesta", "04",
				"PRUEBAS SERVICIO DERENTAS INTERNAS", "1713328506001", 5368,
				"SI", "Contribuyente RISE", "01", "002-001-000000001",
				"21/10/2011", BigDecimal.valueOf(1000.00), impuestos,
				BigDecimal.valueOf(1000.00)));

		// Motivos
		List<Motivo> motivos = new ArrayList<Motivo>();
		Motivo motivo = new Motivo("Interés por mora",
				BigDecimal.valueOf(1000.00));
		motivos.add(motivo);

		nd.setMotivos(motivos);

		// Info Adicional
		List<InfoAdicional> infoAdicionalList = new ArrayList<InfoAdicional>();
		InfoAdicional ia1 = new InfoAdicional("TELEFONO", "098568541");
		InfoAdicional ia2 = new InfoAdicional("E-MAIL", "info@organizacion.com");
		InfoAdicional ia3 = new InfoAdicional("DIRECCION DEL ADQUIRENTE",
				"AMERICA N32- OE1");
		infoAdicionalList.add(ia1);
		infoAdicionalList.add(ia2);
		infoAdicionalList.add(ia3);
		nd.setInfoAdicional(infoAdicionalList);

		Util util = new Util();
		util.generateNotaDebito(nd);
	}
}
