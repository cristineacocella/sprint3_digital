package br.com.fiap.sprint3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.fiap.sprint3.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

// @Query("FROM t_cali_item_pedido_venda t JOIN t.produto p where t.pedido_venda_id_pedido_venda = ?1")
// List<Produto> findAllByIdProduto(Long id);
  
}
