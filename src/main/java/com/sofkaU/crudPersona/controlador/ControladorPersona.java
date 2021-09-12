package com.sofkaU.crudPersona.controlador;


import com.sofkaU.crudPersona.entidades.Persona;
import com.sofkaU.crudPersona.servicios.InterfazServiciosPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    //Capturar la información que viene de la solicitud @RequestBody
    @PostMapping(value = "/guardarPersona")
    public Persona guardarPersona(@RequestBody Persona persona){
        return servicio.guardar(persona);
    }

    @GetMapping("/obtenerById/{id}")
    public Optional<Persona> obtenerById(@PathVariable("id") int id) {
        return servicio.listarId(id);
    }

    @DeleteMapping("/eliminarById/{id}")
    public void eliminarById(@PathVariable("id") int id) {
        servicio.borrar(id);
    }


}
