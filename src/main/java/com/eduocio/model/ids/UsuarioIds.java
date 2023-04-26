package com.eduocio.model.ids;

import java.io.Serializable;

public class UsuarioIds implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3504949306485636245L;

	public UsuarioIds() {
		// TODO Auto-generated constructor stub
	}

	public UsuarioIds(int id, String id_usuario) {
		super();
		this.id = id;
		this.id_usuario = id_usuario;
	}

	private int id;
	private String id_usuario;

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
