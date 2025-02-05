package com.example.demo.repository;

import com.example.demo.models.Cliente;
import com.example.demo.models.PlanEntrenamiento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlanEntrenamientoRepositorio extends JpaRepository<PlanEntrenamiento, Long> {
    List<PlanEntrenamiento> findByCliente(Cliente cliente);
    
}
