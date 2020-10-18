package com.fiap.netflix.usuarios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiap.netflix.usuarios.model.Interesse;

public interface InteresseRepository extends JpaRepository<Interesse, Long> {

	public List<Interesse> findByIdUsuario(int idUsuario);

}
