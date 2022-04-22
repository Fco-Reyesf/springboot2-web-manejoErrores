package com.proyecto.springboot.error.app.services;

import java.util.List;
import java.util.Optional;

import com.proyecto.springboot.error.app.models.Usuario;

public interface UsuarioServiceInterface {

	public List<Usuario> listar();
	public Usuario buscarPorId(Integer id);
	public Optional<Usuario> buscarPorIdOptional(Integer id);
	
}
