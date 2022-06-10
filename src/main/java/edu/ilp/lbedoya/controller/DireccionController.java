package edu.ilp.lbedoya.controller;

import edu.ilp.lbedoya.entity.Direccion;
import edu.ilp.lbedoya.service.IDireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("direccion")
public class DireccionController {

    @Autowired
    private IDireccionService direccionService;

    @GetMapping( "/buscarDireccionBycodigo" )
    public Direccion buscarDireccionByCodigo(@RequestParam String codigo) {
        return this.direccionService.obtenerDireccionPorCodigo (codigo);

    }
}
