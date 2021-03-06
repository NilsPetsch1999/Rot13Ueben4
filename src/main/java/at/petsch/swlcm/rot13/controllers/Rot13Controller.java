package at.petsch.swlcm.rot13.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/rot13")
public class Rot13Controller {

    @GET
    @Path("/{sourceString}")
    @Produces(MediaType.TEXT_PLAIN)
    public String GetRot13StringFromSourceString(@PathParam("sourceString")String sourceString){
        return sourceString;
    }
}
