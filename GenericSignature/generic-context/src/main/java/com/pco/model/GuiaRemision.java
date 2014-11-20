package com.pco.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "guiaRemision")
@XmlType(propOrder = { "infoTributaria", "infoGuiaRemision", "destinatarios",
		"infoAdicional" })
public class GuiaRemision extends ComprobanteBase {
	private InfoTributaria infoTributaria;
	private InfoGuiaRemision infoGuiaRemision;
	private List<Destinatario> destinatarios;
	private List<InfoAdicional> infoAdicional;

	public GuiaRemision() {
		//
	}

	public GuiaRemision(String id, String version) {
		setId(id);
		setVersion(version);
	}

	// Getters && Setters
	@XmlElement(name = "infoTributaria")
	public InfoTributaria getInfoTributaria() {
		return infoTributaria;
	}

	public void setInfoTributaria(InfoTributaria infoTributaria) {
		this.infoTributaria = infoTributaria;
	}

	@XmlElement(name = "infoGuiaRemision")
	public InfoGuiaRemision getInfoGuiaRemision() {
		return infoGuiaRemision;
	}

	public void setInfoGuiaRemision(InfoGuiaRemision infoGuiaRemision) {
		this.infoGuiaRemision = infoGuiaRemision;
	}

	@XmlElementWrapper
	@XmlElement(name = "destinatario")
	public List<Destinatario> getDestinatarios() {
		return destinatarios;
	}

	public void setDestinatarios(List<Destinatario> destinatarios) {
		this.destinatarios = destinatarios;
	}

	@XmlElementWrapper
	@XmlElement(name = "campoAdicional")
	public List<InfoAdicional> getInfoAdicional() {
		return infoAdicional;
	}

	public void setInfoAdicional(List<InfoAdicional> infoAdicional) {
		this.infoAdicional = infoAdicional;
	}
}
