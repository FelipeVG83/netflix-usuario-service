package com.fiap.netflix.usuarios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiap.netflix.usuarios.model.Usuario;
import com.fiap.netflix.usuarios.repository.UsuarioRepository;

@Service
public class UsuariosService {

	@Autowired
	private UsuarioRepository usuarioRepo;
	
	public Usuario consultarPorId(int id) {
		return usuarioRepo.findById(id);
	}

	public List<Usuario> consultarPorNome(String nome) {
		return usuarioRepo.findByNomeContainingIgnoreCase(nome);
	}
	
	public boolean inserir(Usuario usuario) {
		Usuario result = usuarioRepo.save(usuario);
		if (result == null) {
			return false;	
		}
		return true;
	}
	
	
}
