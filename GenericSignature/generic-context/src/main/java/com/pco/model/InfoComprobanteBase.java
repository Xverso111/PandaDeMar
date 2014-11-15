package com.pco.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;


public class InfoComprobanteBase extends InfoComprobanteComun{
	private String tipoIdentificacionComprador;
	private String razonSocialComprador;
	private String identificacionComprador;
	private BigDecimal totalSinImpuestos;
	private String moneda;
	
	//Getters && Setters
	@XmlElement
	public String getTipoIdentificacionComprador() {
		return tipoIdentificacionComprador;
	}
	public void setTipoIdentificacionComprador(String tipoIdentificacionComprador) {
		this.tipoIdentificacionComprador = tipoIdentificacionComprador;
	}
	@XmlElement
	public String getRazonSocialComprador() {
		return razonSocialComprador;
	}
	public void setRazonSocialComprador(String razonSocialComprador) {
		this.razonSocialComprador = razonSocialComprador;
	}
	@XmlElement
	public String getIdentificacionComprador() {
		return identificacionComprador;
	}
	public void setIdentificacionComprador(String identificacionComprador) {
		this.identificacionComprador = identificacionComprador;
	}
	@XmlElement
	public BigDecimal getTotalSinImpuestos() {
		return totalSinImpuestos;
	}
	public void setTotalSinImpuestos(BigDecimal totalSinImpuestos) {
		this.totalSinImpuestos = totalSinImpuestos;
	}
	@XmlElement
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
}
