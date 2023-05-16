package com.eduocio.services.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduocio.model.Producto;
import com.eduocio.repository.IProductoRepo;
import com.eduocio.services.ProductoService;

@Service
public class PROIMPL implements ProductoService {

	@Autowired
	private IProductoRepo repo;

	@Override
	public Producto CrearProducto(Producto producto) {
		// venta.setCorreo_electronico(venta.getCorreo_electronico());
		return this.repo.save(producto);
	}

	@Override
	public Producto ModificarProducto(Producto producto) {
		return this.repo.save(producto);
	}

	public Producto BuscarProducto(int id) {
		return this.repo.findById(id).get();
	}

	@Override
	public List<Producto> consultar_todo() {
		return (List<Producto>) this.repo.findAll();
	}

}
