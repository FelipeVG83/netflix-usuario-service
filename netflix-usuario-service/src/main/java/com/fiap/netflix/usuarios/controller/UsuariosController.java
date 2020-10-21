package com.fiap.netflix.usuarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.netflix.usuarios.model.Usuario;
import com.fiap.netflix.usuarios.service.UsuariosService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/usuarios")
@Api(value = "Usuários Controller")
public class UsuariosController {

	@Autowired
	private UsuariosService usuarioService;

	@GetMapping()
	@ApiOperation(value = "Retorna lista de usuários pesquisando por um nome")
	ResponseEntity<List<Usuario>> consultarUsuariosPorNome(@RequestParam(value="nome") String nome) {
		List<Usuario> result = usuarioService.consultarPorNome(nome);
		if (result == null || result.isEmpty()) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);	
		}
		return new ResponseEntity<>(result, HttpStatus.OK);
		
	}

	@GetMapping(value = "/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Retorna usuário pesquisando por um id")
	ResponseEntity<Usuario> consultarUsuarioPorId(@PathVariable int id) {
		Usuario result = usuarioService.consultarPorId(id);
		if (result == null) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);	
		}
		return new ResponseEntity<Usuario>(result, HttpStatus.OK);
	}
}
