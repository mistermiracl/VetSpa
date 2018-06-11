package com.vetspaws;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.vetspaejb.entity.Distrito;
import com.vetspaejb.facade.DistritoFacadeLocal;

@WebService(name = "DistritoService", serviceName = "DistritoService")
public class DistritoService implements EntityService<Distrito>{

	@EJB
	private DistritoFacadeLocal distritoFacade;
	
	public DistritoService() {
	}

	@Override
	@WebMethod
	public int insert(Distrito toInsert) {
		distritoFacade.create(toInsert);
		return 0;
	}

	@Override
	@WebMethod
	public boolean update(Distrito toUpdate) {
		return distritoFacade.edit(toUpdate);
	}

	@Override
	@WebMethod
	public boolean delete(Object id) {
		return distritoFacade.remove(id);
	}

	@Override
	@WebMethod
	public Distrito find(Object id) {
		return distritoFacade.find(id);
	}

	@Override
	@WebMethod
	public List<Distrito> findAll() {
		return distritoFacade.findAll();
	}
	
}
