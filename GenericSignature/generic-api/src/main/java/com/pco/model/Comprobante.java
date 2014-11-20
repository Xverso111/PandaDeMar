package com.pco.model;

import java.util.Calendar;

public class Comprobante {

	private long id;
	private TipoEmision emision;
	private int digitoVerificador;
	
	private Calendar fechaEmision;
	private TipoComprobante tipo;
	private String idContribuyente;
	private Ambiente ambiente;
	private long serie;
	private long secuencial;
	private long codigoNumerico;
	
	private long codigoNumeroContingencia;
	
	private Calendar fechaGeneracion;
	private EstadoProceso estado;
	
	private byte[] xmlDocument;
}
