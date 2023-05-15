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
	
	@Column(name = "ID_USUARIO", length = 11)
	private int id_usuario;
	
	//@OneToOne(mappedBy = "Metodo_pago", cascade = CascadeType.ALL)
    //private Usuario Usuario;

}
