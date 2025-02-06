package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.Rutina;

public interface RutinaRepositorio extends JpaRepository<Rutina, Long> {
    
}
