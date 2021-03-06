/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestServices;

import StudentITS.Student;
import StudentITS.StudentController;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.FormParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Lukas
 */
@Path("studentits")
@RequestScoped
public class StudentRestApi {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of StudentRestApi
     */
    public StudentRestApi() {
    }

    /**
     * Retrieves representation of an instance of Canvas.StudentRestApi
     * @return an instance of java.lang.String
     */
    @GET
    public Response ping(){
        return Response
                .ok("ping")
                .build();
    }
    
    @Path("{student}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudentByUsername(@PathParam("student") String userName){
         Student student = new StudentController().getStudentByUsername(userName);
         return Response.ok(student.getpNmr()).build();
    }
}
