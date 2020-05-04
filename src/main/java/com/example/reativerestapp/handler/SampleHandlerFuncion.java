package com.example.reativerestapp.handler;

import com.example.reativerestapp.model.Persona;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Random;

@Component
public class SampleHandlerFuncion {

    public Mono<ServerResponse> getPersona(ServerRequest serverRequest){
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(
                        Mono.just(new Persona(new Random().nextInt(10), "Anacleto"))
                        .log(), Persona.class
                );
    }

    public Mono<ServerResponse> getPersonas(ServerRequest serverRequest){
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(
                        Flux.just(new Persona(new Random().nextInt(10), "Anacleto"),
                                  new Persona(new Random().nextInt(10), "Agente-Secreto"))
                                  .log(), Persona.class
                );
    }


}
