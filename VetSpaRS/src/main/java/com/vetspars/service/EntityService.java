package com.vetspars.service;

import java.util.List;

import javax.ws.rs.core.Response;

import com.vetspars.model.VetSpaResponse;

//PARAMETERS FOR JAX-RS CANNOT BE OBJECT, SINCE IT WILL NOT BE ABLE TO MAP THEM
public interface EntityService<T> {
	VetSpaResponse<Object> insert(T toInsert);
	VetSpaResponse<Object> update(T toUpdate);
	VetSpaResponse<Object> delete(int id);
	VetSpaResponse<T> find(int id);
	VetSpaResponse<List<T>> findAll();
}
