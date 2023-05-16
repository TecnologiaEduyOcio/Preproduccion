package com.eduocio.repository;

import org.springframework.data.repository.CrudRepository;

import com.eduocio.model.Ventas;

public interface IVentaRepo extends CrudRepository<Ventas, Integer> {

}
