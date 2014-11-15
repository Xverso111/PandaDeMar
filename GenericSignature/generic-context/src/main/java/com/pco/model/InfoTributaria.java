package com.pco.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "infoTributaria")
public class InfoTributaria {
	private Integer ambiente;
	private Integer tipoEmision;
	private String razonSocial;
	private String nombreComercial;
	private String ruc;
	private String claveAcceso;
	private String codDoc;
	private String estab;
	private String ptoEmi;
	private String secuencial;
	private String dirMatriz;
	
	public InfoTributaria(){
		//
	}
	
	public InfoTributaria(Integer ambiente, Integer tipoEmision,
			String razonSocial, String nombreComercial, String ruc,
			String claveAcceso, String codDoc, String estab, String ptoEmi,
			String secuencial, String dirMatriz) {
		super();
		this.ambiente = ambiente;
		this.tipoEmision = tipoEmision;
		this.razonSocial = razonSocial;
		this.nombreComercial = nombreComercial;
		this.ruc = ruc;
		this.claveAcceso = claveAcceso;
		this.codDoc = codDoc;
		this.estab = estab;
		this.ptoEmi = ptoEmi;
		this.secuencial = secuencial;
		this.dirMatriz = dirMatriz;
	}
	//Getters && Setters
	@XmlElement
	public Integer getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(Integer ambiente) {
		this.ambiente = ambiente;
	}
	@XmlElement
	public Integer getTipoEmision() {
		return tipoEmision;
	}
	public void setTipoEmision(Integer tipoEmision) {
		this.tipoEmision = tipoEmision;
	}
	@XmlElement
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	@XmlElement
	public String getNombreComercial() {
		return nombreComercial;
	}
	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}
	@XmlElement
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	@XmlElement
	public String getClaveAcceso() {
		return claveAcceso;
	}
	public void setClaveAcceso(String claveAcceso) {
		this.claveAcceso = claveAcceso;
	}
	@XmlElement
	public String getCodDoc() {
		return codDoc;
	}
	public void setCodDoc(String codDoc) {
		this.codDoc = codDoc;
	}
	@XmlElement
	public String getEstab() {
		return estab;
	}
	public void setEstab(String estab) {
		this.estab = estab;
	}
	@XmlElement
	public String getPtoEmi() {
		return ptoEmi;
	}
	public void setPtoEmi(String ptoEmi) {
		this.ptoEmi = ptoEmi;
	}
	@XmlElement
	public String getSecuencial() {
		return secuencial;
	}
	public void setSecuencial(String secuencial) {
		this.secuencial = secuencial;
	}
	@XmlElement
	public String getDirMatriz() {
		return dirMatriz;
	}
	public void setDirMatriz(String dirMatriz) {
		this.dirMatriz = dirMatriz;
	}
}
