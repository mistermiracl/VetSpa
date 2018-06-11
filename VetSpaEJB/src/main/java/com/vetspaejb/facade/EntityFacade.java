package com.vetspaejb.facade;

import java.util.List;

interface EntityFacade<T> {

	void create(T entity);
	boolean edit(T entity);
	boolean remove(Object id);
	T find(Object id);
	List<T> findAll();
	
}
