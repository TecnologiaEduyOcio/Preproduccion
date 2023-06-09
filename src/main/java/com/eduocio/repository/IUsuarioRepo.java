package com.eduocio.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.eduocio.model.Usuario;

public interface IUsuarioRepo extends CrudRepository<Usuario, Integer> {

	@Query("SELECT u FROM Usuario u WHERE u.id_usuario = :id_usuario AND u.clave = :clave")
	Usuario Login(@Param("id_usuario") String id_usuario, @Param("clave") String clave);

}
