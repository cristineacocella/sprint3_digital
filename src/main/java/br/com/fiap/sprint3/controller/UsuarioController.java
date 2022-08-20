package br.com.fiap.sprint3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.sprint3.service.UsuarioService;

@RestController
public class UsuarioController {
  
  @Autowired
  private UsuarioService service;

  
}
