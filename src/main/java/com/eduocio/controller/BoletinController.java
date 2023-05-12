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

import com.eduocio.model.Boletin;
import com.eduocio.services.BoletinServiceIMPL.BOLIMPL;

public class BoletinController {

	public BoletinController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private BOLIMPL bolimpl;

	@GetMapping
	@RequestMapping(value = "ConsultarBoletines", method = RequestMethod.GET)
	public ResponseEntity<?> ConsultarBoletines() {
		List<Boletin> list = this.bolimpl.consultar_todo();

		return ResponseEntity.ok(list);
	}

	@PostMapping
	@RequestMapping(value = "CrearBoletin", method = RequestMethod.POST)
	public ResponseEntity<?> CrearBoletin(@RequestBody Boletin boletin) {

		Boletin creado = this.bolimpl.CrearBoletin(boletin);
		return ResponseEntity.status(HttpStatus.CREATED).body(creado);
	}

	@PutMapping
	@RequestMapping(value = "ModificarBoletin", method = RequestMethod.PUT)
	public ResponseEntity<?> ModificarBoletin(@RequestBody Boletin boletin) {

		Boletin mof = this.bolimpl.ModificarBoletin(boletin);
		return ResponseEntity.status(HttpStatus.CREATED).body(mof);
	}

	@GetMapping
	@RequestMapping(value = "ConsultarBoletin/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> ConsultarBoletin(@PathVariable int id) {

		Boletin boletin = this.bolimpl.BuscarBoletin(id);

		return ResponseEntity.ok(boletin);
	}

}
