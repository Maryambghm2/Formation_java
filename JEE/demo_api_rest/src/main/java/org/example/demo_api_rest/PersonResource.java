package org.example.demo_api_rest;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/person")
public class PersonResource {

    private PersonService personService;

    @Inject
    public PersonResource(PersonService personService) {
        this.personService = personService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Person hello() {
        return new Person(42, "toto", 25);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Person postPerson(Person person) {
        person.setId(52);
        return person;


    }
        @POST
        @Path("/withservice")
        @Produces(MediaType.APPLICATION_JSON)
        public Person postPersonWithService(){
            return personService.save(55,"tutu", 99);
    }

    @POST
    @Path("/params")
    @Produces(MediaType.APPLICATION_JSON)
    public Person postPersonV2(@QueryParam("name") String name,@QueryParam("age") int age){
        return personService.save(4,name, age);
    }

    @DELETE
    @Path("/delete/{id}")
    public int delete(@PathParam("id") int id){
        return id;
    }

}
