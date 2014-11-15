package com.pco.model;

import java.util.List;

public class ComprobanteRetencion {
	private InfoTributaria infoTributaria;
	private InfoCompRetencion infoCompRetencion;
	private List<Impuesto> impuestos;
	private List<InfoAdicional> adicionales;
	
	//Getters && Setters
	public InfoTributaria getInfoTributaria() {
		return infoTributaria;
	}
	public void setInfoTributaria(InfoTributaria infoTributaria) {
		this.infoTributaria = infoTributaria;
	}
	public InfoCompRetencion getInfoCompRetencion() {
		return infoCompRetencion;
	}
	public void setInfoCompRetencion(InfoCompRetencion infoCompRetencion) {
		this.infoCompRetencion = infoCompRetencion;
	}
	public List<Impuesto> getImpuestos() {
		return impuestos;
	}
	public void setImpuestos(List<Impuesto> impuestos) {
		this.impuestos = impuestos;
	}
	public List<InfoAdicional> getAdicionales() {
		return adicionales;
	}
	public void setAdicionales(List<InfoAdicional> adicionales) {
		this.adicionales = adicionales;
	}
}
