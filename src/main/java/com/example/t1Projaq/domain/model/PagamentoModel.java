package com.example.t1Projaq.domain.model;

import java.util.Date;

public class PagamentoModel {
  private long id;
  private AssinaturaModel assinatura;
  private float valorPago;
  private Date dataPagamento;
  private String promocao;
  
  public long getId() {
    return id;
  }
  public AssinaturaModel getAssinatura() {
    return assinatura;
  }
  public float getValorPago() {
    return valorPago;
  }
  public Date getDataPagamento() {
    return dataPagamento;
  }
  public String getPromocao() {
    return promocao;
  }

  public void setAssinatura(AssinaturaModel assinatura) {
    this.assinatura = assinatura;
  }

  public void setValorPago(float valorPago) {
    this.valorPago = valorPago;
  }

  public void setDataPagamento(Date dataPagamento) {
    this.dataPagamento = dataPagamento;
  }

  public void setPromocao(String promocao) {
    this.promocao = promocao;
  }
}
