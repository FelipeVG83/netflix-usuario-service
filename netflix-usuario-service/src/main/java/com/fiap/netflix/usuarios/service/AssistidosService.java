package com.fiap.netflix.usuarios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiap.netflix.usuarios.model.Assistidos;
import com.fiap.netflix.usuarios.repository.AssistidosRepository;

@Service
public class AssistidosService {

	@Autowired
	private AssistidosRepository assistidosRepo;
	
	public List<Assistidos> consultarPorIdUsuario(int idUsuario) {
		return assistidosRepo.findByIdUsuario(idUsuario);
	}
	
	public Boolean inserir(Assistidos assistidos) {
		Assistidos result = assistidosRepo.save(assistidos);
		if (result == null) return false;
		return true;
	}
}
