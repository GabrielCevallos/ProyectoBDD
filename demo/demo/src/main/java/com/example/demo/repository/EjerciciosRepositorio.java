package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.Ejercicios;

public interface EjerciciosRepositorio extends JpaRepository<Ejercicios, Long> {
    
}
