package com.pco.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "notaCredito")
@XmlType(propOrder = { "infoTributaria", "infoNotaCredito", "detalles",
		"infoAdicional" })
public class NotaCredito extends ComprobanteBase{
	private InfoTributaria infoTributaria;
	private InfoNotaCredito infoNotaCredito;
	private List<Detalle> detalles;
	private List<InfoAdicional> infoAdicional;

	public NotaCredito() {
		//
	}

	public NotaCredito(String id, String version) {
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
	public InfoNotaCredito getInfoNotaCredito() {
		return infoNotaCredito;
	}

	public void setInfoNotaCredito(InfoNotaCredito infoNotaCredito) {
		this.infoNotaCredito = infoNotaCredito;
	}
	@XmlElementWrapper
	@XmlElement(name = "detalle")
	public List<Detalle> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<Detalle> detalles) {
		this.detalles = detalles;
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
