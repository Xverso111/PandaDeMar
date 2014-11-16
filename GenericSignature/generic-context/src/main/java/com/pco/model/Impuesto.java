package com.pco.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;

public class Impuesto {
	private Integer codigo;
	private Integer codigoPorcentaje;
	private BigDecimal descuentoAdicional;
	private BigDecimal tarifa;
	private Integer porcentajeRetener;
	private BigDecimal valorRetenido;
	private BigDecimal baseImponible;
	private BigDecimal valor;
	private String codDocSustento;
	private String numDocSustento;
	private String fechaEmisionDocSustento;
	private String codigoRetecion;

	public Impuesto() {
		//
	}

	public Impuesto(Integer codigo, BigDecimal baseImponible) {
		this.codigo = codigo;
		this.baseImponible = baseImponible;
	}

	public Impuesto(Integer codigo, Integer codigoPorcentaje,
			BigDecimal descuentoAdicional, BigDecimal tarifa,
			BigDecimal baseImponible, BigDecimal valor) {
		this(codigo, baseImponible);
		this.codigoPorcentaje = codigoPorcentaje;
		this.descuentoAdicional = descuentoAdicional;
		this.tarifa = tarifa;
		this.valor = valor;

	}
	
	public Impuesto(Integer codigo, Integer codigoPorcentaje,
			BigDecimal baseImponible, BigDecimal valor) {
		this(codigo, baseImponible);
		this.codigoPorcentaje = codigoPorcentaje;
		this.valor = valor;

	}

	public Impuesto(Integer codigo, BigDecimal baseImponible,
			String codigoRetencion, Integer porcentajeRetener,
			BigDecimal valorRetenido, String codDocSustento,
			String numDocSustento, String fechaEmisionDocSustento) {
		this(codigo, baseImponible);
		this.codigoRetecion = codigoRetencion;
		this.porcentajeRetener = porcentajeRetener;
		this.valorRetenido = valorRetenido;
		this.codDocSustento = codDocSustento;
		this.numDocSustento = numDocSustento;
		this.fechaEmisionDocSustento = fechaEmisionDocSustento;
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
	public BigDecimal getTarifa() {
		return tarifa;
	}

	public void setTarifa(BigDecimal tarifa) {
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

	public String getCodigoRetecion() {
		return codigoRetecion;
	}

	public void setCodigoRetecion(String codigoRetecion) {
		this.codigoRetecion = codigoRetecion;
	}
}
