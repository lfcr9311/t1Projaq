package com.example.t1Projaq.domain.repository;

import com.example.t1Projaq.domain.model.AplicativoModel;

import java.util.List;

public interface AplicativoRepository {
    List<AplicativoModel> findAll();

}
