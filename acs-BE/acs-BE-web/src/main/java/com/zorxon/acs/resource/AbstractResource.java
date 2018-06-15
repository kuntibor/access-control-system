package com.zorxon.acs.resource;

import com.zorxon.acs.api.DTOResource;
import com.zorxon.acs.api.EntityService;

import javax.ws.rs.core.Response;

public abstract class AbstractResource<D> implements DTOResource<D> {

    @Override
    public Response save(D dto) {
        return Response.ok(getEntityService().save(dto)).build();
    }

    @Override
    public Response get(Long dtoId) {
        return Response.ok(getEntityService().get(dtoId)).build();
    }

    @Override
    public Response update(D dto) {
        return null;
    }

    @Override
    public Response delete(Long dtoId) {
        return null;
    }

    protected abstract EntityService<D> getEntityService();

}
