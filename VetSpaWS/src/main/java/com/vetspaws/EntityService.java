package com.vetspaws;

import java.util.List;

public interface EntityService<T>{
	
	int insert(T toInsert);
	boolean update(T toUpdate);
	boolean delete(Object id);
	T find(Object id);
	List<T> findAll();
}
