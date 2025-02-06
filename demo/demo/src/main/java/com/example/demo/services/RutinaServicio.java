package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.models.Rutina;
import com.example.demo.repository.RutinaRepositorio;

public class RutinaServicio {
    
    @Autowired
    private RutinaRepositorio rutinaRepositorio;

    public List<Rutina> listarRutina() {
        return rutinaRepositorio.findAll();
    }

    public Rutina buscarRutina(Long id) {
        return rutinaRepositorio.findById(id).orElse(null);
    }

    public Rutina guardarRutina(Rutina rutina) {
        return rutinaRepositorio.save(rutina);
    }

    public void eliminarRutina(Long id) {
        rutinaRepositorio.deleteById(id);
    }
}
