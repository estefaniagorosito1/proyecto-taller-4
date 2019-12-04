package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Usuario;
import com.example.demo.repositories.UsuarioRepository;

/**
 * Implementacion de los métodos declarados en UsuarioService.
 */

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository repo;

	/**
	 * Recupera todos los usuarios registrados en la base de datos
	 */
	@Override
	public List<Usuario> obtenerTodos() {
		return repo.findAll();
	}

	/**
	 * Recupera un usuario según su ID
	 * @return usuario buscado o null
	 */

	@Override
	public Usuario obtenerUno(Integer id) {
		return repo.findById(id).orElse(null);
	}

	/**
	 * Crea un nuevo usuario - ALTA
	 * @return usuario que fue creado
	 */

	@Override
	public Usuario nuevo(Usuario usuario) {
		return repo.save(usuario);
	}

	/**
	 * Borra un usuario - BAJA
	 * @return usuario que fue borrado
	 */

	@Override
	public Usuario borrar(Integer id) {
		Usuario usuario = repo.findById(id).orElse(null);
		repo.delete(usuario);
		return usuario;
	}

	/**
	 * Actualiza la informacion de un usuario - MODIFICACION
	 * @return usuario modificado 
	 */

	@Override
	public Usuario actualizar(Usuario usuario) {
		Integer id = usuario.getId();
		Usuario tmp = repo.findById(id).orElse(null);

		if (tmp != null) {
			tmp.setNombre(usuario.getNombre());
			tmp.setApellido(usuario.getApellido());
			repo.save(tmp);
		}

		return tmp;
	}

}
