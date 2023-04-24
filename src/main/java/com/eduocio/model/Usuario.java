package com.eduocio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuario {

	@Id
	@Column(name = "ID", length = 11)
	private int id;

	@Column(name = "ID_USUARIO", length = 11)
	private String id_usuario;

	@Column(name = "PRIMER_NOMBRE", length = 50)
	private String primer_nombre;

	@Column(name = "SEGUNDO_NOMBRE", length = 50)
	private String segundo_nombre;

	@Column(name = "PRIMER_APELLIDO", length = 50)
	private String primer_apellido;

	@Column(name = "SEGUNDO_APELLIDO", length = 50)
	private String segundo_apellido;

	@Column(name = "CORREO_ELECTRONICO", length = 50)
	private String correo_electronico;

	@Column(name = "CELULAR", length = 10)
	private int celular;

	@Column(name = "ESTADO")
	private boolean estado;

	@Column(name = "ID_PERFIL", length = 20)
	private String perfil;

	public Usuario() {
	}

}
