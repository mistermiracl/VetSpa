package com.vetspaejb.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Cliente")
public class Cliente implements Serializable{

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "DNICLI")
	private String dni;
	
	@Column(name = "NOMCLI")
	private String nombre;
	
	@Column(name = "NOMSEGCLI")
	private String nombreSeg;
	
	@Column(name = "APEPATCLI")
	private String apellidoPat;
	
	@Column(name = "APEMATCLI")
	private String apellidoMat;
	
	@Column(name = "FECNACCLI")
	private Date fechaNac;
	
	@Column(name = "SEXCLI")
	private Integer sexo;
	
	@Column(name = "CELCLI")
	private String celular;
	
	@Column(name = "DIRCLI")
	private String direccion;
	
	@JoinColumn(name = "CODDIST", referencedColumnName = "CODDIST")
	@ManyToOne
	private Distrito distrito;

	private static final long serialVersionUID = 1L;
	
	public Cliente() {
	}
	
	public Cliente(Integer id, String dni, String nombre, String nombreSeg, String apellidoPat, String apellidoMat,
			Date fechaNac, Integer sexo, String celular, String direccion, Distrito distrito) {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.nombreSeg = nombreSeg;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.fechaNac = fechaNac;
		this.sexo = sexo;
		this.celular = celular;
		this.direccion = direccion;
		this.distrito = distrito;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreSeg() {
		return nombreSeg;
	}

	public void setNombreSeg(String nombreSeg) {
		this.nombreSeg = nombreSeg;
	}

	public String getApellidoPat() {
		return apellidoPat;
	}

	public void setApellidoPat(String apellidoPat) {
		this.apellidoPat = apellidoPat;
	}

	public String getApellidoMat() {
		return apellidoMat;
	}

	public void setApellidoMat(String apellidoMat) {
		this.apellidoMat = apellidoMat;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public Integer getSexo() {
		return sexo;
	}

	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}
	
}