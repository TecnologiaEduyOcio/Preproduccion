package com.eduocio.services.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduocio.model.Usuario;
import com.eduocio.repository.IUsuarioRepo;
import com.eduocio.services.UsuarioService;

@Service
public class USIMPL implements UsuarioService {

	@Autowired
	private IUsuarioRepo repo;

	@Override
	public List<Usuario> consultar_todo() {
		// TODO Auto-generated method stub
		return (List<Usuario>) this.repo.findAll();
	}

	@Override
	public Usuario CrearUsuario(Usuario usuario) {

		usuario.setCorreo_electronico(usuario.getCorreo_electronico());

		return this.repo.save(usuario);
	}

	@Override
	public Usuario ModificarUsuario(Usuario usuario) {
		return this.repo.save(usuario);
	}

	public Usuario BuscarUsuario(int id) {
		return this.repo.findById(id).get();
	}
}
