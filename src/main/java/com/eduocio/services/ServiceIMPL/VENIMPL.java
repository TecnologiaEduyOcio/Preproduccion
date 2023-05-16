package com.eduocio.services.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduocio.model.Ventas;
import com.eduocio.repository.IVentaRepo;
import com.eduocio.services.VentaService;

@Service
public class VENIMPL implements VentaService {

	@Autowired
	private IVentaRepo repo;

	public List<Ventas> consultar_todo() {
		return (List<Ventas>) this.repo.findAll();
	}

	public Ventas CrearVenta(Ventas venta) {

		// venta.setCorreo_electronico(venta.getCorreo_electronico());

		return this.repo.save(venta);
	}

	public Ventas ModificarVenta(Ventas venta) {
		return this.repo.save(venta);
	}

	public Ventas BuscarVenta(int id) {
		return this.repo.findById(id).get();
	}

}
