package com.fiap.netflix.usuarios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiap.netflix.usuarios.model.Assistidos;

public interface AssistidosRepository extends JpaRepository<Assistidos, Long> {

	public List<Assistidos> findByIdUsuario(int idUsuario);

}
