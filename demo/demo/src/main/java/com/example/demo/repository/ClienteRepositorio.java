package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {
    // TODO EL CRUD YA VIENE IMPLEMENTADO POR LA LIBRERIA
}