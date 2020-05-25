package com.projetoZetta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoZetta.model.Perfil;

public interface PerfilRepository extends JpaRepository<Perfil,Long>{

	Perfil findByNome(String nome);
    List<Perfil> findAllByOrderByNome();
    
}
