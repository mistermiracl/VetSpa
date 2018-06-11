package com.vetspaejb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Distrito")
public class Distrito implements Serializable{

	@Id
	@Column(name = "CODDIST")
	private String codigo;
	
	@Column(name = "NOMDIST")
	private String nombre;

	private static final long serialVersionUID = 1L;
	
	public Distrito() {
	}
	
	public Distrito(String codigo, String nombre) {
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
