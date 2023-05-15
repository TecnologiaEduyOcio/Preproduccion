package com.eduocio.services;

import java.util.List;

import com.eduocio.model.Usuario;
import com.eduocio.model.ids.UsuarioIds;

public interface UsuarioService {

	public List<Usuario> consultar_todo();

	public Usuario CrearUsuario(Usuario usuario);

	public Usuario ModificarUsuario(Usuario usuario);

	public Usuario BuscarUsuario(UsuarioIds id);

}
