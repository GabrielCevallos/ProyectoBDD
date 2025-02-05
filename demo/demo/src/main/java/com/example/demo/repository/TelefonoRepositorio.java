package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.Telefono;

public interface TelefonoRepositorio extends JpaRepository<Telefono, Long> {
    // TODO EL CRUD YA VIENE IMPLEMENTADO POR LA LIBRERIA
}
