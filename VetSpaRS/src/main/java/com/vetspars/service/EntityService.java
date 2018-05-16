package com.vetspars.service;

import java.util.List;

import javax.ws.rs.core.Response;

public interface EntityService<T> {
	int insert(T toInsert);
	boolean update(T toUpdate);
	boolean delete(Object id);
	T find(Object id);
	List<T> findAll();
}
