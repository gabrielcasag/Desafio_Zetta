package com.projetoZetta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projetoZetta.model.Perfil;
import com.projetoZetta.repository.PerfilRepository;

@RestController
@RequestMapping("/perfil")
public class PerfilController {

	private PerfilRepository perfilRepository;

	@Autowired
	public PerfilController(PerfilRepository perfilRepository) {
		this.perfilRepository = perfilRepository;
	}
	
	@RequestMapping(value="/perfil/cadastrar" , method=RequestMethod.POST)
	public Perfil novoPerfil(@RequestBody Perfil umPerfil) {
		return perfilRepository.save(umPerfil);
	}
	
	@RequestMapping(value="/perfil/listar")
	public List<Perfil> listarPerfis() {
		return perfilRepository.findAllByOrderByNome();
	}
	
	@RequestMapping(value="/perfil/excluir" , method=RequestMethod.DELETE)
	public void excluirPerfil(@RequestBody Perfil umPerfil) {
		perfilRepository.delete(umPerfil);
	}
	
}
