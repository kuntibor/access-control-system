package com.zorxon.acs.api;

public interface EntityDAO<E> {

    E persist(E entity);

    E find(Long entityId);

    E merge(E entity);

    void remove(Long entityId);

}
