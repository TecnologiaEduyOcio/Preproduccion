package com.eduocio.services.ServiceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduocio.model.Codigos_Ventas;
import com.eduocio.repository.ICodigosRepo;
import com.eduocio.services.Codigos_VentasService;

@Service
public class CODIMPL implements Codigos_VentasService {

	@Autowired
	private ICodigosRepo repo;

	@Override
	public Codigos_Ventas CrearCodigo(Codigos_Ventas codigo) {
		return this.repo.save(codigo);
	}

	@Override
	public Codigos_Ventas consultar_codigo(String codigo) {
		return this.repo.consultar_codigo(codigo);
	}

}
