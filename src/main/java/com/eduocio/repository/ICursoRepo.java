package com.eduocio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.eduocio.model.Curso;

public interface ICursoRepo extends PagingAndSortingRepository<Curso, Integer>, CrudRepository<Curso, Integer> {

}
