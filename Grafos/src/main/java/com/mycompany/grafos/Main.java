/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grafos;

import java.util.Scanner;

/**
 *
 * @author efrainvalenzuela
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grafos g = new Grafos();
        int opcion;

        do {
            System.out.println("1. Agregar vértice");
            System.out.println("2. Conectar vértices");
            System.out.println("3. Mostrar grafo");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del vértice: ");
                    String nombre = sc.nextLine();
                    g.agregarVertice(nombre);
                    System.out.println("Vértice agregado correctamente.");
                    break;
                case 2:
                    System.out.print("Origen: ");
                    String origen = sc.nextLine();
                    System.out.print("Destino: ");
                    String destino = sc.nextLine();
                    g.agregarArista(origen, destino);
                    System.out.println("Conexión realizada correctamente.");
                    break;
                case 3:
                    g.mostrarGrafo();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        sc.close();
    }
    
}
