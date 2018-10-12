package com.zorxon.acs.service;

import com.zorxon.acs.api.EntityDAO;
import com.zorxon.acs.dao.UserDAO;
import com.zorxon.acs.entity.User;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class UserService extends AbstractService<User>{

    @Inject
    private UserDAO userDAO;

    @Override
    protected EntityDAO<User> getEntityDAO() {
        return this.userDAO;
    }

}
