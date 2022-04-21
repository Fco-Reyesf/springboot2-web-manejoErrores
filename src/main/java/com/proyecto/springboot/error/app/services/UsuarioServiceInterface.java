package com.proyecto.springboot.error.app.services;

import java.util.List;

import com.proyecto.springboot.error.app.models.Usuario;

public interface UsuarioServiceInterface {

	public List<Usuario> listar();
	public Usuario buscarPorId(Integer id);
	
}
