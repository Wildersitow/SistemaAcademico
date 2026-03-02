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
    public void registrarEstudiante() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el codigo: ");
        String codigo = scanner.nextLine();
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese el semestre: ");
        int semestre = scanner.nextInt();
        scanner.nextLine();
        Estudiante e = new Estudiante(codigo, nombre, apellido, edad, semestre);
        estudiantes.add(e);
        System.out.println("Estudiante registrado correctamente.");
    }
    
    public void listarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("=== Lista de Estudiantes ===");
            for (int i = 0; i < estudiantes.size(); i++) {
                System.out.println((i + 1) + ". " + estudiantes.get(i));
            }
        }
    }
    
    public void buscarEstudiante() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el código del estudiante a buscar: ");
        String codigo = scanner.nextLine();
        boolean encontrado = false;
        for (Estudiante e : estudiantes) {
            if (e.getCodigo().equalsIgnoreCase(codigo)) {
                System.out.println("Estudiante encontrado: " + e);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Estudiante no encontrado.");
        }
    }
    
    public void actualizarEstudiante() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el codigo del estudiante a actualizar: ");
        String codigo = scanner.nextLine();
        boolean encontrado = false;
        for (Estudiante e : estudiantes) {
            if (e.getCodigo().equalsIgnoreCase(codigo)) {
                System.out.print("Nuevo nombre (" + e.getNombre() + "): ");
                String nombre = scanner.nextLine();
                System.out.print("Nuevo apellido (" + e.getApellido() + "): ");
                String apellido = scanner.nextLine();
                System.out.print("Nueva edad (" + e.getEdad() + "): ");
                int edad = scanner.nextInt();
                System.out.print("Nuevo semestre (" + e.getSemestre() + "): ");
                int semestre = scanner.nextInt();
                scanner.nextLine();
                e.setNombre(nombre);
                e.setApellido(apellido);
                e.setEdad(edad);
                e.setSemestre(semestre);
                System.out.println("Estudiante actualizado correctamente.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Estudiante no encontrado.");
        }
    }
    
    public void eliminarEstudiante() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el código del estudiante a eliminar: ");
        String codigo = scanner.nextLine();
        boolean eliminado = false;
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                System.out.println("Estudiante eliminado: " + estudiantes.remove(i));
                eliminado = true;
                break;
            }
        }
        if (!eliminado) {
            System.out.println("Estudiante no encontrado.");
        }
    }
    
    static void registrarNota(ArrayList<Nota> notas, ArrayList<Estudiante> estudiantes, ArrayList<Asignatura> asignaturas, Scanner sc) {
    System.out.print("Código del estudiante: ");
    String codEst = sc.nextLine();
    Estudiante estudiante = null;
    for (Estudiante e : estudiantes) {
        if (e.getCodigo().equals(codEst)) { estudiante = e; break; }
    }
    if (estudiante == null) { System.out.println("Estudiante no encontrado."); return; }

    System.out.print("Código de la asignatura: ");
    String codAsig = sc.nextLine();
    Asignatura asignatura = null;
    for (Asignatura a : asignaturas) {
        if (a.getCodigo().equals(codAsig)) { asignatura = a; break; }
    }
    if (asignatura == null) { System.out.println("Asignatura no encontrada."); return; }

    System.out.print("Valor de la nota: ");
    double valor = Double.parseDouble(sc.nextLine());
    System.out.print("Periodo (ej: 2024-1): ");
    String periodo = sc.nextLine();

    notas.add(new Nota(estudiante, asignatura, valor, periodo));
    System.out.println("Nota registrada correctamente.");
}
    
    
}

    