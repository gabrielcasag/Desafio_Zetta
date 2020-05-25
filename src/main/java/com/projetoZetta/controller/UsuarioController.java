package com.projetoZetta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.projetoZetta.model.Usuario;
import com.projetoZetta.repository.UsuarioRepository;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	private UsuarioRepository usuarioRepository;

	@Autowired
	public UsuarioController(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	@RequestMapping(value="/usuario/cadastrar" , method=RequestMethod.POST)
	public Usuario novoUsuario(@RequestBody Usuario umUsuario) {
		return usuarioRepository.save(umUsuario);
	}
	
	@RequestMapping(value="/usuario/listar")
	public List<Usuario> listarUsuarios() {
		return usuarioRepository.findAll();
	}
	
	@RequestMapping(value="/usuario/excluir" , method=RequestMethod.DELETE)
	public void excluirUsuario(@RequestBody Usuario umUsuario) {
		usuarioRepository.delete(umUsuario);
	}
}
