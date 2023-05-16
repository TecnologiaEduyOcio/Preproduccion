package com.eduocio.services;

import java.util.List;

import com.eduocio.model.Ventas;

public interface VentaService {

	public List<Ventas> consultar_todo();

	public Ventas CrearVenta(Ventas venta);

	public Ventas ModificarVenta(Ventas venta);

	public Ventas BuscarVenta(int id);

}
