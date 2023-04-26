package com.eduocio.repository;

import org.springframework.data.repository.CrudRepository;

import com.eduocio.model.Usuario;
import com.eduocio.model.ids.UsuarioIds;

public interface IUsuarioRepo extends CrudRepository<Usuario, UsuarioIds> {

}
