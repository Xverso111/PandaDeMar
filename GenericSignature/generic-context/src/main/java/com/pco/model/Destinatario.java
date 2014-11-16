package com.pco.model;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "identificacionDestinatario", "razonSocialDestinatario",
		"dirDestinatario", "motivoTraslado",
		"docAduaneroUnico", "codEstabDestino", "ruta",
		"codDocSustento", "numDocSustento", "numAutDocSustento",
		"fechaEmisionDocSustento", "detalles" })
public class Destinatario {
	private String identificacionDestinatario;
	private String razonSocialDestinatario;
	private String dirDestinatario;
	private String motivoTraslado;
	private String docAduaneroUnico;
	private String codEstabDestino;
	private String ruta;
	private String codDocSustento;
	private String numDocSustento;
	private String numAutDocSustento;
	private String fechaEmisionDocSustento;
	private List<Detalle> detalles;
	
	public Destinatario(){
		//
	}
	
	public Destinatario(String identificacionDestinatario,
			String razonSocialDestinatario, String dirDestinatario,
			String motivoTraslado, String docAduaneroUnico,
			String codEstabDestino, String ruta, String codDocSustento,
			String numDocSustento, String numAutDocSustento,
			String fechaEmisionDocSustento, List<Detalle> detalles) {
		this.identificacionDestinatario = identificacionDestinatario;
		this.razonSocialDestinatario = razonSocialDestinatario;
		this.dirDestinatario = dirDestinatario;
		this.motivoTraslado = motivoTraslado;
		this.docAduaneroUnico = docAduaneroUnico;
		this.codEstabDestino = codEstabDestino;
		this.ruta = ruta;
		this.codDocSustento = codDocSustento;
		this.numDocSustento = numDocSustento;
		this.numAutDocSustento = numAutDocSustento;
		this.fechaEmisionDocSustento = fechaEmisionDocSustento;
		this.detalles = detalles;
	}


	//Getters && Setters
	public String getIdentificacionDestinatario() {
		return identificacionDestinatario;
	}
	public void setIdentificacionDestinatario(String identificacionDestinatario) {
		this.identificacionDestinatario = identificacionDestinatario;
	}
	public String getRazonSocialDestinatario() {
		return razonSocialDestinatario;
	}
	public void setRazonSocialDestinatario(String razonSocialDestinatario) {
		this.razonSocialDestinatario = razonSocialDestinatario;
	}
	public String getDirDestinatario() {
		return dirDestinatario;
	}
	public void setDirDestinatario(String dirDestinatario) {
		this.dirDestinatario = dirDestinatario;
	}
	public String getMotivoTraslado() {
		return motivoTraslado;
	}
	public void setMotivoTraslado(String motivoTraslado) {
		this.motivoTraslado = motivoTraslado;
	}
	public String getDocAduaneroUnico() {
		return docAduaneroUnico;
	}
	public void setDocAduaneroUnico(String docAduaneroUnico) {
		this.docAduaneroUnico = docAduaneroUnico;
	}
	public String getCodEstabDestino() {
		return codEstabDestino;
	}
	public void setCodEstabDestino(String codEstabDestino) {
		this.codEstabDestino = codEstabDestino;
	}
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	public String getCodDocSustento() {
		return codDocSustento;
	}
	public void setCodDocSustento(String codDocSustento) {
		this.codDocSustento = codDocSustento;
	}
	public String getNumDocSustento() {
		return numDocSustento;
	}
	public void setNumDocSustento(String numDocSustento) {
		this.numDocSustento = numDocSustento;
	}
	public String getNumAutDocSustento() {
		return numAutDocSustento;
	}
	public void setNumAutDocSustento(String numAutDocSustento) {
		this.numAutDocSustento = numAutDocSustento;
	}
	public String getFechaEmisionDocSustento() {
		return fechaEmisionDocSustento;
	}
	public void setFechaEmisionDocSustento(String fechaEmisionDocSustento) {
		this.fechaEmisionDocSustento = fechaEmisionDocSustento;
	}
	public List<Detalle> getDetalles() {
		return detalles;
	}
	public void setDetalles(List<Detalle> detalles) {
		this.detalles = detalles;
	}
}
