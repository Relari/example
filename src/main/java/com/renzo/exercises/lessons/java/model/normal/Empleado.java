package com.renzo.exercises.lessons.java.model.normal;

public class Empleado {

    private Integer id;
    private String nombre;
    private Integer edad;
    private String sexo;
    private String cargo;
    private Double sueldo;
    private Boolean activo;

    public Empleado() {}

    public Empleado(Integer id, String nombre, Integer edad, String sexo, String cargo, Double sueldo, Boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.activo = activo;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Boolean getActivo() {
        return activo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                ", cargo='" + cargo + '\'' +
                ", sueldo=" + sueldo +
                ", activo=" + activo +
                '}';
    }
}
