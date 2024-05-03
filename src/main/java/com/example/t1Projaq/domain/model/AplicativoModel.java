package com.example.t1Projaq.domain.model;

public class AplicativoModel {
  private long id;
  private String nome;
  private float custoMensal;
  
  public AplicativoModel(long id, String nome, float custoMensal) {
    this.id = id;
    this.nome = nome;
    this.custoMensal = custoMensal;
  }

  public long getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public float getCustoMensal() {
    return custoMensal;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setCustoMensal(float custoMensal) {
    this.custoMensal = custoMensal;
  }

  @Override
  public String toString() {
    return "AplicativoModel [id=" + id + ", nome=" + nome + ", custoMensal=" + custoMensal + "]";
  }
}
