package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "telefono")
public class Telefono {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_telefono;

    private String telefono;
    private Persona persona;

    // GETTERS Y SETTERS
    public int getId_telefono() {
        return this.id_telefono;
    }

    public void setId_telefono(int id_telefono) {
        this.id_telefono = id_telefono;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Persona getPersona() {
        return this.persona;
    }
    
}
