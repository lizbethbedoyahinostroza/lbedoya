package edu.ilp.lbedoya.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;
import edu.ilp.lbedoya.entity.Direccion;

@Repository
public interface IDireccionDao extends CrudRepository<Direccion,Long> {
    @Async
    @Query("SELECT distinct e.direccion  FROM Estudiante e WHERE e.codigo = :codigo")
    Direccion obtenerDireccionPorCodigo(@Param("codigo") String codigo);
}
