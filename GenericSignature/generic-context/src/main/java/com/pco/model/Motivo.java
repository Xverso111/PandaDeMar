package com.pco.model;

import java.math.BigDecimal;

public class Motivo {
	private String razon;
	private BigDecimal valor;
	
	//Getters && Setters
	public String getRazon() {
		return razon;
	}
	public void setRazon(String razon) {
		this.razon = razon;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
}
