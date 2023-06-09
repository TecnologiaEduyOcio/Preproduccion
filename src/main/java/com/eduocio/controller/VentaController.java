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

import com.eduocio.model.Codigos_Ventas;
import com.eduocio.model.Pedidos;
import com.eduocio.model.Ventas;
import com.eduocio.services.ServiceIMPL.CODIMPL;
import com.eduocio.services.ServiceIMPL.PEDIMPL;
import com.eduocio.services.ServiceIMPL.VENIMPL;

@RestController
@RequestMapping("GestionVenta")
public class VentaController {

	public VentaController() {
	}

	@Autowired
	private VENIMPL impl;
	@Autowired
	private CODIMPL cmpl;
	@Autowired
	private PEDIMPL pmpl;

	@GetMapping
	@RequestMapping(value = "ConsultarVentas", method = RequestMethod.GET)
	public ResponseEntity<?> ConsultarVentas() {
		List<Ventas> list = this.impl.consultar_todo();

		return ResponseEntity.ok(list);
	}

	@PostMapping("/CrearVenta")
	public ResponseEntity<?> CrearVenta(@RequestBody Ventas venta) {

		Pedidos ped = this.pmpl.BuscarPedidoID(venta.getNumero_venta());

		if (ped != null) {

			String cadena = "";
			String banco = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMÑOPQRSTUVWXYZ1234567890";

			for (int x = 0; x < 8; x++) {

				int index = (int) (Math.random() * 64) + 1;
				char caracteraleatorio = banco.charAt(index);
				cadena += caracteraleatorio;
			}

			Codigos_Ventas cod1 = this.cmpl.consultar_codigo(cadena);

			if (cod1 == null) {

				Codigos_Ventas cod = new Codigos_Ventas();

				cod.setCodigo_generado(cadena);
				cod.setEstado(1);
				cod.setId(0);

				Codigos_Ventas r = this.cmpl.CrearCodigo(cod);

				venta.setCupon_venta(cadena);

				Ventas creado = this.impl.CrearVenta(venta);

				if (r != null && creado != null) {
					return ResponseEntity.status(HttpStatus.CREATED).body(creado);

				} else {
					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
							.body("Error al crear el codigo o la venta por favor contacte a soporte");
				}
			} else {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
						.body("Error en el codigo creado ya existe");
			}
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Error Numero de pedido no existe por favor validar!.");
		}
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
