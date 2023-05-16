package com.eduocio.repository;

import org.springframework.data.repository.CrudRepository;

import com.eduocio.model.Curso;

public interface ICursoRepo extends CrudRepository<Curso, Integer> {

}
