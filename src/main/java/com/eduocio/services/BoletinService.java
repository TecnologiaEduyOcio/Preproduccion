package com.eduocio.services;

import java.util.List;

import com.eduocio.model.Boletin;

public interface BoletinService {

	public List<Boletin> consultar_todo();

	public Boletin CrearBoletin(Boletin bolentin);

	public Boletin ModificarBoletin(Boletin bolentin);

	public Boletin BuscarBoletin(int id);

}
