package com.eduocio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduocio.model.Pedidos;
import com.eduocio.services.ServiceIMPL.PEDIMPL;

@RestController
@RequestMapping("GestionPedidos")
public class PedidoController {

	public PedidoController() {
	}

	@Autowired
	private PEDIMPL impl;

	@PostMapping("/CrearPedido")
	public ResponseEntity<?> CrearPedido(@RequestBody Pedidos pedido) {

		pedido.setEstado("PENDIENTE_COMPRA");

		Pedidos creado = this.impl.CrearPedido(pedido);
		return ResponseEntity.status(HttpStatus.CREATED).body(creado);
	}

}
