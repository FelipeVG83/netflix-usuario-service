package com.fiap.netflix.usuarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.netflix.usuarios.model.Assistidos;
import com.fiap.netflix.usuarios.model.Interesse;
import com.fiap.netflix.usuarios.model.Usuario;
import com.fiap.netflix.usuarios.service.InteressesService;

@RestController
@RequestMapping("/interesses")
public class InteressesController {

	@Autowired
	private InteressesService interessesService;

	@GetMapping(value = "/{id}")
	ResponseEntity<List<Interesse>> consultarUsuarioPorId(@PathVariable int idUsuario) {
		List<Interesse> result = interessesService.consultarPorIdUsuario(idUsuario);
		if (result == null || result.isEmpty()) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);	
		}
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	@PostMapping(consumes = "application/json")
	ResponseEntity<Boolean> inserir(@RequestBody Interesse interesse) {
		Boolean result = interessesService.inserir(interesse);
		if (result == false) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);	
		}
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}
