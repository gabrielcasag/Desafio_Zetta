package com.projetoZetta.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoZetta.dto.MessageResponseDTO;
import com.projetoZetta.models.Usuario;
import com.projetoZetta.repository.UsuarioRepository;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {
	
	private UsuarioRepository repo;
	
	@Autowired
	public UsuarioController(UsuarioRepository repo){
		this.repo = repo;
	}

	@PostMapping
	public MessageResponseDTO create(@RequestBody Usuario usuario) {
		Usuario usuarioSalvo = repo.save(usuario);
		return MessageResponseDTO.builder().message("Usuario criado com ID:" + usuarioSalvo.getId()).build();
	}
	
	
	
	
	
	
	
	/*
	@Autowired
	private UsuarioRepository repo;
	
	@RequestMapping(value="/cadastrarUsuario", method=RequestMethod.GET)
	public String form() {	
		return "/usuario/formUsuario";
	}
	
	@RequestMapping(value="/cadastrarUsuario", method=RequestMethod.POST)
	public String form(Usuario usuario) {
		repo.save(usuario);
		return "redirect:/cadastrarUsuario";
	}*/
}
