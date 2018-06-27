package com.vetspaejb.facade;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.vetspaejb.entity.Cliente;
import com.vetspaejb.entity.Cliente_;

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

	@Override
	public Cliente findByDNI(String dni) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Cliente> cq = cb.createQuery(Cliente.class);
		Root<Cliente> cliente = cq.from(Cliente.class);
		cq.where(cb.equal(cliente.get(Cliente_.dni), dni));
		List<Cliente> clientes = em.createQuery(cq).getResultList();
		return clientes.size() > 0 ? clientes.get(0) : null;
	}

}
