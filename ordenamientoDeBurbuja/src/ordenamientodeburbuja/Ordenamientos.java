/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamientodeburbuja;

/**
 *
 * @author efrainvalenzuela
 */
public class Ordenamientos {
    
    public static void bubbleSort(int[] arr) {

        int n = arr.length; // 1 operación de asignacion

        for (int i = 0; i < n - 1; i++) { 
            // inicialización = 1
            // comparación = n
            // incremento = n

            for (int j = 0; j < n - i - 1; j++) { 
                // inicialización = 1
                // comparación ≈ n
                // incremento ≈ n

                if (arr[j] > arr[j + 1]) { // comparación

                    int temp = arr[j]; // asignación
                    arr[j] = arr[j + 1]; // asignación
                    arr[j + 1] = temp; // asignación

                }

            }

        }

        /*
        Conteo de operaciones aproximado

        Comparaciones ≈ n²
        Asignaciones ≈ 3n
        Incrementos ≈ n

        Expresión algebraica aproximada:

        T(n) = n² + 3n + 1

        Notación asintótica:
        O(n²)

        Esto ocurre porque el algoritmo utiliza dos ciclos
        anidados que recorren el arreglo varias veces.
        */
        
        //by efra valenzuela

    }


    // ALGORITMO 2: SELECTION SORT
   
    public static void selectionSort(int[] arr) {

        int n = arr.length; // asignación

        for (int i = 0; i < n - 1; i++) { 
            // inicialización = 1
            // comparación ≈ n
            // incremento ≈ n

            int min = i; // asignación

            for (int j = i + 1; j < n; j++) { 
                // comparación ≈ n

                if (arr[j] < arr[min]) { // comparación
                    min = j; // asignación
                }

            }

            int temp = arr[min]; // asignación
            arr[min] = arr[i]; // asignación
            arr[i] = temp; // asignación

        }

        /*
        Conteo aproximado de operaciones

        Comparaciones ≈ n²
        Asignaciones ≈ 3n

        Expresión algebraica:

        T(n) = n² + 3n

        Complejidad asintótica:
        O(n²)

        Selection Sort siempre recorre todo el arreglo
        para encontrar el valor mínimo en cada iteración.
        */

    }

}
