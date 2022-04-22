package com.proyecto.springboot.error.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.proyecto.springboot.error.app.errors.UsuarioInexistente;
import com.proyecto.springboot.error.app.models.Usuario;
import com.proyecto.springboot.error.app.services.UsuarioServiceInterface;

@Controller
public class AppControler {
	
	@Autowired
	private UsuarioServiceInterface usuarioServiceInterfaz;

	@SuppressWarnings("unused")
	@GetMapping("/index")
	public String index(){
		Integer numero = Integer.parseInt("10x");
		return "index";
	}
	
	@GetMapping("/ver/{id}")
	public String ver(@PathVariable Integer id  ,Model model) {
		Usuario usuario = usuarioServiceInterfaz.buscarPorId(id);
		if (usuario == null) {
			throw new UsuarioInexistente(id.toString());
		}
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Detalle del usuario: ".concat(usuario.getNombre()));
		return "ver";
	}
	
}
