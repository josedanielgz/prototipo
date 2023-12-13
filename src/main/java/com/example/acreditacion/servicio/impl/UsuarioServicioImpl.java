package com.example.acreditacion.servicio.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.acreditacion.entidad.Usuario;
import com.example.acreditacion.repositorio.UsuarioRepositorio;
import com.example.acreditacion.servicio.UsuarioServicio;

public class UsuarioServicioImpl implements UsuarioServicio {
	
	@Autowired
	UsuarioRepositorio repositorio;

	@Override
	public List<Usuario> listarTodosLosUsuarios() {
		// TODO Auto-generated method stub
		return this.repositorio.findAll();
	}

	@Override
	public Usuario guardarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return this.repositorio.save(usuario);
	}

	@Override
	public Optional<Usuario> buscarUsuarioPorDocumento(Long id) {
		// TODO Auto-generated method stub
		return this.repositorio.findById(id);
	}

	@Override
	public void eliminarUsuario(Long id) {
		this.repositorio.deleteById(id);
	}

}
