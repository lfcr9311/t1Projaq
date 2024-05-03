package com.example.t1Projaq.domain.model;

import java.util.Date;

public class AssinaturaModel {
    private long id;
    private AplicativoModel aplicativo;
    private ClienteModel cliente;
    private Date inicioVigencia;
    private Date fimVigencia;
    
    public AssinaturaModel (long id, AplicativoModel aplicativo, ClienteModel cliente, Date inicioVigencia,Date fimVigencia){
        this.id = id;
        this.aplicativo = aplicativo;
        this.cliente = cliente;
        this.inicioVigencia = inicioVigencia;
        this.fimVigencia = fimVigencia;
    }

    public long getId() {
        return id;
    }
        
    public AplicativoModel getAplicativo() {
      return aplicativo;
    }

    public ClienteModel getCliente() {
      return cliente;
    }

    public Date getInicioVigencia() {
      return inicioVigencia;
    }

    public Date getFimVigencia() {
      return fimVigencia;
    }

    public void setAplicativo(AplicativoModel aplicativo) {
        this.aplicativo = aplicativo;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public void setInicioVigencia(Date inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }

    public void setFimVigencia(Date fimVigencia) {
        this.fimVigencia = fimVigencia;
    }
}