package com.sofkaU.crudPersona.servicios;
import com.sofkaU.crudPersona.entidades.Persona;

import java.util.List;

public interface InterfazServiciosPersona {

    public List<Persona> listar();
    public Persona listarId(int id);
    public Persona guardar(Persona persona);
    public void borar(int id);
    public Persona actualizar(Persona persona);
}
