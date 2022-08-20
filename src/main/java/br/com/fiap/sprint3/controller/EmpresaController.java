package br.com.fiap.sprint3.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import br.com.fiap.sprint3.model.Empresa;


import br.com.fiap.sprint3.service.EmpresaService;

@RestController
public class EmpresaController {
  
  @Autowired
  private EmpresaService service;

  @GetMapping("/api/empresa")
  public ResponseEntity<List<Empresa>> findAll(){
    return ResponseEntity.status(HttpStatus.OK).body(service.listAll());
  }

  @GetMapping("/api/empresa/{id}")
  public ResponseEntity<Empresa> findById(@PathVariable Long id){
    Empresa empresa = service.findById(id);
    return ResponseEntity.status(HttpStatus.OK).body(empresa);
  }
}
