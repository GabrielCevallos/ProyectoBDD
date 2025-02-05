package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "rutina")
public class Rutina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRutina;

    private String nombreRutina;
    private String descripcion;
    private Integer nroEjercicios;

    // GETTERS Y SETTERS
    public int getIdRutina() {
        return this.idRutina;
    }

    public void setIdRutina(int idRutina) {
        this.idRutina = idRutina;
    }

    public String getNombreRutina() {
        return this.nombreRutina;
    }

    public void setNombreRutina(String nombreRutina) {
        this.nombreRutina = nombreRutina;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getNroEjercicios() {
        return this.nroEjercicios;
    }

    public void setNroEjercicios(Integer nroEjercicios) {
        this.nroEjercicios = nroEjercicios;
    }
}
