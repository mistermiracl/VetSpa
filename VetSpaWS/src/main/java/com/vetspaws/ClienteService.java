package com.vetspaws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "ClienteService", serviceName = "ClienteService")
public class ClienteService implements EntityService{

	public ClienteService() {
	}
	
	@WebMethod
	public int insert(Object toInsert) {
		// TODO Auto-generated method stub
		return 0;
	}

	@WebMethod
	public boolean update(Object toUpdate) {
		// TODO Auto-generated method stub
		return false;
	}

	@WebMethod
	public boolean delete(Object id) {
		// TODO Auto-generated method stub
		return false;
	}

	@WebMethod
	public Object find(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@WebMethod
	public List findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
