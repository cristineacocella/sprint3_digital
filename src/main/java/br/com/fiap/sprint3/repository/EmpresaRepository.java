package br.com.fiap.sprint3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.sprint3.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{

}
