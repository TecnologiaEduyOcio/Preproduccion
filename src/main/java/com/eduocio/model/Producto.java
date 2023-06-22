package com.eduocio.model;

import java.io.Serializable;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", length = 11)
	private int id;

	@Column(name = "TITULO", length = 20)
	private String titulo;

	@Column(name = "DESCRIPCION", length = 1000)
	private String descripcion;

	@Column(name = "DURACION", length = 10)
	private String DURACION;

	@Column(name = "RUTA", length = 300)
	private String ruta;

	@Column(name = "FORMATO", length = 300)
	private String formato;

	@Column(name = "CATEGORIA", length = 300)
	private String categoria;

	@Column(name = "SUB_CATEGORIA", length = 300)
	private String sub_categoria;

	@Column(name = "FECHA_CREACION")
	private Timestamp FECHA_CREACION;

	@Column(name = "MINIATURA", length = 300)
	private String miniatura;

	public Producto() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDURACION() {
		return DURACION;
	}

	public void setDURACION(String dURACION) {
		DURACION = dURACION;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getSub_categoria() {
		return sub_categoria;
	}

	public void setSub_categoria(String sub_categoria) {
		this.sub_categoria = sub_categoria;
	}

	public Timestamp getFECHA_CREACION() {
		return FECHA_CREACION;
	}

	public void setFECHA_CREACION(Timestamp fECHA_CREACION) {
		FECHA_CREACION = fECHA_CREACION;
	}

	public String getMiniatura() {
		return miniatura;
	}

	public void setMiniatura(String miniatura) {
		this.miniatura = miniatura;
	}

}
