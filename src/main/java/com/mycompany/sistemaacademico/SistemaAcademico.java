package com.mycompany.sistemaacademico;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaAcademico {

   static ArrayList<String> asignaturas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void registrarAsignatura() {
        System.out.print("Ingrese nombre de la asignatura: ");
        String nombre = scanner.nextLine();
        asignaturas.add(nombre);
        System.out.println("Asignatura registrada correctamente.");
    }
    public static void listarAsignaturas() {
    for (String asignatura : asignaturas) {
        System.out.println(asignatura);
    }
}

public static void buscarAsignatura() {
    System.out.print("Ingrese nombre a buscar: ");
    String nombre = scanner.nextLine();

    if (asignaturas.contains(nombre)) {
        System.out.println("Asignatura encontrada.");
    } else {
        System.out.println("No existe.");
    }
}
public static void actualizarAsignatura() {
    System.out.print("Nombre actual: ");
    String actual = scanner.nextLine();

    int index = asignaturas.indexOf(actual);

    if (index != -1) {
        System.out.print("Nuevo nombre: ");
        String nuevo = scanner.nextLine();
        asignaturas.set(index, nuevo);
        System.out.println("Actualizada correctamente.");
    } else {
        System.out.println("No encontrada.");
    }
}
public static void eliminarAsignatura() {
    System.out.print("Nombre a eliminar: ");
    String nombre = scanner.nextLine();

    if (asignaturas.remove(nombre)) {
        System.out.println("Eliminada correctamente.");
    } else {
        System.out.println("No encontrada.");
    }
}
}
