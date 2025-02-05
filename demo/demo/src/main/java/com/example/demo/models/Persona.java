package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
    private String cedula;

    private String nombres;
    private String apellidos;
    private String direccion_calle;
    private String direccion_numero;

    private Telefono telefono;

    // GETTERS Y SETTERS
    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion_calle() {
        return this.direccion_calle;
    }

    public void setDireccion_calle(String direccion_calle) {
        this.direccion_calle = direccion_calle;
    }

    public String getDireccion_numero() {
        return this.direccion_numero;
    }

    public void setDireccion_numero(String direccion_numero) {
        this.direccion_numero = direccion_numero;
    }

    public Telefono getTelefono() {
        return this.telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }
    
}
