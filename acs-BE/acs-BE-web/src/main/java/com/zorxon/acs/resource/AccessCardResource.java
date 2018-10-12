package com.zorxon.acs.resource;

import com.zorxon.acs.api.EntityService;
import com.zorxon.acs.entity.AccessCard;
import com.zorxon.acs.entity.User;
import com.zorxon.acs.service.AccessCardService;
import com.zorxon.acs.service.UserService;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/access-card")
public class AccessCardResource extends AbstractResource<AccessCard> {

    @Inject
    private AccessCardService accessCardService;

    @Override
    protected EntityService<AccessCard> getEntityService() {
        return this.accessCardService;
    }

//    @GET
//    @Path("/doAccess")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response doAccess(@Context HttpServletRequest request, @QueryParam("doorId") String doorId, @QueryParam("cardId") String cardId){
//        System.out.println("test: " + request.getHeader("user-agent"));
//        return Response.ok(accessCardService.doAccess(doorId, cardId)).build();
//    }

//    @GET
//    @Path("/doAccess")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response doAccess(@Context HttpServletRequest request){
//        System.out.println("test: " + request.getHeader("user-agent"));
//        return Response.ok("Belépés").build();
//    }

    @GET
    @Path("/doAccess")
    @Produces(MediaType.TEXT_PLAIN)
    public String doAccess(@Context HttpServletRequest request){
        System.out.println("test: " + request.getHeader("user-agent"));
        return "Response: Belépés2";
    }


}
