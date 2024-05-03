package com.example.t1Projaq.domain.model;

public class UsuarioModel {
  private String usuario;
  private String senha;
  
  public UsuarioModel(String usuario, String senha) {
    this.usuario = usuario;
    this.senha = senha;
  }

  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  @Override
  public String toString() {
    return "UsuarioModel [usuario=" + usuario + ", senha=" + senha + "]";
  }
}
