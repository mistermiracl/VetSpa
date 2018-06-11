package com.vetspars.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DistritoModel {
	
	private String codigo;
	private String nombre;
	
	public DistritoModel() {
	}

	public DistritoModel(String codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
