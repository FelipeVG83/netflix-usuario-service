package com.fiap.netflix.usuarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.netflix.usuarios.model.Interesse;
import com.fiap.netflix.usuarios.service.InteressesService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/interesses")
@Api(value = "Interesses Controller")
public class InteressesController {

	@Autowired
	private InteressesService interessesService;

	@GetMapping(value = "/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Retorna lista de interesses de um usuário")
	ResponseEntity<List<Interesse>> consultarUsuarioPorId(@PathVariable int id) {
		List<Interesse> result = interessesService.consultarPorIdUsuario(id);
		if (result == null || result.isEmpty()) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);	
		}
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	@PostMapping(consumes = "application/json")
	@ApiOperation(value = "Adiciona um interesse ao perfil de um usuário", produces=MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<Boolean> inserir(@RequestBody Interesse interesse) {
		Boolean result = interessesService.inserir(interesse);
		if (result == false) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);	
		}
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}
