package com.eduocio.services;

import java.util.List;

import com.eduocio.model.Producto;

public interface ProductoService {

	public List<Producto> consultar_todo();

	public Producto CrearProducto(Producto producto);

	public Producto ModificarProducto(Producto producto);

	public Producto BuscarProducto(int id);

}
