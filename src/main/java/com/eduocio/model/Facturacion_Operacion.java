package com.eduocio.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Facturacion_Operacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", length = 11)
	private int id;

	@Column(name = "ID_VENTA", length = 2)
	private int id_venta;

	@Column(name = "PORCENTAJE_REFERIDO", length = 2)
	private int porcentaje_referido;

	@Column(name = "NUMERO_VENTA", length = 2)
	private int numero_venta;

	@Column(name = "PORCENTAJE_ASESOR", length = 2)
	private int porcentaje_asesor;

	@Column(name = "VALOR_REFERIDO", length = 11)
	private int valor_referido;

	@Column(name = "VALOR_ASESOR", length = 11)
	private int valor_asesor;

	@Column(name = "ESTADO", length = 20)
	private String estado;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "id_facturacion_operacion")
	private List<Log_Facturacion_Operacion> log_facturacion_operacion;

	public Facturacion_Operacion() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_venta() {
		return id_venta;
	}

	public void setId_venta(int id_venta) {
		this.id_venta = id_venta;
	}

	public int getPorcentaje_referido() {
		return porcentaje_referido;
	}

	public void setPorcentaje_referido(int porcentaje_referido) {
		this.porcentaje_referido = porcentaje_referido;
	}

	public int getNumero_venta() {
		return numero_venta;
	}

	public void setNumero_venta(int numero_venta) {
		this.numero_venta = numero_venta;
	}

	public int getPorcentaje_asesor() {
		return porcentaje_asesor;
	}

	public void setPorcentaje_asesor(int porcentaje_asesor) {
		this.porcentaje_asesor = porcentaje_asesor;
	}

	public int getValor_referido() {
		return valor_referido;
	}

	public void setValor_referido(int valor_referido) {
		this.valor_referido = valor_referido;
	}

	public int getValor_asesor() {
		return valor_asesor;
	}

	public void setValor_asesor(int valor_asesor) {
		this.valor_asesor = valor_asesor;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
