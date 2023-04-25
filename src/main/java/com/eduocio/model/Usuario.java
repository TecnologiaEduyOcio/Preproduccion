package com.eduocio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
	
	public Usuario() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String id_usuario;

	@Column(name = "CONTRASEÑA", length = 100)
	private String clave;

	@Column(name = "TIPO_DOCUMENTO", length = 5)
	private String tipo_documento;

	@Column(name = "NUMERO_DOCUMENTO", length = 30)
	private String numero_documento;

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

	@Column(name = "DIRECCION", length = 80)
	private String direccion;

	@Column(name = "CIUDAD", length = 80)
	private String ciudad;

	@Column(name = "ESTADO")
	private boolean estado;

	@Column(name = "ID_PERFIL", length = 20)
	private String perfil;

	public Usuario(int id, String id_usuario, String clave, String tipo_documento, String numero_documento,
			String primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido,
			String correo_electronico, int celular, String direccion, String ciudad, boolean estado, String perfil) {
		super();
		this.id = id;
		this.id_usuario = id_usuario;
		this.clave = clave;
		this.tipo_documento = tipo_documento;
		this.numero_documento = numero_documento;
		this.primer_nombre = primer_nombre;
		this.segundo_nombre = segundo_nombre;
		this.primer_apellido = primer_apellido;
		this.segundo_apellido = segundo_apellido;
		this.correo_electronico = correo_electronico;
		this.celular = celular;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.estado = estado;
		this.perfil = perfil;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getTipo_documento() {
		return tipo_documento;
	}

	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}

	public String getNumero_documento() {
		return numero_documento;
	}

	public void setNumero_documento(String numero_documento) {
		this.numero_documento = numero_documento;
	}

	public String getPrimer_nombre() {
		return primer_nombre;
	}

	public void setPrimer_nombre(String primer_nombre) {
		this.primer_nombre = primer_nombre;
	}

	public String getSegundo_nombre() {
		return segundo_nombre;
	}

	public void setSegundo_nombre(String segundo_nombre) {
		this.segundo_nombre = segundo_nombre;
	}

	public String getPrimer_apellido() {
		return primer_apellido;
	}

	public void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}

	public String getSegundo_apellido() {
		return segundo_apellido;
	}

	public void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}

	public String getCorreo_electronico() {
		return correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

}
