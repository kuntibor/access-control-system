package com.zorxon.acs.dao;

import com.zorxon.acs.entity.User;

import javax.ejb.Stateless;

@Stateless
public class UserDAO extends AbstractDAO<User> {

    @Override
    protected Class<User> getEntityClass() {
        return User.class;
    }

}
