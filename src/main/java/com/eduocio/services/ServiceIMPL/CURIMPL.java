package com.eduocio.services.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduocio.model.Curso;
import com.eduocio.repository.ICursoRepo;
import com.eduocio.services.CursoService;

@Service
public class CURIMPL implements CursoService {

	@Autowired
	private ICursoRepo repo;

	public List<Curso> consultar_todo() {
		return (List<Curso>) this.repo.findAll();
	}

	@Override
	public Curso CrearCurso(Curso curso) {
		// venta.setCorreo_electronico(venta.getCorreo_electronico());

		return this.repo.save(curso);
	}

	@Override
	public Curso ModificarCurso(Curso curso) {
		return this.repo.save(curso);
	}

	@Override
	public Curso BuscarCurso(int id) {
		return this.repo.findById(id).get();
	}

}
