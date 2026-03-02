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
    
    public Estudiante getEstudiante() { return estudiante; }
    public Asignatura getAsignatura() { return asignatura; }
    public double getValor() { return valor; }
    public String getPeriodo() { return periodo; }

    public void setEstudiante(Estudiante estudiante) { this.estudiante = estudiante; }
    public void setAsignatura(Asignatura asignatura) { this.asignatura = asignatura; }
    public void setValor(double valor) { this.valor = valor; }
    public void setPeriodo(String periodo) { this.periodo = periodo; }

    @Override
    public String toString() {
        return "Nota{estudiante='" + estudiante.getNombre() + "', asignatura='" +
               asignatura.getNombre() + "', valor=" + valor + ", periodo='" + periodo + "'}";
    }
}
