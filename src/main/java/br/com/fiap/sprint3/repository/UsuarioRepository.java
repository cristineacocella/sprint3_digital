package br.com.fiap.sprint3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.sprint3.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
