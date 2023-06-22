package com.eduocio.services;

import java.util.List;

import com.eduocio.model.Facturacion_Operacion;

public interface Facturacion_OperacionService {

	public List<Facturacion_Operacion> consultar_todo();

	public Facturacion_Operacion CrearFacturacion_Operacion(Facturacion_Operacion facturacion);

	public Facturacion_Operacion ModificarFacturacion_Operacion(Facturacion_Operacion facturacion);

	public Facturacion_Operacion BuscarFacturacion_Operacion(int id);

}
