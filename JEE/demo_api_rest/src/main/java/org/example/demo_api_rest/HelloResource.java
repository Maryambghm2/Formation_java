package org.example.demo_api_rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello-world")
public class HelloResource {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }

    @GET
    @Path("/hello-you")

    @Produces("text/plain")
    public String helloYou() {
        return "Hello you !!!";
    }

    @GET
    @Path("/hello-json")

    @Produces("application/json")
    public String helloJson() {
        return "Hello, Json ";
    }

    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public String json() {
        return "Encore du Json ";
    }


}