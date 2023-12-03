package br.com.billing.services;


import io.quarkus.arc.DefaultBean;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;

@ApplicationScoped
public class GreetingsService {

    public String getGreetings() {
        return "Hello from RESTEasy Reactive";
    }
}
