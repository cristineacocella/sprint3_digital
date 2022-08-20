package br.com.fiap.sprint3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.sprint3.model.Usuario;
import br.com.fiap.sprint3.repository.UsuarioRepository;

@Service
public class UsuarioService {

  @Autowired
  private UsuarioRepository repo;


  public Usuario findById(Long id){
    return repo.findById(id).get();
  }
  

}
