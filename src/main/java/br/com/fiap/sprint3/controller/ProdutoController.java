package br.com.fiap.sprint3.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.sprint3.model.Produto;
import br.com.fiap.sprint3.service.ProdutoService;

@RestController
public class ProdutoController {
  
  @Autowired
  private ProdutoService service;

  @GetMapping("/api/produto/{id}")
    public ResponseEntity<Produto> findById(@PathVariable Long id){
      Optional<Produto> product = service.findById(id);
      return ResponseEntity.of(product);
    }
}
