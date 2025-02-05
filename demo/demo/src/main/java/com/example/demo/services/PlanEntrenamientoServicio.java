package com.example.demo.services;

import com.example.demo.models.PlanEntrenamiento;
import com.example.demo.repository.PlanEntrenamientoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class PlanEntrenamientoServicio {

        @Autowired
        private PlanEntrenamientoRepositorio planEntrenamientoRepositorio;

        public List<PlanEntrenamiento> listarPlanesEntrenamiento() {
            return planEntrenamientoRepositorio.findAll();
        }

        public PlanEntrenamiento buscarPlanEntrenamiento(Long id) {
            return planEntrenamientoRepositorio.findById(id).orElse(null);
        }

        public PlanEntrenamiento guardarPlanEntrenamiento(PlanEntrenamiento planEntrenamiento) {
            return planEntrenamientoRepositorio.save(planEntrenamiento);
        }

        public void eliminarPlanEntrenamiento(Long id) {
            planEntrenamientoRepositorio.deleteById(id);
        }
    }

