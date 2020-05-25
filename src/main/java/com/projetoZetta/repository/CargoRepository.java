package com.projetoZetta.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.projetoZetta.model.Cargo;

public interface CargoRepository extends JpaRepository<Cargo,Long>{
	
	Cargo findByNome(String nome);
	List<Cargo> findAllByOrderByNome();

}
