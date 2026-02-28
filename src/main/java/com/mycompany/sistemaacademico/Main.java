package com.mycompany.sistemaacademico;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    private ArrayList<String> estudiantes;
    private ArrayList<String> asignaturas;
    private ArrayList<String> notas;

    public Main() {
        this.estudiantes = new ArrayList<>();
        this.asignaturas = new ArrayList<>();
        this.notas = new ArrayList<>();
    }

    public static void main(String[] args) {
        Main sistema = new Main();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            opcion = sistema.mostrarMenu(scanner);

            switch (opcion) {
                case 1 -> sistema.registrarEstudiante();
                case 2 -> sistema.listarEstudiantes();
                case 3 -> sistema.buscarEstudiante();
                case 4 -> sistema.actualizarEstudiante();
                case 5 -> sistema.eliminarEstudiante();
                case 6 -> sistema.registrarAsignatura();
                case 7 -> sistema.listarAsignaturas();
                case 8 -> sistema.buscarAsignatura();
                case 9 -> sistema.actualizarAsignatura();
                case 10 -> sistema.eliminarAsignatura();
                case 11 -> sistema.registrarNota();
                case 12 -> sistema.listarNotas();
                case 13 -> sistema.buscarNota();
                case 14 -> sistema.actualizarNota();
                case 15 -> sistema.eliminarNota();
                case 0 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
    public int mostrarMenu(Scanner scanner) {
        System.out.println("\n===== MENÚ PRINCIPAL =====");
        System.out.println("--- Estudiantes ---");
        System.out.println("1. Registrar Estudiante");
        System.out.println("2. Listar Estudiantes");
        System.out.println("3. Buscar Estudiante");
        System.out.println("4. Actualizar Estudiante");
        System.out.println("5. Eliminar Estudiante");
        System.out.println("--- Asignaturas ---");
        System.out.println("6. Registrar Asignatura");
        System.out.println("7. Listar Asignaturas");
        System.out.println("8. Buscar Asignatura");
        System.out.println("9. Actualizar Asignatura");
        System.out.println("10. Eliminar Asignatura");
        System.out.println("--- Notas ---");
        System.out.println("11. Registrar Nota");
        System.out.println("12. Listar Notas");
        System.out.println("13. Buscar Nota");
        System.out.println("14. Actualizar Nota");
        System.out.println("15. Eliminar Nota");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        return opcion;
    }
}

    