package edu.ilp.lbedoya.service.Impl;

import edu.ilp.lbedoya.dao.IProfesorDao;
import edu.ilp.lbedoya.entity.Curso;
import edu.ilp.lbedoya.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorServiceImpl implements IProfesorService {
    @Autowired
    IProfesorDao profesordao;

    @Override
    public List<Curso> obtenerCursoPorProfesor(Long idprofesor)  {
        return this.profesordao.obtenerCursoPorProfesor (idprofesor);
    }
}
