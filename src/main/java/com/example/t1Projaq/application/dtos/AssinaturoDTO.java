package com.example.t1Projaq.application.dtos;

public class AssinaturoDTO {
    private long idCliente;
    private long idAplicativo;

    public AssinaturoDTO(long idCliente, long idAplicativo){
        this.idCliente = idCliente;
        this.idAplicativo = idAplicativo;
    }

    public long getIdCliente(){
        return idCliente;
    }

    public long getIdAplicativo(){
        return idAplicativo;
    }
}
