package edu.ilp.lbedoya.controller;

import edu.ilp.lbedoya.entity.Persona;
import edu.ilp.lbedoya.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("persona")
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @GetMapping("/listarPersona")
    public List<Persona> listarPersona(){
        return  this.personaService.listarPersona();
    }

}
