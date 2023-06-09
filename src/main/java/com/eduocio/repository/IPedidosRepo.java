package com.eduocio.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.eduocio.model.Pedidos;

public interface IPedidosRepo extends CrudRepository<Pedidos, Integer> {

	@Query("SELECT p FROM Pedidos p WHERE p.usuario = :id_usuario AND p.estado = 1 AND DATE(p.fecha_creacion) = :fecha AND p.valor_total = :valor_total")
	Pedidos BuscarPedido(@Param("id_usuario") int id_usuario, @Param("fecha") String fecha,
			@Param("valor_total") String valor_total);

}
