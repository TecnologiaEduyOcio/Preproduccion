package com.eduocio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alertas")
public class Alertas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", length = 11)
	private int id;

	@Column(name = "CODIGO_ALERTA", length = 5)
	private int codigo_alerta;

	@Column(name = "DESCRIPCION", length = 1000)
	private String descripcion;

	@Column(name = "ESTADO", length = 1)
	private int estado;

	public Alertas() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodigo_alerta() {
		return codigo_alerta;
	}

	public void setCodigo_alerta(int codigo_alerta) {
		this.codigo_alerta = codigo_alerta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

}
