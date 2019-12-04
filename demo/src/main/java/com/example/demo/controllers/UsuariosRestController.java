package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Usuario;
import com.example.demo.services.UsuarioService;

/**
 * Controller donde se especifica desde que URL se llama a cada método declarado en la clase UsuarioService 
 */

@RestController
public class UsuariosRestController {

	@Autowired
	private UsuarioService service;

	@GetMapping("/usuario")
	public List<Usuario> obtenerTodos() {
		return service.obtenerTodos();
	}

	@GetMapping("/usuario/{id}")
	public Usuario obtenerUno(@PathVariable Integer id) {
		return service.obtenerUno(id);
	}

	@DeleteMapping("/usuario/{id}")
	public Usuario borrarUno(@PathVariable Integer id) {
		return service.borrar(id);
	}

	@PostMapping("/usuario")
	public Usuario nuevo(@RequestBody Usuario user) {
		return service.nuevo(user);
	}

	@PutMapping("/usuario")
	public Usuario modifica(@RequestBody Usuario user) {
		return service.actualizar(user);
	}

}
