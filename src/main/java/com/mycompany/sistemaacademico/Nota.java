package com.mycompany.sistemaacademico;

public class Nota {
    private Estudiante estudiante;
    private Asignatura asignatura;
    private double valor;
    private String periodo;

    public Nota(Estudiante estudiante, Asignatura asignatura, double valor, String periodo) {
        this.estudiante = estudiante;
        this.asignatura = asignatura;
        this.valor = valor;
        this.periodo = periodo;
    }
    
    
}
