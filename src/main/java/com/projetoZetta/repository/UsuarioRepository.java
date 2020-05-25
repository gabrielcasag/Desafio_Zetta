package com.projetoZetta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetoZetta.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{

}
