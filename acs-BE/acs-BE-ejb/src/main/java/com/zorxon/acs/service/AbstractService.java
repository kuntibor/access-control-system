package com.zorxon.acs.service;

import com.zorxon.acs.api.EntityDAO;
import com.zorxon.acs.api.EntityService;

public abstract class AbstractService<E> implements EntityService<E> {

    @Override
    public E save(E entity) {
        return getEntityDAO().persist(entity);
    }

    @Override
    public E get(Long entityId) {
        return getEntityDAO().find(entityId);
    }

    @Override
    public E update(E entity) {
        return null;
    }

    @Override
    public void delete(Long entityId) {

    }

    protected abstract EntityDAO<E> getEntityDAO();

}
