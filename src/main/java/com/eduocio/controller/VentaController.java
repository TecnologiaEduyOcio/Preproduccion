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

import com.eduocio.model.Ventas;
import com.eduocio.services.ServiceIMPL.VENIMPL;

@RestController
@RequestMapping("GestionVenta")
public class VentaController {

	public VentaController() {
	}

	@Autowired
	private VENIMPL impl;

	@GetMapping
	@RequestMapping(value = "ConsultarVentas", method = RequestMethod.GET)
	public ResponseEntity<?> ConsultarVentas() {
		List<Ventas> list = this.impl.consultar_todo();

		return ResponseEntity.ok(list);
	}

	@PostMapping
	@RequestMapping(value = "CrearVenta", method = RequestMethod.POST)
	public ResponseEntity<?> CrearVenta(@RequestBody Ventas venta) {

		Ventas creado = this.impl.CrearVenta(venta);
		return ResponseEntity.status(HttpStatus.CREATED).body(creado);
	}

	@PutMapping
	@RequestMapping(value = "ModificarVenta", method = RequestMethod.PUT)
	public ResponseEntity<?> ModificarVenta(@RequestBody Ventas venta) {

		Ventas mof = this.impl.ModificarVenta(venta);
		return ResponseEntity.status(HttpStatus.CREATED).body(mof);
	}

	@GetMapping
	@RequestMapping(value = "ConsultarVenta/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> ConsultarVenta(@PathVariable int id) {

		Ventas buscado = this.impl.BuscarVenta(id);

		return ResponseEntity.ok(buscado);
	}

}
