package com.pco.model;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class Detalle {
	private String codigoInterno;
	private String codigoAdicional;
	private String codigoPrincipal;
	private String codigoAuxiliar;
	private String descripcion;
	private BigDecimal cantidad;
	private BigDecimal precioUnitario;
	private BigDecimal descuento;
	private BigDecimal precioTotalSinImpuesto;
	private List<DetalleAdicional> detallesAdicionales;
	private List<Impuesto> impuestos;

	public Detalle() {
		//
	}

	public Detalle(String codigoPrincipal, String codigoAuxiliar,
			String descripcion, BigDecimal cantidad, BigDecimal precioUnitario,
			BigDecimal descuento, BigDecimal precioTotalSinImpuesto,
			List<DetalleAdicional> detallesAdicionales, List<Impuesto> impuestos) {
		this.codigoPrincipal = codigoPrincipal;
		this.codigoAuxiliar = codigoAuxiliar;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.descuento = descuento;
		this.precioTotalSinImpuesto = precioTotalSinImpuesto;
		this.detallesAdicionales = detallesAdicionales;
		this.impuestos = impuestos;
	}

	// Getters && Setters
	@XmlElement
	public String getCodigoInterno() {
		return codigoInterno;
	}

	public void setCodigoInterno(String codigoInterno) {
		this.codigoInterno = codigoInterno;
	}

	@XmlElement
	public String getCodigoAdicional() {
		return codigoAdicional;
	}

	public void setCodigoAdicional(String codigoAdicional) {
		this.codigoAdicional = codigoAdicional;
	}

	@XmlElement
	public String getCodigoPrincipal() {
		return codigoPrincipal;
	}

	public void setCodigoPrincipal(String codigoPrincipal) {
		this.codigoPrincipal = codigoPrincipal;
	}

	@XmlElement
	public String getCodigoAuxiliar() {
		return codigoAuxiliar;
	}

	public void setCodigoAuxiliar(String codigoAuxiliar) {
		this.codigoAuxiliar = codigoAuxiliar;
	}

	@XmlElement
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@XmlElement
	public BigDecimal getCantidad() {
		return cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	@XmlElement
	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	@XmlElement
	public BigDecimal getDescuento() {
		return descuento;
	}

	public void setDescuento(BigDecimal descuento) {
		this.descuento = descuento;
	}

	@XmlElement
	public BigDecimal getPrecioTotalSinImpuesto() {
		return precioTotalSinImpuesto;
	}

	public void setPrecioTotalSinImpuesto(BigDecimal precioTotalSinImpuesto) {
		this.precioTotalSinImpuesto = precioTotalSinImpuesto;
	}

	@XmlElementWrapper
	@XmlElement(name = "detAdicional")
	public List<DetalleAdicional> getDetallesAdicionales() {
		return detallesAdicionales;
	}

	public void setDetallesAdicionales(
			List<DetalleAdicional> detallesAdicionales) {
		this.detallesAdicionales = detallesAdicionales;
	}

	@XmlElementWrapper
	@XmlElement(name = "impuesto")
	public List<Impuesto> getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(List<Impuesto> impuestos) {
		this.impuestos = impuestos;
	}

}
