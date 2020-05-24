package com.projetoZetta.um.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsuarioController {
	
	@RequestMapping("/cadastrarUsuario")
	public String form() {
		return "formUsuario";
	}
}
