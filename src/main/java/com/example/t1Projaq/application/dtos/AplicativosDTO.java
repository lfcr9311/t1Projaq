package com.example.t1Projaq.application.dtos;

public class AplicativosDTO {
  private long id;
  private String nome;
  private float custo;
  
  public AplicativosDTO(long id, String nome, float custo) {
    this.id = id;
    this.nome = nome;
    this.custo = custo;
  }

  public long getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public float getCusto() {
    return custo;
  }
}