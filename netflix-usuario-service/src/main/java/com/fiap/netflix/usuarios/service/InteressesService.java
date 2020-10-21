package com.fiap.netflix.usuarios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiap.netflix.usuarios.model.Interesse;
import com.fiap.netflix.usuarios.repository.InteresseRepository;

@Service
public class InteressesService {

	@Autowired
	private InteresseRepository interesseRepo;
	
	public List<Interesse> consultarPorIdUsuario(int idUsuario) {
		return interesseRepo.findByIdUsuario(idUsuario);
	}
	
	public Boolean inserir(Interesse interesse) {
		Interesse result = interesseRepo.save(interesse);
		if (result == null) return false;
		return true;
	}
}
