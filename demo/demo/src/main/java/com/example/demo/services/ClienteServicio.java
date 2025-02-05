package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Cliente;
import com.example.demo.repository.ClienteRepositorio;

@Service
public class ClienteServicio {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public List<Cliente> findAll() {
        return clienteRepositorio.findAll();
    }

    public Optional<Cliente> findById(long id) {
        return clienteRepositorio.findById(id);
    }

    public Cliente save(Cliente cliente) {
        return clienteRepositorio.save(cliente);
    }

    public void deleteById(long id) {
        clienteRepositorio.deleteById(id);
    }
}


