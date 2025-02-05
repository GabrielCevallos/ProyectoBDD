package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "ejercicios")
public class Ejercicios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEjercicio;

    private String nombreEjercicio;
    private String descripcion;
    private String grupoMuscular;
    private String tiempoDescanso;
    private Integer nroSeries;
    private Integer nroRepeticiones;

    // GETTERS Y SETTERS
    public int getIdEjercicio() {
        return this.idEjercicio;
    }

    public void setIdEjercicio(int idEjercicio) {
        this.idEjercicio = idEjercicio;
    }

    public String getNombreEjercicio() {
        return this.nombreEjercicio;
    }

    public void setNombreEjercicio(String nombreEjercicio) {
        this.nombreEjercicio = nombreEjercicio;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGrupoMuscular() {
        return this.grupoMuscular;
    }

    public void setGrupoMuscular(String grupoMuscular) {
        this.grupoMuscular = grupoMuscular;
    }

    public String getTiempoDescanso() {
        return this.tiempoDescanso;
    }

    public void setTiempoDescanso(String tiempoDescanso) {
        this.tiempoDescanso = tiempoDescanso;
    }

    public Integer getNroSeries() {
        return this.nroSeries;
    }

    public void setNroSeries(Integer nroSeries) {
        this.nroSeries = nroSeries;
    }

    public Integer getNroRepeticiones() {
        return this.nroRepeticiones;
    }

    public void setNroRepeticiones(Integer nroRepeticiones) {
        this.nroRepeticiones = nroRepeticiones;
    }

}
