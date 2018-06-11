package com.vetspaejb.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.vetspaejb.entity.Cliente;

@Stateless
public class ClienteFacade extends AbstractFacade<Cliente> implements ClienteFacadeLocal {
       
	@PersistenceContext(name = "VetSpaPU")
	private EntityManager em;
	
    public ClienteFacade() {
        super(Cliente.class);
    }

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
