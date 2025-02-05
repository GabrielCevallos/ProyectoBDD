package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
    // TODO EL CRUD YA VIENE IMPLEMENTADO POR LA LIBRERIA
}
