package com.eduocio.services.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduocio.model.Log_Facturacion_Operacion;
import com.eduocio.repository.ILog_Facturacion_OperacionRepo;
import com.eduocio.services.Log_Facturacion_OperacionService;

@Service
public class LOGFACTOPERIMPL implements Log_Facturacion_OperacionService {

	@Autowired
	private ILog_Facturacion_OperacionRepo repo;

	@Override
	public List<Log_Facturacion_Operacion> consultar_todo() {
		return (List<Log_Facturacion_Operacion>) this.repo.findAll();
	}

	@Override
	public Log_Facturacion_Operacion CrearLog_Facturacion_Operacion(Log_Facturacion_Operacion log_factura) {
		// venta.setCorreo_electronico(venta.getCorreo_electronico());
		return this.repo.save(log_factura);
	}

	@Override
	public Log_Facturacion_Operacion ModificarLog_Facturacion_Operacion(Log_Facturacion_Operacion log_factura) {
		return this.repo.save(log_factura);
	}

	@Override
	public Log_Facturacion_Operacion BuscarLog_Facturacion_Operacion(int id) {
		return this.repo.findById(id).get();
	}

}
