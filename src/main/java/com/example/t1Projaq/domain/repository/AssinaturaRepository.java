package com.example.t1Projaq.domain.repository;

import com.example.t1Projaq.domain.model.AssinaturaModel;

public interface AssinaturaRepository {
    AssinaturaModel assinatura();
    AssinaturaModel findById(int id);

}
