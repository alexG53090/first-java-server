/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_generic;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author node
 */
@Path("secondpath")
public class SecondpathResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of SecondpathResource
     */
    public SecondpathResource() {
    }

    /**
     * Retrieves representation of an instance of package_generic.SecondpathResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
//        throw new UnsupportedOperationException();
    return "[1,2,3]";
    
    }

    /**
     * PUT method for updating or creating an instance of SecondpathResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
