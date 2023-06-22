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

import com.eduocio.model.Log_Facturacion_Operacion;
import com.eduocio.services.ServiceIMPL.LOGFACTOPERIMPL;

@RestController
@RequestMapping("GestionLog_Facturacion_Operacion")
public class Log_Facturacion_OperacionController {

	public Log_Facturacion_OperacionController() {
	}

	@Autowired
	private LOGFACTOPERIMPL impl;

	@GetMapping
	@RequestMapping(value = "Consultarlog_facturas", method = RequestMethod.GET)
	public ResponseEntity<?> Consultarlog_facturas() {
		List<Log_Facturacion_Operacion> list = this.impl.consultar_todo();

		return ResponseEntity.ok(list);
	}

	@PostMapping
	@RequestMapping(value = "Crearlog_fact", method = RequestMethod.POST)
	public ResponseEntity<?> Crearlog_fact(@RequestBody Log_Facturacion_Operacion log_fact) {

		Log_Facturacion_Operacion creado = this.impl.CrearLog_Facturacion_Operacion(log_fact);
		return ResponseEntity.status(HttpStatus.CREATED).body(creado);
	}

	@PutMapping
	@RequestMapping(value = "Modificarlog_fact", method = RequestMethod.PUT)
	public ResponseEntity<?> Modificarlog_fact(@RequestBody Log_Facturacion_Operacion log_fact) {

		Log_Facturacion_Operacion mof = this.impl.ModificarLog_Facturacion_Operacion(log_fact);
		return ResponseEntity.status(HttpStatus.CREATED).body(mof);
	}

	@GetMapping
	@RequestMapping(value = "Consultarlog_fact/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> Consultarlog_fact(@PathVariable int id) {

		Log_Facturacion_Operacion buscado = this.impl.BuscarLog_Facturacion_Operacion(id);

		return ResponseEntity.ok(buscado);
	}

}
