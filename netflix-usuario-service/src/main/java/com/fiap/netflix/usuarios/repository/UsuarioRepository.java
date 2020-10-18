package com.fiap.netflix.usuarios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiap.netflix.usuarios.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Usuario findById(int Id);
	
	public List<Usuario> findByNomeContainingIgnoreCase(String nome);

}
