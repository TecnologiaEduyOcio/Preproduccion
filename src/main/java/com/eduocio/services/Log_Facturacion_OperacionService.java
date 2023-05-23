package com.eduocio.services;

import java.util.List;

import com.eduocio.model.Log_Facturacion_Operacion;

public interface Log_Facturacion_OperacionService {

	public List<Log_Facturacion_Operacion> consultar_todo();

	public Log_Facturacion_Operacion CrearLog_Facturacion_Operacion(Log_Facturacion_Operacion log_factura);

	public Log_Facturacion_Operacion ModificarLog_Facturacion_Operacion(Log_Facturacion_Operacion log_factura);

	public Log_Facturacion_Operacion BuscarLog_Facturacion_Operacion(int id);

}
