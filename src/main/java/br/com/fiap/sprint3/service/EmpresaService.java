package br.com.fiap.sprint3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.sprint3.model.Empresa;
import br.com.fiap.sprint3.repository.EmpresaRepository;

@Service
public class EmpresaService {

  @Autowired
  private EmpresaRepository repo;

  public List<Empresa> listAll() {
    return repo.findAll();
  }

  public Empresa findById(Long id) {
    return repo.findById(id).get();
  }

}
