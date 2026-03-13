/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamientodeburbuja;
import java.util.Arrays;
/**
 *
 * @author efrainvalenzuela
 */

public class Main {
    

    public static void main(String[] args) {

        int[] numeros = {5, 2, 9, 1, 3};

        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(numeros));

        Ordenamientos.selectionSort(numeros); 

        System.out.println("Arreglo ordenado:");
        System.out.println(Arrays.toString(numeros));

    }

}

