package com.eduocio.services;

import java.util.List;

import com.eduocio.model.Metodo_pago;

public interface Metodo_PagoService {

	public List<Metodo_pago> consultar_todo();

	public Metodo_pago CrearMetodo_Pago(Metodo_pago metodo_pago);

	public Metodo_pago ModificarMetodo_Pago(Metodo_pago metodo_pago);

	public Metodo_pago BuscarMetodo_Pago(int id);

}
