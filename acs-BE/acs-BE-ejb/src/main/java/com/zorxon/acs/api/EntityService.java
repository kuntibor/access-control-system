package com.zorxon.acs.api;

public interface EntityService<E> {

    E save(E entity);

    E get(Long entityId);

    E update(E entity);

    void delete(Long entityId);

}
