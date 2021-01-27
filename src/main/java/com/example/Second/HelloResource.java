package com.example.Second;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


@Path("/page{username}")
public class HelloResource {
    @GET
    @Produces("text/xml")
    public String hello(@PathParam("username") String username) {
        return username;
    }

}