package org.jboss.eap.demo.jaxrs;


import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Produces;


@Path("/")
public class HelloWorldEndpoint {
    @GET
    @Produces("text/plain")
    public Response doGet() {
        return Response.ok("Hello from JBoss EAP in the cloud!").build();
    }
}
