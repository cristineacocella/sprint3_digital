package br.com.fiap.sprint3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.sprint3.model.Usuario;
import br.com.fiap.sprint3.service.UsuarioService;

@RestController
public class UsuarioController {
  
  @Autowired
  private UsuarioService service;

  
  @GetMapping("/api/usuario/{id}")
  public ResponseEntity<Usuario> findById(@PathVariable Long id) {
	  return ResponseEntity.ok().body(service.findById(id));
  }
  
}
