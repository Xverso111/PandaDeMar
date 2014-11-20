package com.pco.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "infoGuiaRemision")
@XmlType(propOrder = { "dirEstablecimiento", "dirPartida",
		"razonSocialTransportista", "tipoIdentificacionTransportista",
		"rucTransportista", "rise", "obligadoContabilidad",
		"contribuyenteEspecial", "fechaIniTransporte", "fechaFinTransporte",
		"placa" })
public class InfoGuiaRemision {
	private String dirEstablecimiento;
	private String dirPartida;
	private String razonSocialTransportista;
	private String tipoIdentificacionTransportista;
	private String rucTransportista;
	private String rise;
	private String obligadoContabilidad;
	private Integer contribuyenteEspecial;
	private String fechaIniTransporte;
	private String fechaFinTransporte;
	private String placa;

	public InfoGuiaRemision() {
		//
	}

	public InfoGuiaRemision(String dirEstablecimiento, String dirPartida,
			String razonSocialTransportista,
			String tipoIdentificacionTransportista, String rucTransportista,
			String rise, String obligadoContabilidad,
			Integer contribuyenteEspecial, String fechaIniTransporte,
			String fechaFinTransporte, String placa) {
		this.dirEstablecimiento = dirEstablecimiento;
		this.dirPartida = dirPartida;
		this.razonSocialTransportista = razonSocialTransportista;
		this.tipoIdentificacionTransportista = tipoIdentificacionTransportista;
		this.rucTransportista = rucTransportista;
		this.rise = rise;
		this.obligadoContabilidad = obligadoContabilidad;
		this.contribuyenteEspecial = contribuyenteEspecial;
		this.fechaIniTransporte = fechaIniTransporte;
		this.fechaFinTransporte = fechaFinTransporte;
		this.placa = placa;
	}

	// Getters && Setters
	public String getDirEstablecimiento() {
		return dirEstablecimiento;
	}

	public void setDirEstablecimiento(String dirEstablecimiento) {
		this.dirEstablecimiento = dirEstablecimiento;
	}

	public String getDirPartida() {
		return dirPartida;
	}

	public void setDirPartida(String dirPartida) {
		this.dirPartida = dirPartida;
	}

	public String getRazonSocialTransportista() {
		return razonSocialTransportista;
	}

	public void setRazonSocialTransportista(String razonSocialTransportista) {
		this.razonSocialTransportista = razonSocialTransportista;
	}

	public String getTipoIdentificacionTransportista() {
		return tipoIdentificacionTransportista;
	}

	public void setTipoIdentificacionTransportista(
			String tipoIdentificacionTransportista) {
		this.tipoIdentificacionTransportista = tipoIdentificacionTransportista;
	}

	public String getRucTransportista() {
		return rucTransportista;
	}

	public void setRucTransportista(String rucTransportista) {
		this.rucTransportista = rucTransportista;
	}

	public String getRise() {
		return rise;
	}

	public void setRise(String rise) {
		this.rise = rise;
	}

	public String getObligadoContabilidad() {
		return obligadoContabilidad;
	}

	public void setObligadoContabilidad(String obligadoContabilidad) {
		this.obligadoContabilidad = obligadoContabilidad;
	}

	public Integer getContribuyenteEspecial() {
		return contribuyenteEspecial;
	}

	public void setContribuyenteEspecial(Integer contribuyenteEspecial) {
		this.contribuyenteEspecial = contribuyenteEspecial;
	}

	public String getFechaIniTransporte() {
		return fechaIniTransporte;
	}

	public void setFechaIniTransporte(String fechaIniTransporte) {
		this.fechaIniTransporte = fechaIniTransporte;
	}

	public String getFechaFinTransporte() {
		return fechaFinTransporte;
	}

	public void setFechaFinTransporte(String fechaFinTransporte) {
		this.fechaFinTransporte = fechaFinTransporte;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
}
