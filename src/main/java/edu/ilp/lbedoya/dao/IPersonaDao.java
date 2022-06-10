package edu.ilp.lbedoya.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.ilp.lbedoya.entity.Persona;


public interface IPersonaDao extends JpaRepository<Persona,Long> {
}
