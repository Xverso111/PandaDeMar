package com.pco.model;

import java.util.List;

public class NotaCredito {
	private InfoTributaria infoTributaria;
	private InfoNotaCredito infoNotaCredito;
	private List<Detalle> detalles;
	private List<InfoAdicional> adicionales;
	
	//Getters && Setters
	public InfoTributaria getInfoTributaria() {
		return infoTributaria;
	}
	public void setInfoTributaria(InfoTributaria infoTributaria) {
		this.infoTributaria = infoTributaria;
	}
	public InfoNotaCredito getInfoNotaCredito() {
		return infoNotaCredito;
	}
	public void setInfoNotaCredito(InfoNotaCredito infoNotaCredito) {
		this.infoNotaCredito = infoNotaCredito;
	}
	public List<Detalle> getDetalles() {
		return detalles;
	}
	public void setDetalles(List<Detalle> detalles) {
		this.detalles = detalles;
	}
	public List<InfoAdicional> getAdicionales() {
		return adicionales;
	}
	public void setAdicionales(List<InfoAdicional> adicionales) {
		this.adicionales = adicionales;
	}
}
