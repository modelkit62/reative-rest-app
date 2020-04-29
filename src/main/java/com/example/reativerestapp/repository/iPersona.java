package com.example.reativerestapp.repository;

import com.example.reativerestapp.model.Persona;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface iPersona {

    Mono<Persona> creaPersona(Persona persona);
    Mono<Persona> modificaPersona(Persona persona);
    Flux<Persona> listar();
    Mono<Persona> getPersona(Integer id);
    Mono<Persona> eliminaPersona(Integer id);

}
