package com.zorxon.acs.dao;

import com.zorxon.acs.api.EntityDAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractDAO<E> implements EntityDAO<E> {

    @PersistenceContext(unitName = "AccessControlSystemPU")
    private EntityManager entityManager;

    @Override
    public E persist(E entity) {
        getEntityManager().persist(entity);
        return entity;
    }

    @Override
    public E find(Long entityId) {
        return getEntityManager().find(getEntityClass(), entityId);
    }

    @Override
    public E merge(E entity) {
        return null;
    }

    @Override
    public void remove(Long entityId) {

    }

    protected EntityManager getEntityManager() {
        return entityManager;
    }

    protected abstract Class<E> getEntityClass();

}
