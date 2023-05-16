package com.eduocio.services;

import java.util.List;

import com.eduocio.model.Curso;

public interface CursoService {

	public List<Curso> consultar_todo();

	public Curso CrearCurso(Curso curso);

	public Curso ModificarCurso(Curso curso);

	public Curso BuscarCurso(int id);

}
