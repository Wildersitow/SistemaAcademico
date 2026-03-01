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
}
