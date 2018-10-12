package com.zorxon.acs.resource;

import com.zorxon.acs.api.EntityService;
import com.zorxon.acs.entity.Member;
import com.zorxon.acs.service.MemberService;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/members")
public class MemberResource extends AbstractResource<Member> {

    @Inject
    private MemberService memberService;

    @Override
    protected EntityService<Member> getEntityService() {
        return this.memberService;
    }

}
