package com.projetoZetta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projetoZetta.dto.MessageResponseDTO;
import com.projetoZetta.model.Usuario;
import com.projetoZetta.repository.UsuarioRepository;

@Service
public class UsuarioService {

	private UsuarioRepository usuarioRepository;

	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	public MessageResponseDTO create(Usuario umUsuario) {
		Usuario usuarioSalvo = usuarioRepository.save(umUsuario);
		return MessageResponseDTO.builder().message("Usuario criado com ID:" + usuarioSalvo.getId()).build();
	}
	
	
}
