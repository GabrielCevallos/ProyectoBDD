package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.models.Ejercicios;
import com.example.demo.repository.EjerciciosRepositorio;

public class EjerciciosServicio {
    
    @Autowired
    private EjerciciosRepositorio ejerciciosRepositorio;

    public List<Ejercicios> listarEjercicios() {
        return ejerciciosRepositorio.findAll();
    }

    public Ejercicios buscarEjercicios(Long id) {
        return ejerciciosRepositorio.findById(id).orElse(null);
    }

    public Ejercicios guardarEjercicios(Ejercicios ejercicios) {
        return ejerciciosRepositorio.save(ejercicios);
    }

    public void eliminarEjercicios(Long id) {
        ejerciciosRepositorio.deleteById(id);
    }
}
