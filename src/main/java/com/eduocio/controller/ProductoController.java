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

import com.eduocio.model.Producto;
import com.eduocio.services.ServiceIMPL.PROIMPL;

@RestController
@RequestMapping("GestionProducto")
public class ProductoController {

	public ProductoController() {
	}

	@Autowired
	private PROIMPL impl;

	@GetMapping
	@RequestMapping(value = "ConsultarProducto", method = RequestMethod.GET)
	public ResponseEntity<?> ConsultarProducto() {
		List<Producto> list = this.impl.consultar_todo();

		return ResponseEntity.ok(list);
	}

	@PostMapping
	@RequestMapping(value = "CrearProducto", method = RequestMethod.POST)
	public ResponseEntity<?> CrearProducto(@RequestBody Producto producto) {

		Producto creado = this.impl.CrearProducto(producto);
		return ResponseEntity.status(HttpStatus.CREATED).body(creado);
	}

	@PutMapping
	@RequestMapping(value = "ModificarProducto", method = RequestMethod.PUT)
	public ResponseEntity<?> ModificarProducto(@RequestBody Producto producto) {

		Producto mof = this.impl.ModificarProducto(producto);
		return ResponseEntity.status(HttpStatus.CREATED).body(mof);
	}

	@GetMapping
	@RequestMapping(value = "ConsultarProducto/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> ConsultarProducto(@PathVariable int id) {

		Producto buscado = this.impl.BuscarProducto(id);

		return ResponseEntity.ok(buscado);
	}

}
