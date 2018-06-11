/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vetspars.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UsuarioModel {

	private int id;
	private String username;
	private String pass;
	
	public UsuarioModel() {
	}

	public UsuarioModel(int id, String username, String pass) {
		this.id = id;
		this.username = username;
		this.pass = pass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
