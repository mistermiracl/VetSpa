/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vetspars.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ClienteModel {
    
	private int id;
	private int usuarioId;
	
	public ClienteModel() {
	}

	public ClienteModel(int id, int usuarioId) {
		this.id = id;
		this.usuarioId = usuarioId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}
	
	
}
