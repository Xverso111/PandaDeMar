package com.pco.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "comprobanteRetencion")
@XmlType(propOrder = { "infoTributaria", "infoCompRetencion", "impuestos",
		"infoAdicional" })
public class ComprobanteRetencion extends ComprobanteBase {
	private InfoTributaria infoTributaria;
	private InfoCompRetencion infoCompRetencion;
	private List<Impuesto> impuestos;
	private List<InfoAdicional> infoAdicional;

	public ComprobanteRetencion(){
		//
	}
	
	public ComprobanteRetencion(String id, String version) {
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
	@XmlElement(name = "infoCompRetencion")
	public InfoCompRetencion getInfoCompRetencion() {
		return infoCompRetencion;
	}

	public void setInfoCompRetencion(InfoCompRetencion infoCompRetencion) {
		this.infoCompRetencion = infoCompRetencion;
	}
	@XmlElementWrapper
	@XmlElement(name = "impuesto")
	public List<Impuesto> getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(List<Impuesto> impuestos) {
		this.impuestos = impuestos;
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
