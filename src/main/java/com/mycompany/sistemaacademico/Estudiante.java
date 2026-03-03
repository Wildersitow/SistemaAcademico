package com.mycompany.sistemaacademico;


public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private int semestre;
    private String codigo;
public Estudiante(String nombre,String apellido, int edad, int semestre, String codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.semestre = semestre;
        this.codigo = codigo;
    }
public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
    
    @Override
public String toString() {
    return "Estudiante{" +
            "nombre=" + nombre + '\'' +
            ", edad=" + edad +"apellido="
            + apellido + '\'' +
            ", semestre=" + semestre +
            ", codigo='" + codigo + '\'' +
            '}';
}
    
}
