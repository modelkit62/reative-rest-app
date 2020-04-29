package com.example.reativerestapp.model;

public class Persona {

    Integer id;
    String nombre;

    public Persona(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public Persona setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
