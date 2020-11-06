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
import StudentITS.DBController;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;

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
        LadokController controller = new LadokController();
        controller.readAll();
        ArrayList<Grade> grades = controller.getGrades(courseCode, module);
        return Response.ok(grades).build();
    }
    
    @PUT
    @Path("/{pNmr}/{course}/{module}/{date}/{grade}")
    @Consumes("application/xml")
    @Produces(MediaType.APPLICATION_JSON)
    public Response regBetygPut(
            @PathParam("pNmr") String pNmr, 
            @PathParam("course") String courseCode, 
            @PathParam("module") String module,
            @PathParam("date") String date,
            @PathParam("grade") String grade){
      
       LadokController controller = new LadokController();
       controller.readAll();
       Boolean res = controller.regBetyg(pNmr, courseCode, module, date, grade);
       
       if (res){
           controller.saveAll();
           return Response.status(javax.ws.rs.core.Response.Status.OK).entity(new Message("Grade pushed successfully") {}).build();
       }else{
           return Response.status(javax.ws.rs.core.Response.Status.BAD_REQUEST)
                            .entity(new Message("Student not found in module"))
                            .build();
       }
}
    
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public Response regBetyg(
            @FormParam("pNmr") String pNmr, 
            @FormParam("course") String courseCode, 
            @FormParam("module") String module,
            @FormParam("date") String date,
            @FormParam("grade") String grade){
         
        LadokController controller = new LadokController();
        controller.readAll();
        Boolean res = controller.regBetyg(pNmr, courseCode, module, date, grade);
        if (res){
            controller.saveAll();
            return Response.status(javax.ws.rs.core.Response.Status.OK).entity(new Message("Grade pushed successfully") {}).build();
        }else{
            return Response.status(javax.ws.rs.core.Response.Status.BAD_REQUEST)
                             .entity(new Message("Student not found in module"))
                             .build();
          }
    }
}
