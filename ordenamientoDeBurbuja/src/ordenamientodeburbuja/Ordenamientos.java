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

        int n = arr.length; // operación...

        for (int i = 0; i < n - 1; i++) { // ciclo externo...

            for (int j = 0; j < n - i - 1; j++) { // ciclo interno..

                if (arr[j] > arr[j + 1]) { // comparación...

                    int temp = arr[j]; // asignación..
                    arr[j] = arr[j + 1]; // asignación..
                    arr[j + 1] = temp; // asignación..

                }

            }

        }

        /*
        Conteo de operaciones aproximado:

        Comparaciones ≈ n²
        Asignaciones ≈ 3n

        T(n) = n² + 3n

        Complejidad asintótica:
        O(n²)
        */
        
        //by efra valenzuela

    }

}
    

