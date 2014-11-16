package com.pco.model;

import javax.xml.bind.annotation.XmlElement;

public class InfoComprobantePadre extends InfoComprobanteBase {
	private String rise;
	private String codDocModificado;
	private String numDocModificado;
	private String fechaEmisionDocSustento;

	// Getters && Setters
	@XmlElement
	public String getRise() {
		return rise;
	}

	public void setRise(String rise) {
		this.rise = rise;
	}

	@XmlElement
	public String getCodDocModificado() {
		return codDocModificado;
	}

	public void setCodDocModificado(String codDocModificado) {
		this.codDocModificado = codDocModificado;
	}

	@XmlElement
	public String getNumDocModificado() {
		return numDocModificado;
	}

	public void setNumDocModificado(String numDocModificado) {
		this.numDocModificado = numDocModificado;
	}

	@XmlElement
	public String getFechaEmisionDocSustento() {
		return fechaEmisionDocSustento;
	}

	public void setFechaEmisionDocSustento(String fechaEmisionDocSustento) {
		this.fechaEmisionDocSustento = fechaEmisionDocSustento;
	}
}
