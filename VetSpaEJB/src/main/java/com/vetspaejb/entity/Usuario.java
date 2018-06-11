package com.vetspaejb.entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "USERNAME")
	private String username;
	
	@Column(name = "PASS")
	private String pass;
	
	private static final long serialVersionUID = 1L;

	public Usuario() {
	}

	public Usuario(Integer id, String username, String pass) {
		this.id = id;
		this.username = username;
		this.pass = pass;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
   
}
