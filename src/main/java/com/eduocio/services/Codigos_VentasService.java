package com.eduocio.services;

import com.eduocio.model.Codigos_Ventas;

public interface Codigos_VentasService {

	public Codigos_Ventas CrearCodigo(Codigos_Ventas codigo);

	public Codigos_Ventas consultar_codigo(String codigo);

}
