package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "planentrenamiento")
public class PlanEntrenamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_plan")
    private Long idPlan;

    @Column(name = "dia")
    private String dia;

    @Column(name = "duracion")
    private int duracion;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    private Cliente cliente;

    // Constructor
    public PlanEntrenamiento() {}

    public PlanEntrenamiento(String dia, int duracion, String descripcion, Cliente cliente) {
        this.dia = dia;
        this.duracion = duracion;
        this.descripcion = descripcion;
        this.cliente = cliente;
    }

    // Getters and Setters
    public Long getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(Long idPlan) {
        this.idPlan = idPlan;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
