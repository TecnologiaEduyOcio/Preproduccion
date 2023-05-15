package com.eduocio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Metodo_pago {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", length = 11)
	private int id;

	@Column(name = "NOMBRE_TITULAR_TARJETA", length = 20)
	private String nombre_titular_tarjeta;

	@Column(name = "NUMERO_TARJETA", length = 16)
	private int numero_tarjeta;

	@Column(name = "CORREO_ELECTRONICO", length = 20)
	private String correo_electronico;

	@Column(name = "CELULAR", length = 10)
	private int celular;

	// @OneToOne(mappedBy = "Metodo_pago", cascade = CascadeType.ALL)
	// private Usuario Usuario;
	@Column(name = "ID_USUARIO", length = 11)
	private int id_usuario;

	public Metodo_pago() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre_titular_tarjeta() {
		return nombre_titular_tarjeta;
	}

	public void setNombre_titular_tarjeta(String nombre_titular_tarjeta) {
		this.nombre_titular_tarjeta = nombre_titular_tarjeta;
	}

	public int getNumero_tarjeta() {
		return numero_tarjeta;
	}

	public void setNumero_tarjeta(int numero_tarjeta) {
		this.numero_tarjeta = numero_tarjeta;
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

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

}
