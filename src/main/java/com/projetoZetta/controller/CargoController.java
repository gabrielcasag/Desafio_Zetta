package com.projetoZetta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.projetoZetta.model.Cargo;
import com.projetoZetta.repository.CargoRepository;

@RestController
@RequestMapping("/cargo")
public class CargoController {

	private CargoRepository cargoRepository;

	@Autowired
	public CargoController(CargoRepository cargoRepository) {
		this.cargoRepository = cargoRepository;
	}
	
	@RequestMapping(value="/cargo/cadastrar" , method=RequestMethod.POST)
	public Cargo novoCargo (@RequestBody Cargo umCargo) {
		return cargoRepository.save(umCargo);
	}
	
	@RequestMapping(value="/cargo/listar")
	@ResponseBody
	public List<Cargo> listarCargos(){
		return cargoRepository.findAllByOrderByNome();
	}
	
	@RequestMapping(value="/cargo/excluir" , method=RequestMethod.DELETE)
	@ResponseBody
	public void excluirCargo(@RequestBody Cargo umCargo) {
		cargoRepository.delete(umCargo);
	}
	
}
