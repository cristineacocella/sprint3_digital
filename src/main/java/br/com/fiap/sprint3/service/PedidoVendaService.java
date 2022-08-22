package br.com.fiap.sprint3.service;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import br.com.fiap.sprint3.model.ItemPedidoVenda;
import br.com.fiap.sprint3.model.PedidoVenda;
import br.com.fiap.sprint3.model.Produto;
import br.com.fiap.sprint3.model.Usuario;
import br.com.fiap.sprint3.repository.ItemPedidoVendaRepository;
import br.com.fiap.sprint3.repository.PedidoVendaRepository;
import br.com.fiap.sprint3.repository.ProdutoRepository;

@Service
public class PedidoVendaService {

	@Autowired
	PedidoVendaRepository repo;

	@Autowired
	ItemPedidoVendaRepository repositoryItem;

	@Autowired
	ProdutoRepository repositoryProduto;
	
	public PedidoVenda findById(Long id) {
		
		List<ItemPedidoVenda> listaitemPedidoVenda = new ArrayList<ItemPedidoVenda>();
		listaitemPedidoVenda = repositoryItem.findAllByIdPedidoVendas(id);
		
		// for (ItemPedidoVenda itemPedidoVenda : listaitemPedidoVenda) {
			// List<Produto> listaProduto = repositoryProduto.findAllByIdProduto(itemPedidoVenda.getProduto().getId());
			// for (Produto produto : listaProduto) {
			// 	itemPedidoVenda.setProduto(produto);
			// }
		// }
		PedidoVenda pedidoVenda = repo.findById(id).get();
		pedidoVenda.setItemPedidoVendas(listaitemPedidoVenda);
		// System.out.println(listaitemPedidoVenda);
		return pedidoVenda;
	}

	public PedidoVenda compra(Usuario usuario, List<ItemPedidoVenda> itemPedidoVenda) {
		BigDecimal valorTotalItem = new BigDecimal(0);
		PedidoVenda pedidoVenda = new PedidoVenda();
		ItemPedidoVenda newItemPedidoVenda = new ItemPedidoVenda();
		List<ItemPedidoVenda> listaitemPedidoVenda = new ArrayList<ItemPedidoVenda>();
		repo.save(pedidoVenda);

		for (ItemPedidoVenda item : itemPedidoVenda) {
			valorTotalItem = valorTotalItem
					.add(valorTotal(item.getQuantidadePedida(), item.getProduto().getPrecoUnitario()));
			pedidoVenda.setEmpresa(item.getProduto().getEmpresa());
			pedidoVenda.setUsuario(usuario);
			pedidoVenda.setDataPedidoVenda(Instant.now());

			newItemPedidoVenda = new ItemPedidoVenda(pedidoVenda, item.getProduto(), item.getQuantidadePedida(),
					item.getProduto().getPrecoUnitario(),
					valorTotal(item.getQuantidadePedida(), item.getProduto().getPrecoUnitario()));
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
