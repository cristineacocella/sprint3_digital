package br.com.fiap.sprint3.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ItemPedidoVendaPk implements Serializable{
 
  private long idPedidoVenda;
  private long idProduto;
  
  public ItemPedidoVendaPk() {
  }
  public ItemPedidoVendaPk(long idPedidoVenda, long idProduto) {
    this.idPedidoVenda = idPedidoVenda;
    this.idProduto = idProduto;
  }
  public long getIdPedidoVenda() {
    return idPedidoVenda;
  }
  public void setIdPedidoVenda(long idPedidoVenda) {
    this.idPedidoVenda = idPedidoVenda;
  }
  public long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(long idProduto) {
    this.idProduto = idProduto;
  }
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (idPedidoVenda ^ (idPedidoVenda >>> 32));
    result = prime * result + (int) (idProduto ^ (idProduto >>> 32));
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    ItemPedidoVendaPk other = (ItemPedidoVendaPk) obj;
    if (idPedidoVenda != other.idPedidoVenda)
      return false;
    if (idProduto != other.idProduto)
      return false;
    return true;
  }

  
  
  
}
