package com.pco.model;

import java.util.List;

public class NotaDebito {
	private InfoTributaria infoTributaria;
	private InfoNotaDebito infoNotaDebito;
	private List<Motivo> motivos;
	private List<InfoAdicional> adicionales;
	
	//Getters && Setters
	public InfoTributaria getInfoTributaria() {
		return infoTributaria;
	}
	public void setInfoTributaria(InfoTributaria infoTributaria) {
		this.infoTributaria = infoTributaria;
	}
	public InfoNotaDebito getInfoNotaDebito() {
		return infoNotaDebito;
	}
	public void setInfoNotaDebito(InfoNotaDebito infoNotaDebito) {
		this.infoNotaDebito = infoNotaDebito;
	}
	public List<Motivo> getMotivos() {
		return motivos;
	}
	public void setMotivos(List<Motivo> motivos) {
		this.motivos = motivos;
	}
	public List<InfoAdicional> getAdicionales() {
		return adicionales;
	}
	public void setAdicionales(List<InfoAdicional> adicionales) {
		this.adicionales = adicionales;
	}
}
