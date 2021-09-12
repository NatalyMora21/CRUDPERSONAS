package com.sofkaU.crudPersona.entidades;

import javax.persistence.*;

@Entity
@Table(name="persona")

public class Persona {

    //Etiqueta para que la base de datos identifique el tipo de atributo
    //Si el id no entra dentro del constructor, lo genera automaticamente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String edad;

    public Persona() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
