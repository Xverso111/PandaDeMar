package com.pco.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "notaDebito")
@XmlType(propOrder = { "infoTributaria", "infoNotaDebito", "motivos",
		"infoAdicional" })
public class NotaDebito extends ComprobanteBase {
	private InfoTributaria infoTributaria;
	private InfoNotaDebito infoNotaDebito;
	private List<Motivo> motivos;
	private List<InfoAdicional> infoAdicional;

	public NotaDebito() {
		//
	}

	public NotaDebito(String id, String version) {
		setId(id);
		setVersion(version);
	}

	// Getters && Setters
	@XmlElement
	public InfoTributaria getInfoTributaria() {
		return infoTributaria;
	}

	public void setInfoTributaria(InfoTributaria infoTributaria) {
		this.infoTributaria = infoTributaria;
	}

	@XmlElement
	public InfoNotaDebito getInfoNotaDebito() {
		return infoNotaDebito;
	}

	public void setInfoNotaDebito(InfoNotaDebito infoNotaDebito) {
		this.infoNotaDebito = infoNotaDebito;
	}

	@XmlElementWrapper
	@XmlElement(name = "motivo")
	public List<Motivo> getMotivos() {
		return motivos;
	}

	public void setMotivos(List<Motivo> motivos) {
		this.motivos = motivos;
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
