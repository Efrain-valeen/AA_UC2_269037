/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grafos;


/**
 *
 * @author efrainvalenzuela
 */
import java.util.*;

public class Grafos {
    
    private Map<String, List<String>> grafo = new HashMap<>();

   
      
     
     // Si el vértice no existe, lo agrega con una lista vacía de conexiones.
     // Si ya existe, no hace nada.
     
    public void agregarVertice(String nombre) {
        grafo.putIfAbsent(nombre, new ArrayList<>());
    }

     // containsKey(origen/destino): verifica que ambos vértices existan en el grafo.
     // get(origen): obtiene la lista de conexiones del vértice origen para añadirle el destino.
     
     // Como el grafo es no dirigido, también se agrega el origen al destino.
     
    public void agregarArista(String origen, String destino) {
        if (grafo.containsKey(origen) && grafo.containsKey(destino)) {
            grafo.get(origen).add(destino);
            grafo.get(destino).add(origen);
        } else {
            System.out.println("Uno o ambos vértices no existen.");
        }
    }

    
     // keySet(): devuelve todas las claves (vértices) del mapa.
     // get(vertice): obtiene la lista de vértices conectados a ese vértice.
     
    public void mostrarGrafo() {
        System.out.println("\nEstructura del grafo:");
        for (String vertice : grafo.keySet()) {
            System.out.println("  " + vertice + " está conectado con " + grafo.get(vertice));
        }
    }
    
}