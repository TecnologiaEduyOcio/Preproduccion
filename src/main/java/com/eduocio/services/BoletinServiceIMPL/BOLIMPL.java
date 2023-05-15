package com.eduocio.services.BoletinServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduocio.model.Boletin;
import com.eduocio.repository.IBolentinRepo;
import com.eduocio.services.BoletinService;

@Service
public class BOLIMPL implements BoletinService {

	@Autowired
	private IBolentinRepo repo;

	public List<Boletin> consultar_todo() {
		return (List<Boletin>) this.repo.findAll();
	}

	public Boletin CrearBoletin(Boletin boletin) {

		boletin.setCorreo_electronico(boletin.getCorreo_electronico());

		return this.repo.save(boletin);
	}

	public Boletin ModificarBoletin(Boletin boletin) {
		return this.repo.save(boletin);
	}

	public Boletin BuscarBoletin(int id) {
		return this.repo.findById(id).get();
	}

}
