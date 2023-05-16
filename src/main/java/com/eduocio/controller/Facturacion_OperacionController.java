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

import com.eduocio.model.Facturacion_Operacion;
import com.eduocio.services.ServiceIMPL.FACTOPERIMPL;

@RestController
@RequestMapping("GestionFacturacion_Operacion")
public class Facturacion_OperacionController {

	public Facturacion_OperacionController() {
	}

	@Autowired
	private FACTOPERIMPL impl;

	@GetMapping
	@RequestMapping(value = "Consultarfactura_operaciones", method = RequestMethod.GET)
	public ResponseEntity<?> Consultarfactura_operaciones() {
		List<Facturacion_Operacion> list = this.impl.consultar_todo();

		return ResponseEntity.ok(list);
	}

	@PostMapping
	@RequestMapping(value = "Crearfactura_operacion", method = RequestMethod.POST)
	public ResponseEntity<?> Crearfactura_operacion(@RequestBody Facturacion_Operacion factura_operacion) {

		Facturacion_Operacion creado = this.impl.CrearFacturacion_Operacion(factura_operacion);
		return ResponseEntity.status(HttpStatus.CREATED).body(creado);
	}

	@PutMapping
	@RequestMapping(value = "Modificarfactura_operacion", method = RequestMethod.PUT)
	public ResponseEntity<?> Modificarfactura_operacion(@RequestBody Facturacion_Operacion factura_operacion) {

		Facturacion_Operacion mof = this.impl.ModificarFacturacion_Operacion(factura_operacion);
		return ResponseEntity.status(HttpStatus.CREATED).body(mof);
	}

	@GetMapping
	@RequestMapping(value = "Consultarfactura_operacion/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> Consultarfactura_operacion(@PathVariable int id) {

		Facturacion_Operacion buscado = this.impl.BuscarFacturacion_Operacion(id);

		return ResponseEntity.ok(buscado);
	}

}
