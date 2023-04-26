package com.eduocio.repository;

import org.springframework.data.repository.CrudRepository;

import com.eduocio.model.Usuario;

public interface IUsuarioRepo extends CrudRepository<Usuario, Integer> {

}
