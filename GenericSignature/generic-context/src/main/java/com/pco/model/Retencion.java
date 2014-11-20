package com.pco.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;

public class Retencion {
	private Integer codigo;
	private Integer codigoPorcentaje;
	private BigDecimal tarifa;
	private BigDecimal valor;

	public Retencion() {
		//
	}

	public Retencion(Integer codigo, Integer codigoPorcentaje,
			BigDecimal tarifa, BigDecimal valor) {
		this.codigo = codigo;
		this.codigoPorcentaje = codigoPorcentaje;
		this.tarifa = tarifa;
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
	public BigDecimal getTarifa() {
		return tarifa;
	}

	public void setTarifa(BigDecimal tarifa) {
		this.tarifa = tarifa;
	}

	@XmlElement
	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
}
