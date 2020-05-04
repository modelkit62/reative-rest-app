package com.example.reativerestapp.router;

import com.example.reativerestapp.handler.SampleHandlerFuncion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

// Maps the request to an appropiate handler
@Configuration
public class RouterFunctionConfig {

    @Bean
    public RouterFunction<ServerResponse> route(SampleHandlerFuncion sampleHandlerFuncion){
        return RouterFunctions
                .route(GET("/personas/listar/uno")
                .and(accept(MediaType.APPLICATION_JSON)) , sampleHandlerFuncion::getPersona)
                .andRoute(GET("/personas/listar/varios")
                        .and(accept(MediaType.APPLICATION_JSON)) , sampleHandlerFuncion::getPersonas);
    }

}
