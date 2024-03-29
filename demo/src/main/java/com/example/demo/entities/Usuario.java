package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Representa a un usuario, el cual es identificado con un ID. Además posee nombre y apellido
 * Esta entidad tiene sus atributos, constructor, setters y getters correspondientes.
 */

@Entity
public class Usuario {
	
	private String nombre;
	private String apellido;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	public Usuario() {}
	
	public Usuario(String nombre, String apellido, int id) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
}
