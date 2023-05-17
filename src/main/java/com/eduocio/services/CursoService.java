package com.eduocio.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.eduocio.model.Curso;

public interface CursoService {

	public List<Curso> consultar_todo();

	public Page<Curso> consultar_todo_page(Pageable p);

	public Curso CrearCurso(Curso curso);

	public Curso ModificarCurso(Curso curso);

	public Curso BuscarCurso(int id);

}
