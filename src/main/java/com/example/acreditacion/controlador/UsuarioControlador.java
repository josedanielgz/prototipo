package com.example.acreditacion.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioControlador {

	@GetMapping("/login")
	public String formularioDeLogin() {
		return "login";
	}

}
