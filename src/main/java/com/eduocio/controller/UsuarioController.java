package com.eduocio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eduocio.model.Usuario;
import com.eduocio.model.ids.UsuarioIds;
import com.eduocio.services.UsuarioServiceIMPL.USIMPL;

@RestController
@RequestMapping("GestionUsuario")
public class UsuarioController {

	@Autowired
	private USIMPL usimpl;

	@GetMapping
	@RequestMapping(value = "ConsultarUsuarios", method = RequestMethod.GET)
	public ResponseEntity<?> ConsultarUsuarios() {
		List<Usuario> list = this.usimpl.consultar_todo();

		return ResponseEntity.ok(list);
	}

	@PostMapping
	@RequestMapping(value = "CrearUsuario", method = RequestMethod.POST)
	public ResponseEntity<?> CrearUsuario(@RequestBody Usuario usuario) {

		Usuario creado = this.usimpl.CrearUsuario(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).body(creado);
	}

	@PutMapping
	@RequestMapping(value = "ModificarUsuario", method = RequestMethod.PUT)
	public ResponseEntity<?> ModificarUsuario(@RequestBody Usuario usuario) {

		Usuario mof = this.usimpl.ModificarUsuario(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).body(mof);
	}

	@GetMapping
	@RequestMapping(value = "ConsultarUsuario/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> ConsultarUsuario(@PathVariable int id) {

		UsuarioIds usuid = new UsuarioIds(id, null);

		Usuario usuario = this.usimpl.BuscarUsuario(usuid);

		return ResponseEntity.ok(usuario);
	}

}
