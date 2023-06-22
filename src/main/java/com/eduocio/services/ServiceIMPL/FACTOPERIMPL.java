package com.eduocio.services.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduocio.model.Facturacion_Operacion;
import com.eduocio.repository.IFacturacion_OperacionRepo;
import com.eduocio.services.Facturacion_OperacionService;

@Service
public class FACTOPERIMPL implements Facturacion_OperacionService {

	@Autowired
	private IFacturacion_OperacionRepo repo;

	@Override
	public Facturacion_Operacion CrearFacturacion_Operacion(Facturacion_Operacion facturacion) {
		// venta.setCorreo_electronico(venta.getCorreo_electronico());
		return this.repo.save(facturacion);
	}

	@Override
	public Facturacion_Operacion ModificarFacturacion_Operacion(Facturacion_Operacion facturacion) {
		return this.repo.save(facturacion);
	}

	@Override
	public Facturacion_Operacion BuscarFacturacion_Operacion(int id) {
		return this.repo.findById(id).get();
	}

	@Override
	public List<Facturacion_Operacion> consultar_todo() {
		return (List<Facturacion_Operacion>) this.repo.findAll();
	}

}
