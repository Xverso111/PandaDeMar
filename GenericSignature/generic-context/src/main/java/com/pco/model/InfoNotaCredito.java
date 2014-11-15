package com.pco.model;

import java.math.BigDecimal;
import java.util.List;

public class InfoNotaCredito extends InfoComprobantePadre{
	private BigDecimal valorModificacion;
	private List<Impuesto> impuestos;
	private String motivo;
	
	//Getters && Setters
	public BigDecimal getValorModificacion() {
		return valorModificacion;
	}
	public void setValorModificacion(BigDecimal valorModificacion) {
		this.valorModificacion = valorModificacion;
	}
	public List<Impuesto> getImpuestos() {
		return impuestos;
	}
	public void setImpuestos(List<Impuesto> impuestos) {
		this.impuestos = impuestos;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
}
