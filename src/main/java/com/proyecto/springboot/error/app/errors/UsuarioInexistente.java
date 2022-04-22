package com.proyecto.springboot.error.app.errors;

public class UsuarioInexistente extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UsuarioInexistente(String id) {
		super("usuario con: ".concat(id).concat(" no existe."));
		// TODO Auto-generated constructor stub
	}

	
	
}
