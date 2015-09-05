package net.gvvinblade.webservice.contract;

import net.gvvinblade.webservice.domain.Person;

import javax.ws.rs.*;

/**
 * Created by gvvin on 04.09.2015.
 *
 */
@Path("/person")
public interface RestServiceEndpoint {

    @Path("/new")
    @POST
    @Consumes({"application/json", "application/xml"})
    void add(Person person);

    @Path("/{name}/info")
    @GET
    @Produces({"application/json", "application/xml"})
    Person info(@PathParam("name") String name);

}
