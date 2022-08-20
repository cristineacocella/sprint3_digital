package br.com.fiap.sprint3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.sprint3.model.Produto;
import br.com.fiap.sprint3.repository.ProdutoRepository;

@Service
public class ProdutoService {
  
  @Autowired
  private ProdutoRepository repo;

  public List<Produto> listAll() {
    return repo.findAll();
  }

  public Produto findById(Long  listaIdProdutos) {
    return repo.findById(listaIdProdutos).get();
  }

}
