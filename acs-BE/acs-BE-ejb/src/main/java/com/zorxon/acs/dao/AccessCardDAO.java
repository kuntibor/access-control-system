package com.zorxon.acs.dao;

import com.zorxon.acs.entity.AccessCard;
import com.zorxon.acs.entity.Member;
import com.zorxon.acs.entity.User;

import javax.ejb.Stateless;

@Stateless
public class AccessCardDAO extends AbstractDAO<AccessCard> {

    @Override
    protected Class<AccessCard> getEntityClass() {
        return AccessCard.class;
    }

    public Member doAccess(String doorId, String cardId) {
        return getEntityManager()
                .createNamedQuery("Member.findByAcessCard", Member.class)
                .setParameter("doorId", doorId)
                .setParameter("cardId", cardId)
                .getSingleResult();
    }
}
