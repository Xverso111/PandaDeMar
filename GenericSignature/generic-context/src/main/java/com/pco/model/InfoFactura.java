package com.pco.model;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "infoFactura")
@XmlType(propOrder = {"guiaRemision",
		"totalDescuento", "totalConImpuestos", "propina", "importeTotal" })
public class InfoFactura extends InfoComprobanteBase {

	private String guiaRemision;
	private BigDecimal totalDescuento;
	private List<Impuesto> totalConImpuestos;
	private BigDecimal propina;
	private BigDecimal importeTotal;

	public InfoFactura() {
		//
	}

	public InfoFactura(String fechaEmision, String dirEstablecimiento,
			Integer contribuyenteEspecial, String obligadoContabilidad,
			String tipoIdentificacionComprador, String guiaRemision,
			String razonSocialComprador, String identificacionComprador,
			BigDecimal totalSinImpuestos, BigDecimal totalDescuento,
			List<Impuesto> totalConImpuestos, BigDecimal propina,
			BigDecimal importeTotal, String moneda) {
		setFechaEmision(fechaEmision);
		setDirEstablecimiento(dirEstablecimiento);
		setContribuyenteEspecial(contribuyenteEspecial);
		setObligadoContabilidad(obligadoContabilidad);
		setTipoIdentificacionComprador(tipoIdentificacionComprador);
		this.guiaRemision = guiaRemision;
		setRazonSocialComprador(razonSocialComprador);
		setIdentificacionComprador(identificacionComprador);
		setTotalSinImpuestos(totalSinImpuestos);
		setTotalDescuento(totalDescuento);
		this.totalConImpuestos = totalConImpuestos;
		this.propina = propina;
		this.importeTotal = importeTotal;
		setMoneda(moneda);
	}

	// Getters && Setters
	@XmlElement
	public String getGuiaRemision() {
		return guiaRemision;
	}

	public void setGuiaRemision(String guiaRemision) {
		this.guiaRemision = guiaRemision;
	}

	@XmlElement
	public BigDecimal getTotalDescuento() {
		return totalDescuento;
	}

	public void setTotalDescuento(BigDecimal totalDescuento) {
		this.totalDescuento = totalDescuento;
	}

	@XmlElementWrapper
	@XmlElement(name = "totalImpuesto")
	public List<Impuesto> getTotalConImpuestos() {
		return totalConImpuestos;
	}

	public void setTotalConImpuestos(List<Impuesto> totalConImpuestos) {
		this.totalConImpuestos = totalConImpuestos;
	}

	@XmlElement
	public BigDecimal getPropina() {
		return propina;
	}

	public void setPropina(BigDecimal propina) {
		this.propina = propina;
	}

	@XmlElement
	public BigDecimal getImporteTotal() {
		return importeTotal;
	}

	public void setImporteTotal(BigDecimal importeTotal) {
		this.importeTotal = importeTotal;
	}
}
