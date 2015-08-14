package com.thoughtworks.books.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/book")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

    @GET
    public BookRepresentation get(){
        return new BookRepresentation("Algorithms", "Cormen");
    }
}
