package com.pco.model;

import java.math.BigDecimal;
import java.util.List;

public class InfoNotaDebito extends InfoComprobantePadre{
	private List<Impuesto> impuestos;
	private BigDecimal valorTotal;
	
	//Getters && Setters
	public List<Impuesto> getImpuestos() {
		return impuestos;
	}
	public void setImpuestos(List<Impuesto> impuestos) {
		this.impuestos = impuestos;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
}
