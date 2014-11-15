package com.pco.model;

import javax.xml.bind.annotation.XmlAttribute;



public class DetalleAdicional {
	private String nombre;
	private String valor;
	
	public DetalleAdicional(){
		//
	}
	
	public DetalleAdicional(String nombre, String valor){
		this.nombre = nombre;
		this.valor = valor;
	}
	
	//Getters && Setters
	@XmlAttribute
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@XmlAttribute
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
}
