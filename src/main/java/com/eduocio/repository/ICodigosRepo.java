package com.eduocio.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.eduocio.model.Codigos_Ventas;

public interface ICodigosRepo extends CrudRepository<Codigos_Ventas, Integer> {

	@Query("SELECT c FROM Codigos_Ventas c WHERE c.codigo_generado = :codigo AND c.estado = 1")
	Codigos_Ventas consultar_codigo(@Param("codigo") String codigo);

}
