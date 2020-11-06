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

/**
 * REST Web Service
 *
 * @author Lukas
 */
@Path("canvas")
@RequestScoped
public class CanvasRestApi {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CanvasRestApi
     */
    public CanvasRestApi() {
    }

    /**
     * Retrieves representation of an instance of Canvas.CanvasRestApi
     * @return an instance of java.lang.String
     */
    @GET
    public Response ping(){
        return Response
                .ok("ping")
                .build();
    }

    /**
     * PUT method for updating or creating an instance of CanvasRestApi
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
    @Path("{course}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCourseStudents(@PathParam("course") String courseCode){
         ArrayList<Student> students = new CanvasController().getStudentsInCourse(courseCode);
         return Response.ok(students).build();
    }
}
