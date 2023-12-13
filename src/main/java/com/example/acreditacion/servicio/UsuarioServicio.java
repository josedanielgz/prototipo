package com.example.acreditacion.servicio;

import java.util.List;
import java.util.Optional;

import com.example.acreditacion.entidad.Usuario;

public interface UsuarioServicio {

	public List<Usuario> listarTodosLosUsuarios();

	public Usuario guardarUsuario(Usuario usuario);

	public Optional<Usuario> buscarUsuarioPorDocumento(Long id);

	public void eliminarUsuario(Long id);
}
