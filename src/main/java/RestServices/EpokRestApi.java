/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestServices;

import Epok.EpokController;
import Epok.Module;
import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Lukas
 */
@Path("epok")
@RequestScoped
public class EpokRestApi {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of EpokRestApi
     */
    public EpokRestApi() {
    }

    /**
     * Retrieves representation of an instance of Epok.EpokRestApi
     * @return an instance of java.lang.String
     */
    @GET
    public Response ping(){
        return Response
                .ok("ping")
                .build();
    }

    @Path("{course}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCourseModules(@PathParam("course") String courseCode){
         ArrayList<Module> modules = new EpokController().getModules(courseCode);
         return Response.ok(modules).build();
    }
}
