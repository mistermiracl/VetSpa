package com.vetspaejb.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.vetspaejb.entity.Usuario;

@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> implements UsuarioFacadeLocal{

	@PersistenceContext(name = "VetSpaPU")
	private EntityManager em;
	
	public UsuarioFacade() {
		super(Usuario.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	@Override
	public Usuario login(String username, String password) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Usuario> cq = cb.createQuery(Usuario.class);
		Root<Usuario> user = cq.from(Usuario.class);
		return em.createQuery(cq.where(cb.and(cb.equal(user.get("USERNAME"), username), cb.equal(user.get("PASS"), password))))
				.getResultList().get(0);
	}

}
