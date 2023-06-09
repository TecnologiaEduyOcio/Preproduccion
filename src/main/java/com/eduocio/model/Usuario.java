package com.eduocio.model;

import java.io.Serializable;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.Index;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios"/*
						 * , indexes = {
						 * 
						 * @Index(name = "IDX_NUMERO_DOCUMENTO", columnList =
						 * "TIPO_DOCUMENTO, NUMERO_DOCUMENTO", unique = true),
						 * 
						 * @Index(name = "IDX_ID_USUARIO", columnList = "ID_USUARIO", unique = true) }
						 */)
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", length = 11)
	private int id;

	@Column(name = "ID_USUARIO", length = 20)
	private String id_usuario;

	@Column(name = "CONTRASEÑA", length = 20, nullable = false)
	private String clave;

	@Column(name = "TIPO_DOCUMENTO", length = 5, nullable = false)
	private String tipo_documento;

	@Column(name = "NUMERO_DOCUMENTO", length = 30, nullable = false)
	private String numero_documento;

	@Column(name = "PRIMER_NOMBRE", length = 50, nullable = false)
	private String primer_nombre;

	@Column(name = "SEGUNDO_NOMBRE", length = 50)
	private String segundo_nombre;

	@Column(name = "PRIMER_APELLIDO", length = 50, nullable = false)
	private String primer_apellido;

	@Column(name = "SEGUNDO_APELLIDO", length = 50, nullable = false)
	private String segundo_apellido;

	@Column(name = "CORREO_ELECTRONICO", length = 50, nullable = false)
	private String correo_electronico;

	@Column(name = "CELULAR", length = 10, nullable = false)
	private int celular;

	@Column(name = "DIRECCION", length = 80)
	private String direccion;

	@Column(name = "CIUDAD", length = 80)
	private String ciudad;

	@Column(name = "ESTADO", length = 2)
	private int estado;

	@Column(name = "ID_PERFIL", length = 20)
	private String perfil;

	@Column(name = "FECHA_CREACION")
	private Timestamp fecha_creacion;

	@Column(name = "CODIGO_USUARIO")
	private String codigo_usuario;

	public Usuario() {
		super();
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

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public Timestamp getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Timestamp fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public String getCodigo_usuario() {
		return codigo_usuario;
	}

	public void setCodigo_usuario(String codigo_usuario) {
		this.codigo_usuario = codigo_usuario;
	}

}
