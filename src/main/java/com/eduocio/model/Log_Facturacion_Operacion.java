package com.eduocio.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Log_Facturacion_Operacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", length = 11)
	private int id;

	@Column(name = "ID_FACTURACION_OPERACION", length = 11)
	private int id_facturacion_operacion;

	@Column(name = "VALOR_CONSIGANDO", length = 11)
	private int valor_consignado;

	@Column(name = "FECHA_PAGO")
	private Timestamp fecha_pago;

	@Column(name = "USUARIO_PAGADO")
	private String usuario_pagado;

	@Column(name = "USUARIO_TRANS")
	private String usuario_trans;

	public Log_Facturacion_Operacion() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_facturacion_operacion() {
		return id_facturacion_operacion;
	}

	public void setId_facturacion_operacion(int id_facturacion_operacion) {
		this.id_facturacion_operacion = id_facturacion_operacion;
	}

	public int getValor_consignado() {
		return valor_consignado;
	}

	public void setValor_consignado(int valor_consignado) {
		this.valor_consignado = valor_consignado;
	}

	public Timestamp getFecha_pago() {
		return fecha_pago;
	}

	public void setFecha_pago(Timestamp fecha_pago) {
		this.fecha_pago = fecha_pago;
	}

	public String getUsuario_pagado() {
		return usuario_pagado;
	}

	public void setUsuario_pagado(String usuario_pagado) {
		this.usuario_pagado = usuario_pagado;
	}

	public String getUsuario_trans() {
		return usuario_trans;
	}

	public void setUsuario_trans(String usuario_trans) {
		this.usuario_trans = usuario_trans;
	}

}
