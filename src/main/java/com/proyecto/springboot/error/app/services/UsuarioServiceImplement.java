package com.proyecto.springboot.error.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.proyecto.springboot.error.app.models.Usuario;

@Service
public class UsuarioServiceImplement implements UsuarioServiceInterface {

	private List<Usuario> listaUsuarios;
	
	
	
	public UsuarioServiceImplement() {
		this.listaUsuarios = new ArrayList<>();
		this.listaUsuarios.add(new Usuario(1,"nombre1","apellido1"));
		this.listaUsuarios.add(new Usuario(2,"nombre2","apellido2"));
		this.listaUsuarios.add(new Usuario(3,"nombre3","apellido3"));
		this.listaUsuarios.add(new Usuario(4,"nombre4","apellido4"));
		this.listaUsuarios.add(new Usuario(5,"nombre5","apellido5"));
	}

	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario buscarPorId(Integer id) {
		Usuario resultado = null;
		for(Usuario u: this.listaUsuarios) {
			if(u.getId().equals(id) ) {
				resultado = u;
				break;
			}
		}
		return resultado;
	}

	@Override
	public Optional<Usuario> buscarPorIdOptional(Integer id) {
		// TODO Auto-generated method stub
		Usuario usuario = this.buscarPorId(id);
		return Optional.ofNullable(usuario);
	}

}
