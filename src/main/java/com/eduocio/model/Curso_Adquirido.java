package com.eduocio.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Curso_Adquirido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", length = 11)
	private int id;

	@Column(name = "ID_CURSO", length = 20)
	private int titulo;

	@Column(name = "ID_USUARIO", length = 20)
	private String id_usuario;

	@Column(name = "FECHA_CREACION")
	private Timestamp FECHA_CREACION;

	@Column(name = "ESTADO")
	private String estado;

	@OneToOne()
	@JoinColumn(name = "usuario_id", referencedColumnName = "id")
	private Usuario usuario;

	public Curso_Adquirido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTitulo() {
		return titulo;
	}

	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}

	public String getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}

	public Timestamp getFECHA_CREACION() {
		return FECHA_CREACION;
	}

	public void setFECHA_CREACION(Timestamp fECHA_CREACION) {
		FECHA_CREACION = fECHA_CREACION;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
