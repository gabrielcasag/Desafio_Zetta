package com.projetoZetta.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projetoZetta.models.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,Long>{

}
