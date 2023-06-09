package com.eduocio.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.eduocio.model.Usuario;

public interface IUsuarioRepo extends CrudRepository<Usuario, Integer> {

	@Query("SELECT u FROM Usuario u WHERE u.correo_electronico = :correo_electronico AND u.clave = :clave")
	Usuario Login(@Param("correo_electronico") String correo_electronico, @Param("clave") String clave);

}
