package br.com.fiap.sprint3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.sprint3.model.ItemPedidoVenda;

public interface ItemPedidoVendaRepository extends JpaRepository<ItemPedidoVenda, Long>{
  
}