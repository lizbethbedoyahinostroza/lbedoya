package edu.ilp.lbedoya.service;

import edu.ilp.lbedoya.entity.Curso;

import java.util.List;

public interface IProfesorService {
    List<Curso> obtenerCursoPorProfesor(Long idprofesor);
}
