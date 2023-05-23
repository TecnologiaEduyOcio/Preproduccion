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

import com.eduocio.model.Metodo_pago;
import com.eduocio.services.ServiceIMPL.METPAGIMPL;

@RestController
@RequestMapping("GestionMetodo_Pago")
public class Metodo_PagoController {

	public Metodo_PagoController() {
	}

	@Autowired
	private METPAGIMPL impl;

	@GetMapping
	@RequestMapping(value = "ConsultarMetodo_Pagos", method = RequestMethod.GET)
	public ResponseEntity<?> ConsultarMetodo_Pagos() {
		List<Metodo_pago> list = this.impl.consultar_todo();

		return ResponseEntity.ok(list);
	}

	@PostMapping
	@RequestMapping(value = "CrearMetodo_Pago", method = RequestMethod.POST)
	public ResponseEntity<?> CrearMetodo_Pago(@RequestBody Metodo_pago Metodo_Pago) {

		Metodo_pago creado = this.impl.CrearMetodo_Pago(Metodo_Pago);
		return ResponseEntity.status(HttpStatus.CREATED).body(creado);
	}

	@PutMapping
	@RequestMapping(value = "ModificarMetodo_Pago", method = RequestMethod.PUT)
	public ResponseEntity<?> ModificarMetodo_Pago(@RequestBody Metodo_pago Metodo_Pago) {

		Metodo_pago mof = this.impl.ModificarMetodo_Pago(Metodo_Pago);
		return ResponseEntity.status(HttpStatus.CREATED).body(mof);
	}

	@GetMapping
	@RequestMapping(value = "ConsultarMetodo_Pago/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> ConsultarMetodo_Pago(@PathVariable int id) {

		Metodo_pago buscado = this.impl.BuscarMetodo_Pago(id);

		return ResponseEntity.ok(buscado);
	}

}
