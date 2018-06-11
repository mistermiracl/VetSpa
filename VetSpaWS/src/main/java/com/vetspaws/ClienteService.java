package com.vetspaws;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.vetspaejb.entity.Cliente;
import com.vetspaejb.facade.ClienteFacadeLocal;

@WebService(name = "ClienteService", serviceName = "ClienteService")
public class ClienteService implements EntityService<Cliente>{

	@EJB
	private ClienteFacadeLocal clienteFacade;
	
	public ClienteService() {
	}

	@Override
	@WebMethod
	public int insert(Cliente toInsert) {
		clienteFacade.create(toInsert);
		return toInsert.getId();
	}

	@Override
	@WebMethod
	public boolean update(Cliente toUpdate) {
		return clienteFacade.edit(toUpdate);
	}

	@Override
	@WebMethod
	public boolean delete(Object id) {
		return clienteFacade.remove(id);
	}

	@Override
	@WebMethod
	public Cliente find(Object id) {
		return clienteFacade.find(id);
	}

	@Override
	@WebMethod
	public List<Cliente> findAll() {
		return clienteFacade.findAll();
	}
	
}
