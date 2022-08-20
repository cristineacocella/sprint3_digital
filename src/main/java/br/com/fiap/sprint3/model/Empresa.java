package br.com.fiap.sprint3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_CALI_EMPRESA")
public class Empresa {
  
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name="id_empresa")
  private long id;

  @Column(name="nr_cnpj")
  private long cnpj;

  @Column(name="nm_razao_social")
  private String razaoSocial;

  @Column(name="nm_fantasia")
  private String nomeFantasia;

  
  public Empresa() {
  }


  public long getId() {
    return id;
  }


  public void setId(long id) {
    this.id = id;
  }


  public long getCnpj() {
    return cnpj;
  }


  public void setCnpj(long cnpj) {
    this.cnpj = cnpj;
  }


  public String getRazaoSocial() {
    return razaoSocial;
  }


  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }


  public String getNomeFantasia() {
    return nomeFantasia;
  }


  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }
  
  
}
