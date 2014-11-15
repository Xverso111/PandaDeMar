package com.pco.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "factura")
@XmlType(propOrder = { "infoTributaria", "infoFactura", "detalles", "retenciones", "infoAdicional" })
public class Factura extends ComprobanteBase{
	
	private InfoTributaria infoTributaria;
	private InfoFactura infoFactura;
	private List<Detalle> detalles;
	private List<Retencion> retenciones;
	private List<InfoAdicional> infoAdicional;
	
	public Factura(){
		//
	}
	
	public Factura(String id, String version){
		setId(id);
		setVersion(version);
	}
	
	//Getters && Setters
	@XmlElement(name = "infoTributaria")
	public InfoTributaria getInfoTributaria() {
		return infoTributaria;
	}
	public void setInfoTributaria(InfoTributaria infoTributaria) {
		this.infoTributaria = infoTributaria;
	}
	@XmlElement(name = "infoFactura")
	public InfoFactura getInfoFactura() {
		return infoFactura;
	}
	public void setInfoFactura(InfoFactura infoFactura) {
		this.infoFactura = infoFactura;
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
	@XmlElement(name = "retencion")
	public List<Retencion> getRetenciones() {
		return retenciones;
	}
	public void setRetenciones(List<Retencion> retenciones) {
		this.retenciones = retenciones;
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
