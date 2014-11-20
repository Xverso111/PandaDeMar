package com.pco.model;

import javax.xml.bind.annotation.XmlElement;


public class InfoComprobanteComun {
	private String fechaEmision;
	private String dirEstablecimiento;
	private Integer contribuyenteEspecial;
	private String obligadoContabilidad;
	
	public InfoComprobanteComun(){
		//
	}
	
	public InfoComprobanteComun(String fechaEmision, String dirEstablecimiento,
			Integer contribuyenteEspecial, String obligadoContabilidad) {
		this.fechaEmision = fechaEmision;
		this.dirEstablecimiento = dirEstablecimiento;
		this.contribuyenteEspecial = contribuyenteEspecial;
		this.obligadoContabilidad = obligadoContabilidad;
	}
	//Getters && Setters
	@XmlElement
	public String getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	@XmlElement
	public String getDirEstablecimiento() {
		return dirEstablecimiento;
	}
	public void setDirEstablecimiento(String dirEstablecimiento) {
		this.dirEstablecimiento = dirEstablecimiento;
	}
	@XmlElement
	public Integer getContribuyenteEspecial() {
		return contribuyenteEspecial;
	}
	public void setContribuyenteEspecial(Integer contribuyenteEspecial) {
		this.contribuyenteEspecial = contribuyenteEspecial;
	}
	@XmlElement
	public String getObligadoContabilidad() {
		return obligadoContabilidad;
	}
	public void setObligadoContabilidad(String obligadoContabilidad) {
		this.obligadoContabilidad = obligadoContabilidad;
	}
}
