package com.eduocio.services.ServiceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduocio.model.Pedidos;
import com.eduocio.repository.IPedidosRepo;
import com.eduocio.services.PedidosService;

@Service
public class PEDIMPL implements PedidosService {

	@Autowired
	private IPedidosRepo repo;

	@Override
	public Pedidos CrearPedido(Pedidos pedido) {
		return this.repo.save(pedido);
	}

	@Override
	public Pedidos BuscarPedido(int id_usuario, String fecha, String valor_total) {
		return this.repo.BuscarPedido(id_usuario, fecha, valor_total);
	}

	@Override
	public Pedidos BuscarPedidoID(int id) {
		return this.repo.findById(id).get();
	}

}
