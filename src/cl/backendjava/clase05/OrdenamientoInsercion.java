package cl.backendjava.clase05;

import java.util.Arrays;

/**
 * Algoritmo de Ordenamiento por Inserción
 *
 * Descripción simplificada: Ordena los números de menor a mayor.
 * Comienza asumiendo que el primer elemento está ordenado;
 * guarda el elemento actual en una variable auxiliar y recorre el grupo ordenado
 * de derecha a izquierda, moviendo a la derecha los elementos mayores.
 * Luego coloca el valor guardado en la posición correcta encontrada.
 */
public class OrdenamientoInsercion {

    public static void main(String[] args) {
        
        int[] a = {4, 5, 2, 1, 7, 10};
        
        System.out.println(Arrays.toString(a));
        
        for (int i = 1; i < a.length; i++) { 	   
            int num = a[i];					// Guarda el elemento actual en una variable auxiliar
            int j = i - 1;
            while(j >= 0 && a[j]>num) {		// Corre los elementos mayores hacia la derecha
               	a[j+1] = a[j];
               	j--;
            }
            a[j+1]=num;						// Coloca el elemento guardado en la posición encontrada
        }
        
        System.out.println(Arrays.toString(a));
            
    }   
        
}
