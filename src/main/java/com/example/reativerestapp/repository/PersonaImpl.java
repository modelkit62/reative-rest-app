package com.example.reativerestapp.repository;

import com.example.reativerestapp.controller.AppController;
import com.example.reativerestapp.model.Persona;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonaImpl implements iPersona{

    static final Logger logger = LoggerFactory.getLogger(PersonaImpl.class);

    @Override
    public Mono<Persona> creaPersona(Persona persona) {
        logger.info(persona.toString());
        return Mono.just(persona);
    }

    @Override
    public Mono<Persona> modificaPersona(Persona persona) {
        logger.info(persona.toString());
        return Mono.just(persona);
    }

    @Override
    public Flux<Persona> listar() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Serenade"));
        personas.add(new Persona(2, "Mike"));
        personas.add(new Persona(3, "Eimer"));
        return Flux.fromIterable(personas);
    }

    @Override
    public Mono<Persona> getPersona(Integer id) {
        return Mono.just(new Persona(id, "Random name!"));
    }

    @Override
    public Mono<Persona> eliminaPersona(Integer id) {
        return Mono.empty();
    }
}
