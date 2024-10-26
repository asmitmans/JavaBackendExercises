package cl.backendjava.clase05;

import java.util.Arrays;

/**
 * Algoritmo de Ordenamiento Burbuja
 *
 * Descripción simplificada: Este método ordena datos en orden ascendente 
 * recorriendo el arreglo y comparando pares consecutivos de elementos.
 * En cada pasada, el mayor de los elementos desordenados se mueve a su 
 * posición final.
 */
public class OrdenamientoBurbuja {

    public static void main(String[] args) {
        
        int[] a = {4, 5, 2, 1, 7, 10};
        int aux = 0;
        
        System.out.println(Arrays.toString(a));
        
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j] < a[j - 1]) {
                    aux = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = aux;
                }
            }
        }
        
        System.out.println(Arrays.toString(a));
        
    }
}