package com.example.tecnico.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TecnicoDto {

    private Long id;
    private String nombre;
    private int edad;
    private List<JugadorDto> jugadores;

    public TecnicoDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<JugadorDto> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<JugadorDto> jugadores) {
        this.jugadores = jugadores;
    }
}
