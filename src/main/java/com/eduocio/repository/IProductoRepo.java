package com.eduocio.repository;

import org.springframework.data.repository.CrudRepository;

import com.eduocio.model.Producto;

public interface IProductoRepo extends CrudRepository<Producto, Integer> {

}
