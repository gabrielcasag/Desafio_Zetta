package com.projetoZetta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetoZetta.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa,Long>{

}
