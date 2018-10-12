package com.zorxon.acs.service;

import com.zorxon.acs.api.EntityDAO;
import com.zorxon.acs.dao.AccessCardDAO;
import com.zorxon.acs.entity.AccessCard;
import com.zorxon.acs.entity.Member;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class AccessCardService extends AbstractService<AccessCard>{

    @Inject
    private AccessCardDAO accessCardDAO;

    @Override
    protected EntityDAO<AccessCard> getEntityDAO() {
        return this.accessCardDAO;
    }

    public Member doAccess(String doorId, String cardId){
        return accessCardDAO.doAccess(doorId, cardId);
    }

}
