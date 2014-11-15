package com.pco.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class InfoAdicional {
	private String nombre;
	private String valor;
	
	public InfoAdicional(){
		//
	}
	
	public InfoAdicional(String nombre, String valor){
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
	@XmlValue
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}
