package com.eduocio.services;

import java.util.List;

import com.eduocio.model.Usuario;

public interface UsuarioService {

	public List<Usuario> consultar_todo();

	public Usuario CrearUsuario(Usuario usuario);

	public Usuario ModificarUsuario(Usuario usuario);

	public Usuario BuscarUsuario(int id);

}
