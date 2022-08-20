package br.com.fiap.sprint3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.sprint3.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
  
}
