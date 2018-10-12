package com.zorxon.acs.resource;

import com.zorxon.acs.api.EntityService;
import com.zorxon.acs.entity.User;
import com.zorxon.acs.service.UserService;

import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/users")
public class UserResource extends AbstractResource<User> {

    @Inject
    private UserService userService;

    @Override
    protected EntityService<User> getEntityService() {
        return this.userService;
    }

}
