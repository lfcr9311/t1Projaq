package com.example.t1Projaq.domain.repository;

import com.example.t1Projaq.domain.model.ClienteModel;

import java.util.List;

public interface ClienteRepository {
    List<ClienteModel> findAll();
    List<ClienteModel> listaAssinaturasCliente(long id);
    ClienteModel create(ClienteModel cliente);
    ClienteModel findById(long id);
}