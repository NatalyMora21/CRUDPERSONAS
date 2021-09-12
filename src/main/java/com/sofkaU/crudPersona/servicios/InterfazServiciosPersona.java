package com.sofkaU.crudPersona.servicios;
import com.sofkaU.crudPersona.entidades.Persona;

import java.util.List;
import java.util.Optional;

public interface InterfazServiciosPersona {

    public List<Persona> listar();
    public Optional<Persona> listarId(int id);
    public Persona guardar(Persona persona);
    public void borrar(int id);
    public Persona actualizar(Persona persona);
}
