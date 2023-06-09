package com.eduocio.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

@Entity
public class Codigos_Ventas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", length = 11)
	private int id;

	@Column(name = "CODIGO_GENERADO", length = 20)
	private String codigo_generado;

	@Column(name = "ESTADO", length = 20)
	private int estado;

	@Column(name = "FECHA_cREACION", length = 20)
	private Date fecha_creacion;

	@PrePersist
	void fechaCrea() {
		fecha_creacion = new Date(System.currentTimeMillis());
	}

	public Codigos_Ventas() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo_generado() {
		return codigo_generado;
	}

	public void setCodigo_generado(String codigo_generado) {
		this.codigo_generado = codigo_generado;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

}
