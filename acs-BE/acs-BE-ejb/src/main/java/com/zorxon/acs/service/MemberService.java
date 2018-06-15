package com.zorxon.acs.service;

import com.zorxon.acs.api.EntityDAO;
import com.zorxon.acs.dao.MemberDAO;
import com.zorxon.acs.entity.Member;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class MemberService extends AbstractService<Member>{

    @Inject
    private MemberDAO memberDAO;

    @Override
    protected EntityDAO<Member> getEntityDAO() {
        return this.memberDAO;
    }

}
