/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Canvas;

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
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import Ladok.LadokController;
import Ladok.Grade;

/**
 * REST Web Service
 *
 * @author Lukas
 */
@Path("ladok")
@RequestScoped
public class LadokRestApi {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of LadokRestApi
     */
    public LadokRestApi() {
    }

    /**
     * Retrieves representation of an instance of Ladok.LadokRestApi
     * @return an instance of java.lang.String
     */
    @GET
    public Response ping(){
        return Response
                .ok("ping")
                .build();
    }

    /**
     * PUT method for updating or creating an instance of LadokRestApi
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    @Path("{course}/{module}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCourseModules(@PathParam("course") String courseCode, @PathParam("module") String module){
         ArrayList<Grade> grades = new LadokController().getGrades(courseCode, module);
         return Response.ok(grades).build();
    }
}
