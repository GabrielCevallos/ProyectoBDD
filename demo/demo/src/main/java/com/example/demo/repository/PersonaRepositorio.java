package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.Persona;

public interface PersonaRepositorio extends JpaRepository<Persona, Long> {
    // TODO EL CRUD YA VIENE IMPLEMENTADO POR LA LIBRERIA
}
