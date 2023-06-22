package com.eduocio.services.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduocio.model.Metodo_pago;
import com.eduocio.repository.IMetodo_PagoRepo;
import com.eduocio.services.Metodo_PagoService;

@Service
public class METPAGIMPL implements Metodo_PagoService {

	@Autowired
	private IMetodo_PagoRepo repo;

	@Override
	public List<Metodo_pago> consultar_todo() {
		return (List<Metodo_pago>) this.repo.findAll();
	}

	@Override
	public Metodo_pago CrearMetodo_Pago(Metodo_pago metodo_pago) {
		// venta.setCorreo_electronico(venta.getCorreo_electronico());
		return this.repo.save(metodo_pago);
	}

	@Override
	public Metodo_pago ModificarMetodo_Pago(Metodo_pago metodo_pago) {
		return this.repo.save(metodo_pago);
	}

	@Override
	public Metodo_pago BuscarMetodo_Pago(int id) {
		return this.repo.findById(id).get();
	}

}
