package com.vetspaejb.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.vetspaejb.entity.Distrito;

//SESIONS BEANS MUST ALWAYS BE PUBLIC OTHERWISE DEPLOYMENT WILL FAIL
@Stateless
public class DistritoFacade extends AbstractFacade<Distrito> implements DistritoFacadeLocal{

	@PersistenceContext(name = "VetSpaPU")
	private EntityManager em;

	public DistritoFacade() {
		super(Distrito.class);
	}
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
}
