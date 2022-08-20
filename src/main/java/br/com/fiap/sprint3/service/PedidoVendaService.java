package br.com.fiap.sprint3.service;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import br.com.fiap.sprint3.model.ItemPedidoVenda;
import br.com.fiap.sprint3.model.PedidoVenda;

import br.com.fiap.sprint3.model.Usuario;
import br.com.fiap.sprint3.repository.ItemPedidoVendaRepository;
import br.com.fiap.sprint3.repository.PedidoVendaRepository;


@Service
public class PedidoVendaService {
 
  @Autowired
  PedidoVendaRepository repo;
  
  @Autowired
  ItemPedidoVendaRepository repositoryItem;

  public List<PedidoVenda> index(){
    return repo.findAll();
  }

  public PedidoVenda compra(Usuario usuario, List<ItemPedidoVenda> itemPedidoVenda) {
    BigDecimal valorTotalItem = new BigDecimal(0);
    PedidoVenda pedidoVenda = new PedidoVenda();
    ItemPedidoVenda newItemPedidoVenda = new ItemPedidoVenda();
    List<ItemPedidoVenda> listaitemPedidoVenda = new ArrayList<ItemPedidoVenda>();
    repo.save(pedidoVenda);

    for (ItemPedidoVenda item : itemPedidoVenda) {
      valorTotalItem = valorTotalItem.add(valorTotal(item.getQuantidadePedida(), item.getProduto().getPrecoUnitario()));
      pedidoVenda.setEmpresa(item.getProduto().getEmpresa());
      pedidoVenda.setUsuario(usuario); 
      pedidoVenda.setDataPedidoVenda(Instant.now());
  
      newItemPedidoVenda = new ItemPedidoVenda(pedidoVenda, item.getProduto(),item.getQuantidadePedida(),item.getProduto().getPrecoUnitario(),
      valorTotal(item.getQuantidadePedida(), item.getProduto().getPrecoUnitario()));
      // item.setPedidoVenda(pedidoVenda)
      repositoryItem.save(newItemPedidoVenda);
      listaitemPedidoVenda.add(newItemPedidoVenda);
    }
    pedidoVenda.setValorTotalPedidoVenda(valorTotalItem);
    repo.save(pedidoVenda);
    pedidoVenda.setItemPedidoVendas(listaitemPedidoVenda);
    return pedidoVenda;

	}

	public BigDecimal valorTotal(int quantidade, BigDecimal valorUnitario) {
		BigDecimal quantidadeBigDecimal = new BigDecimal(quantidade);
		return valorUnitario.multiply(quantidadeBigDecimal);
	}
  
}
