package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Usuario;

/**
 * Interfaz de servicio. Declara los métodos que van a ser utilizados.
 */
public interface UsuarioService {

	List<Usuario> obtenerTodos();
	
	Usuario obtenerUno(Integer id);

	Usuario borrar(Integer id);

	Usuario nuevo(Usuario user);
	
	Usuario actualizar(Usuario u);
}
