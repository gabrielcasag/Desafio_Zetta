package com.projetoZetta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projetoZetta.dto.MessageResponseDTO;
import com.projetoZetta.model.Usuario;
import com.projetoZetta.service.UsuarioService;


@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {
	
	private UsuarioService usuarioService;
	
	@Autowired
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	@PostMapping
	public MessageResponseDTO create(@RequestBody Usuario umUsuario) {
		return usuarioService.create(umUsuario);
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
