package br.com.billing.controllers;

import br.com.billing.services.GreetingsService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingController {

    @Inject
    GreetingsService greetingsService;

    public GreetingController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return greetingsService.getGreetings();
    }
}
