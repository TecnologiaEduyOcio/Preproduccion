package com.eduocio.services;

import com.eduocio.model.Pedidos;

public interface PedidosService {

	public Pedidos CrearPedido(Pedidos pedido);

	public Pedidos BuscarPedido(int id_usuario, String fecha, String valor_total);

	public Pedidos BuscarPedidoID(int id);

}
