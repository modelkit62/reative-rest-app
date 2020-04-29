package com.example.reativerestapp.controller;

import com.example.reativerestapp.model.Persona;
import com.example.reativerestapp.repository.iPersona;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/personas")
public class AppController {

    static final Logger logger = LoggerFactory.getLogger(AppController.class);

    @Autowired
    private iPersona personaRepository;

    @GetMapping("/listar")
    public Flux<Persona> listar(){
        return personaRepository.listar();
    }




}
