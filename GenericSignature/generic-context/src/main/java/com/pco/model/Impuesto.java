package com.pco.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;

public class Impuesto {
	private Integer codigo;
	private Integer codigoPorcentaje;
	private BigDecimal descuentoAdicional;
	private Integer tarifa;
	private Integer porcentajeRetener;
	private BigDecimal valorRetenido;
	private BigDecimal baseImponible;
	private BigDecimal valor;
	private String codDocSustento;
	private String numDocSustento;
	private String fechaEmisionDocSustento;

	public Impuesto() {
		//
	}

	public Impuesto(Integer codigo, Integer codigoPorcentaje,
			BigDecimal descuentoAdicional, Integer tarifa,
			BigDecimal baseImponible, BigDecimal valor) {
		this.codigo = codigo;
		this.codigoPorcentaje = codigoPorcentaje;
		this.descuentoAdicional = descuentoAdicional;
		this.tarifa = tarifa;
		this.baseImponible = baseImponible;
		this.valor = valor;
	}

	// Getters && Setters
	@XmlElement
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@XmlElement
	public Integer getCodigoPorcentaje() {
		return codigoPorcentaje;
	}

	public void setCodigoPorcentaje(Integer codigoPorcentaje) {
		this.codigoPorcentaje = codigoPorcentaje;
	}

	@XmlElement
	public BigDecimal getDescuentoAdicional() {
		return descuentoAdicional;
	}

	public void setDescuentoAdicional(BigDecimal descuentoAdicional) {
		this.descuentoAdicional = descuentoAdicional;
	}

	@XmlElement
	public Integer getTarifa() {
		return tarifa;
	}

	public void setTarifa(Integer tarifa) {
		this.tarifa = tarifa;
	}

	@XmlElement
	public Integer getPorcentajeRetener() {
		return porcentajeRetener;
	}

	public void setPorcentajeRetener(Integer porcentajeRetener) {
		this.porcentajeRetener = porcentajeRetener;
	}

	@XmlElement
	public BigDecimal getValorRetenido() {
		return valorRetenido;
	}

	public void setValorRetenido(BigDecimal valorRetenido) {
		this.valorRetenido = valorRetenido;
	}

	@XmlElement
	public BigDecimal getBaseImponible() {
		return baseImponible;
	}

	public void setBaseImponible(BigDecimal baseImponible) {
		this.baseImponible = baseImponible;
	}

	@XmlElement
	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@XmlElement
	public String getCodDocSustento() {
		return codDocSustento;
	}

	public void setCodDocSustento(String codDocSustento) {
		this.codDocSustento = codDocSustento;
	}

	@XmlElement
	public String getNumDocSustento() {
		return numDocSustento;
	}

	public void setNumDocSustento(String numDocSustento) {
		this.numDocSustento = numDocSustento;
	}

	@XmlElement
	public String getFechaEmisionDocSustento() {
		return fechaEmisionDocSustento;
	}

	public void setFechaEmisionDocSustento(String fechaEmisionDocSustento) {
		this.fechaEmisionDocSustento = fechaEmisionDocSustento;
	}
}
