package com.vetspars.service;

import java.util.List;

import javax.ws.rs.core.Response;

public interface EntityService<T> {
	Response insert(T toInsert);
	Response update(T toUpdate);
	Response delete(Object id);
	Response find(Object id);
	Response findAll();
}
