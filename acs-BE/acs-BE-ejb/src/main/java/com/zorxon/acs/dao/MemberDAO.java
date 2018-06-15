package com.zorxon.acs.dao;

import com.zorxon.acs.entity.Member;

import javax.ejb.Stateless;

@Stateless
public class MemberDAO extends AbstractDAO<Member> {

    @Override
    protected Class<Member> getEntityClass() {
        return Member.class;
    }

}
