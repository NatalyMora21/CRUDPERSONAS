package com.sofkaU.crudPersona.servicios;

import com.sofkaU.crudPersona.entidades.Persona;
import com.sofkaU.crudPersona.repositorio.InterfazRepositorioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosPersona implements InterfazServiciosPersona {

    //Generar una instancia del repositorio
    @Autowired
    InterfazRepositorioPersona data;
    @Override
    public List<Persona> listar() {

        return (List<Persona>) data.findAll();
    }

    @Override
    public Persona listarId(int id) {

        return null;
    }

    @Override
    public Persona guardar(Persona persona) {
        return data.save(persona);
    }

    @Override
    public void borar(int id) {

    }

    @Override
    public Persona actualizar(Persona persona) {
        return null;
    }
}
