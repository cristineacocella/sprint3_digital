package br.com.fiap.sprint3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.fiap.sprint3.model.ItemPedidoVenda;

public interface ItemPedidoVendaRepository extends JpaRepository<ItemPedidoVenda, Long>{

  // JPQL
@Query(value="select * FROM t_cali_item_pedido_venda A  INNER JOIN t_cali_produto B ON A.produto_id_produto = B.id_produto where a.pedido_venda_id_pedido_venda = 1", nativeQuery = true)
List<ItemPedidoVenda> findAllByIdPedidoVendas(Long id);

}