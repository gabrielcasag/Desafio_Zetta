package com.projetoZetta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projetoZetta.models.Usuario;
import com.projetoZetta.repository.UsuarioRepository;

@CrossOrigin
@Controller
public class UsuarioController {
	
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
	}
}
