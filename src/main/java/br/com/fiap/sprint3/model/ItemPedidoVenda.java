package br.com.fiap.sprint3.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name= "T_CALI_ITEM_PEDIDO_VENDA")
public class ItemPedidoVenda implements Serializable{
  
  @EmbeddedId
  @Column(name="id_item")
  private ItemPedidoVendaPk id = new ItemPedidoVendaPk();
 
  @ManyToOne
  @JsonIgnore
  @MapsId("idPedidoVenda")
  private PedidoVenda pedidoVenda;

 
  @ManyToOne
  @MapsId("idProduto")
  private Produto produto;

  @Column(name="qt_pedida")
  private int quantidadePedida;
  
  @Column(name="vl_desconto_item_venda")
  private BigDecimal valorDescontoItemVenda;

  @Column(name="vl_unitario_venda")
  private BigDecimal valorUnitarioVenda;
  
  @Column(name="vl_total_item_venda")
  private BigDecimal valorTotalItemVenda;

  public ItemPedidoVenda() {
  }

  public ItemPedidoVenda(PedidoVenda pedidoVenda, Produto produto, int quantidadePedida, BigDecimal valorUnitarioVenda,
      BigDecimal valorTotalItemVenda) {
    this.pedidoVenda = pedidoVenda;
    this.produto = produto;
    this.quantidadePedida = quantidadePedida;
    this.valorUnitarioVenda = valorUnitarioVenda;
    this.valorTotalItemVenda = valorTotalItemVenda;
  }

  

  public ItemPedidoVenda(Produto produto, int quantidadePedida) {
    this.produto = produto;
    this.quantidadePedida = quantidadePedida;
  }

  public ItemPedidoVenda(Produto produto, int quantidadePedida, 
      BigDecimal valorUnitarioVenda) {
    this.produto = produto;
    this.quantidadePedida = quantidadePedida;
    this.valorUnitarioVenda = valorUnitarioVenda;
    
  }

  public ItemPedidoVendaPk getId() {
    return id;
  }

  public void setId(ItemPedidoVendaPk id) {
    this.id = id;
  }

  public PedidoVenda getPedidoVenda() {
    return pedidoVenda;
  }

  public void setPedidoVenda(PedidoVenda pedidoVenda) {
    this.pedidoVenda = pedidoVenda;
  }

  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public int getQuantidadePedida() {
    return quantidadePedida;
  }

  public void setQuantidadePedida(int quantidadePedida) {
    this.quantidadePedida = quantidadePedida;
  }

  public BigDecimal getValorDescontoItemVenda() {
    return valorDescontoItemVenda;
  }

  public void setValorDescontoItemVenda(BigDecimal valorDescontoItemVenda) {
    this.valorDescontoItemVenda = valorDescontoItemVenda;
  }

  public BigDecimal getValorUnitarioVenda() {
    return valorUnitarioVenda;
  }

  public void setValorUnitarioVenda(BigDecimal valorUnitarioVenda) {
    this.valorUnitarioVenda = valorUnitarioVenda;
  }

  public BigDecimal getValorTotalItemVenda() {
    return valorTotalItemVenda;
  }

  public void setValorTotalItemVenda(BigDecimal valorTotalItemVenda) {
    this.valorTotalItemVenda = valorTotalItemVenda;
  }

@Override
public String toString() {
	return "ItemPedidoVenda [id=" + id + ", pedidoVenda=" + pedidoVenda + ", produto=" + produto + ", quantidadePedida="
			+ quantidadePedida + ", valorDescontoItemVenda=" + valorDescontoItemVenda + ", valorUnitarioVenda="
			+ valorUnitarioVenda + ", valorTotalItemVenda=" + valorTotalItemVenda + "]";
}
  
  




}
