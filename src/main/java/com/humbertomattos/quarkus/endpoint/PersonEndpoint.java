package com.humbertomattos.quarkus.endpoint;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.humbertomattos.quarkus.model.Person;
import com.humbertomattos.quarkus.resource.PersonResource;


@Path("/api/persons")
public class PersonEndpoint {

    @Inject
    PersonResource personResource;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getPersons() {
        return personResource.getPersons();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson(@PathParam("id") Long id) {
        return personResource.getPerson(id);
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updatePerson(@PathParam("id") Long id, Person c) {
        personResource.updatePerson(id, c);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Person addPerson(Person c) {
        return personResource.addPerson(c);
    }

    @DELETE
    @Path("/{id}")
    public void deletePerson(@PathParam("id") Long id) {
        personResource.deletePerson(id);
    }
}