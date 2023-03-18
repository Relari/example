package com.pe.relari.model;

// Clase o Plantilla (Representacion de algo)
public class Perro {

    // Atributos.

    private Integer id;
    private String name;
    private String gender;

    // Constructor sin Parametros
    public Perro() {
    }

    // Constructor con Parametros
    public Perro(Integer id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    // Metodo GET sirve para obtener la informacion que se tiene almacenada
    public Integer getId() {
        return id;
    }

    // Metodo SET sirve para asignar informacion al atributo
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Obtener la informacion que tiene el objeto
    @Override
    public String toString() {
        return "Perro{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

}
