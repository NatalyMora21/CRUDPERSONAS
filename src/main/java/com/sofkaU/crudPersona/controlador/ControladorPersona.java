package com.sofkaU.crudPersona.controlador;


import com.sofkaU.crudPersona.entidades.Persona;
import com.sofkaU.crudPersona.servicios.InterfazServiciosPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class ControladorPersona {

    @Autowired
    //Instancia de la interfaz
    private InterfazServiciosPersona servicio;

    @GetMapping(value = "/listarpersonas")
    public Iterable<Persona>listarpersonas() {
        return servicio.listar();
    }

    @PostMapping(value = "/guardarPersona")
    //Capturar la información que viene de la solicitud @RequestBody
    public Persona guardarPersona(@RequestBody Persona persona){
        return servicio.guardar(persona);
    }
}
