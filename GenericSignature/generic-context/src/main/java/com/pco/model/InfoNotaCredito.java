package com.pco.model;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class InfoNotaCredito extends InfoComprobantePadre {
	private BigDecimal valorModificacion;
	private List<Impuesto> totalConImpuestos;
	private String motivo;

	public InfoNotaCredito() {
		//
	}

	public InfoNotaCredito(String fechaEmision, String dirEstablecimiento,
			String tipoIdentificacionComprador, String razonSocialComprador,
			String identificacionComprador, Integer contribuyenteEspecial,
			String obligadoContabilidad, String rise, String codDocModificado,
			String numDocModificado, String fechaEmisionDocSustento,
			BigDecimal totalSinImpuestos, BigDecimal valorModificacion,
			String moneda, List<Impuesto> totalConImpuestos, String motivo) {
		setFechaEmision(fechaEmision);
		setDirEstablecimiento(dirEstablecimiento);
		setTipoIdentificacionComprador(tipoIdentificacionComprador);
		setRazonSocialComprador(razonSocialComprador);
		setIdentificacionComprador(identificacionComprador);
		setContribuyenteEspecial(contribuyenteEspecial);
		setObligadoContabilidad(obligadoContabilidad);
		setRise(rise);
		setCodDocModificado(codDocModificado);
		setNumDocModificado(numDocModificado);
		setFechaEmisionDocSustento(fechaEmisionDocSustento);
		setTotalSinImpuestos(totalSinImpuestos);
		this.valorModificacion = valorModificacion;
		setMoneda(moneda);
		this.totalConImpuestos = totalConImpuestos;
		this.motivo = motivo;
	}

	// Getters && Setters
	@XmlElement
	public BigDecimal getValorModificacion() {
		return valorModificacion;
	}

	public void setValorModificacion(BigDecimal valorModificacion) {
		this.valorModificacion = valorModificacion;
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
	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
}
