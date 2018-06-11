package com.vetspaejb.facade;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

public abstract class AbstractFacade<T> {
	
	private Class<T> entityClass;

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    public void create(T entity) {
        getEntityManager().persist(entity);
        //TO ENSURE THE REGISTRY IS INSERTED SO THAT WE CAN RETRIEVE THE RESULTING ID
        getEntityManager().flush();
    }

    public boolean edit(T entity) {
        return getEntityManager().merge(entity) != null;
    }

    public boolean remove(Object id) {
        getEntityManager().remove(find(id));
        return true;
    }

    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
	public List<T> findAll() {
        CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }
}
