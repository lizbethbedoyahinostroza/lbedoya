package edu.ilp.lbedoya.service;

import edu.ilp.lbedoya.entity.Estudiante;

import java.util.List;

public interface IEstudianteService {
    Estudiante obtenerEstudiantePorCodigo(String codigo);

    List<Estudiante> listarEstudiantePorApeNombre(String apenombre);
}
