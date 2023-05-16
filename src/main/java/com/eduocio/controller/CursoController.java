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

import com.eduocio.model.Curso;
import com.eduocio.services.ServiceIMPL.CURIMPL;

@RestController
@RequestMapping("GestionCurso")
public class CursoController {

	public CursoController() {
	}

	@Autowired
	private CURIMPL impl;

	@GetMapping
	@RequestMapping(value = "ConsultarCursos", method = RequestMethod.GET)
	public ResponseEntity<?> ConsultarCursos() {
		List<Curso> list = this.impl.consultar_todo();

		return ResponseEntity.ok(list);
	}

	@PostMapping
	@RequestMapping(value = "Crearcurso", method = RequestMethod.POST)
	public ResponseEntity<?> Crearcurso(@RequestBody Curso curso) {

		Curso creado = this.impl.CrearCurso(curso);
		return ResponseEntity.status(HttpStatus.CREATED).body(creado);
	}

	@PutMapping
	@RequestMapping(value = "Modificarcurso", method = RequestMethod.PUT)
	public ResponseEntity<?> Modificarcurso(@RequestBody Curso curso) {

		Curso mof = this.impl.ModificarCurso(curso);
		return ResponseEntity.status(HttpStatus.CREATED).body(mof);
	}

	@GetMapping
	@RequestMapping(value = "Consultarcurso/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> Consultarcurso(@PathVariable int id) {

		Curso buscado = this.impl.BuscarCurso(id);

		return ResponseEntity.ok(buscado);
	}

}
