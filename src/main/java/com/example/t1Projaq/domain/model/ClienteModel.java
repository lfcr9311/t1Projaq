package com.example.t1Projaq.domain.model;

public class ClienteModel {
  
  private long id;
  private String nome;
  private String email;

  public ClienteModel (long id, String nome, String email){
    this.id = id;
    this.nome = nome;
    this.email = nome;
  }

  public long getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public String email() {
    return email;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setEmail(String email) {
    this.email = email;
  }

}
