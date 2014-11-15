package com.pco.model;

public class InfoCompRetencion extends InfoComprobanteComun{
	private String tipoIdentificacionSujetoRetenido;
	private String razonSocialSujetoRetenido;
	private String identificacionSujetoRetenido;
	private String periodoFiscal;
	
	//Getters && Setters
	public String getTipoIdentificacionSujetoRetenido() {
		return tipoIdentificacionSujetoRetenido;
	}
	public void setTipoIdentificacionSujetoRetenido(
			String tipoIdentificacionSujetoRetenido) {
		this.tipoIdentificacionSujetoRetenido = tipoIdentificacionSujetoRetenido;
	}
	public String getRazonSocialSujetoRetenido() {
		return razonSocialSujetoRetenido;
	}
	public void setRazonSocialSujetoRetenido(String razonSocialSujetoRetenido) {
		this.razonSocialSujetoRetenido = razonSocialSujetoRetenido;
	}
	public String getIdentificacionSujetoRetenido() {
		return identificacionSujetoRetenido;
	}
	public void setIdentificacionSujetoRetenido(String identificacionSujetoRetenido) {
		this.identificacionSujetoRetenido = identificacionSujetoRetenido;
	}
	public String getPeriodoFiscal() {
		return periodoFiscal;
	}
	public void setPeriodoFiscal(String periodoFiscal) {
		this.periodoFiscal = periodoFiscal;
	}
}
