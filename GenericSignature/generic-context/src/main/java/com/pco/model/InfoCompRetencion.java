package com.pco.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "infoCompRetencion")
@XmlType(propOrder = {"tipoIdentificacionSujetoRetenido", "razonSocialSujetoRetenido",
		"identificacionSujetoRetenido", "periodoFiscal"})
public class InfoCompRetencion extends InfoComprobanteComun {
	private String tipoIdentificacionSujetoRetenido;
	private String razonSocialSujetoRetenido;
	private String identificacionSujetoRetenido;
	private String periodoFiscal;

	public InfoCompRetencion() {
		//
	}

	public InfoCompRetencion(String fechaEmision, String dirEstablecimiento,
			Integer contribuyenteEspecial, String obligadoContabilidad,
			String tipoIdentificacionSujetoRetenido,
			String razonSocialSujetoRetenido,
			String identificacionSujetoRetenido, String periodoFiscal) {
		setFechaEmision(fechaEmision);
		setDirEstablecimiento(dirEstablecimiento);
		setContribuyenteEspecial(contribuyenteEspecial);
		setObligadoContabilidad(obligadoContabilidad);
		this.tipoIdentificacionSujetoRetenido = tipoIdentificacionSujetoRetenido;
		this.razonSocialSujetoRetenido = razonSocialSujetoRetenido;
		this.identificacionSujetoRetenido = identificacionSujetoRetenido;
		this.periodoFiscal = periodoFiscal;
	}

	// Getters && Setters
	@XmlElement
	public String getTipoIdentificacionSujetoRetenido() {
		return tipoIdentificacionSujetoRetenido;
	}

	public void setTipoIdentificacionSujetoRetenido(
			String tipoIdentificacionSujetoRetenido) {
		this.tipoIdentificacionSujetoRetenido = tipoIdentificacionSujetoRetenido;
	}

	@XmlElement
	public String getRazonSocialSujetoRetenido() {
		return razonSocialSujetoRetenido;
	}

	public void setRazonSocialSujetoRetenido(String razonSocialSujetoRetenido) {
		this.razonSocialSujetoRetenido = razonSocialSujetoRetenido;
	}

	@XmlElement
	public String getIdentificacionSujetoRetenido() {
		return identificacionSujetoRetenido;
	}

	public void setIdentificacionSujetoRetenido(
			String identificacionSujetoRetenido) {
		this.identificacionSujetoRetenido = identificacionSujetoRetenido;
	}

	@XmlElement
	public String getPeriodoFiscal() {
		return periodoFiscal;
	}

	public void setPeriodoFiscal(String periodoFiscal) {
		this.periodoFiscal = periodoFiscal;
	}
}
