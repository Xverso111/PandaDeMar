package com.pco.model;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class InfoNotaDebito extends InfoComprobantePadre {
	private List<Impuesto> impuestos;
	private BigDecimal valorTotal;

	public InfoNotaDebito() {
		//
	}

	public InfoNotaDebito(String fechaEmision, String dirEstablecimiento,
			String tipoIdentificacionComprador, String razonSocialComprador,
			String identificacionComprador, Integer contribuyenteEspecial,
			String obligadoContabilidad, String rise, String codDocModificado,
			String numDocModificado, String fechaEmisionDocSustento,
			BigDecimal totalSinImpuestos, List<Impuesto> impuestos,
			BigDecimal valorTotal) {
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
		this.impuestos = impuestos;
		this.valorTotal = valorTotal;
	}

	// Getters && Setters
	@XmlElementWrapper
	@XmlElement(name = "impuesto")
	public List<Impuesto> getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(List<Impuesto> impuestos) {
		this.impuestos = impuestos;
	}

	@XmlElement
	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
}
