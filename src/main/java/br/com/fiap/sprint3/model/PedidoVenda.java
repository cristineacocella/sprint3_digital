package br.com.fiap.sprint3.model;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="T_CALI_PEDIDO_VENDA")
public class PedidoVenda {
  
  @Id 
  @Column(name = "id_pedido_venda")
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private long id;

  @ManyToOne
  @JoinColumn(name="id_empresa")
  private Empresa empresa;

  @ManyToOne
  @JoinColumn(name="id_usuario")
  private Usuario usuario;


  @Column(name = "dt_pedido_venda")
  private Instant dataPedidoVenda;
  

  @Column(name = "vl_total_pedido_venda")
  private BigDecimal valorTotalPedidoVenda;

  
  @ManyToMany
  @JoinColumns({@JoinColumn(name= "id_pedido_venda"),@JoinColumn(name="id_produto")})
  private List<ItemPedidoVenda> itemPedidoVendas = new ArrayList<ItemPedidoVenda>();

  public PedidoVenda(){

  }
  
  public PedidoVenda(Empresa empresa, Usuario usuario, Instant dataPedidoVenda
    ) {
    this.empresa = empresa;
    this.usuario = usuario;
    this.dataPedidoVenda = dataPedidoVenda;
  }


  public PedidoVenda(Empresa empresa, Usuario usuario, Instant dataPedidoVenda, BigDecimal valorTotalPedidoVenda) {
    this.empresa = empresa;
    this.usuario = usuario;
    this.dataPedidoVenda = dataPedidoVenda;
    this.valorTotalPedidoVenda = valorTotalPedidoVenda;
  }


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }



  public Instant getDataPedidoVenda() {
	return dataPedidoVenda;
}



public void setDataPedidoVenda(Instant dataPedidoVenda) {
	this.dataPedidoVenda = dataPedidoVenda;
}



public BigDecimal getValorTotalPedidoVenda() {
    return valorTotalPedidoVenda;
  }

  public void setValorTotalPedidoVenda(BigDecimal valorTotalPedidoVenda) {
    this.valorTotalPedidoVenda = valorTotalPedidoVenda;
}

  public Empresa getEmpresa() {
    return empresa;
  }

  public void setEmpresa(Empresa empresa) {
    this.empresa = empresa;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  public List<ItemPedidoVenda> getItemPedidoVendas() {
    return itemPedidoVendas;
  }

  public void setItemPedidoVendas(List<ItemPedidoVenda> itemPedidoVendas) {
    this.itemPedidoVendas = itemPedidoVendas;
  }

  public void adicionar(ItemPedidoVenda itemPedidoVenda){
    this.itemPedidoVendas.add(itemPedidoVenda);
  }

  @Override
  public String toString() {
    return "PedidoVenda [dataPedidoVenda=" + dataPedidoVenda + ", empresa=" + empresa + ", id=" + id
        + ", itemPedidoVendas=" + itemPedidoVendas + ", usuario=" + usuario + ", valorTotalPedidoVenda="
        + valorTotalPedidoVenda + "]";
  } 
  
  
}
