package com.pco.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;

public class Motivo {
	private String razon;
	private BigDecimal valor;

	public Motivo() {
		//
	}

	public Motivo(String razon, BigDecimal valor) {
		this.razon = razon;
		this.valor = valor;
	}

	// Getters && Setters
	@XmlElement
	public String getRazon() {
		return razon;
	}

	public void setRazon(String razon) {
		this.razon = razon;
	}

	@XmlElement
	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
}
