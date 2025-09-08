package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.business.ActorBusiness;
import com.example.business.PeliculaBusiness;

@Configuration
public class HomeJpaCrud {
    @Autowired
    private ActorBusiness actorBusiness;
    @Autowired
    private PeliculaBusiness peliculaBusiness;

    @Bean
    CommandLineRunner crearAppConsola() {
        return args -> {
            // actorBusiness.processarActor();
            // peliculaBusiness.processarPelicula();
            // actorBusiness.buscarActorPorId(1L);
            // peliculaBusiness.buscarPeliculaPorId(1L);
        };
        }
}
