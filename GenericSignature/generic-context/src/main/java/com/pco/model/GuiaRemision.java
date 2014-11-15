package com.pco.model;

import java.util.List;

public class GuiaRemision {
	private InfoTributaria infoTributaria;
	private InfoGuiaRemision infoGuiaRemision;
	private List<Destinatario> destinatarios;
	private List<InfoAdicional> adicionales;
	
	//Getters && Setters
	public InfoTributaria getInfoTributaria() {
		return infoTributaria;
	}
	public void setInfoTributaria(InfoTributaria infoTributaria) {
		this.infoTributaria = infoTributaria;
	}
	public InfoGuiaRemision getInfoGuiaRemision() {
		return infoGuiaRemision;
	}
	public void setInfoGuiaRemision(InfoGuiaRemision infoGuiaRemision) {
		this.infoGuiaRemision = infoGuiaRemision;
	}
	public List<Destinatario> getDestinatarios() {
		return destinatarios;
	}
	public void setDestinatarios(List<Destinatario> destinatarios) {
		this.destinatarios = destinatarios;
	}
	public List<InfoAdicional> getAdicionales() {
		return adicionales;
	}
	public void setAdicionales(List<InfoAdicional> adicionales) {
		this.adicionales = adicionales;
	}
}
