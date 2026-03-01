/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemaacademico;

/**
 *
 * @author HP
 */
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
}
