package cl.backendjava.clase05;

import java.text.spi.DateFormatProvider;
import java.util.Arrays;

/**
 * Algoritmo de Ordenamiento por Selección
 *
 * QuickSort ordena los datos al seleccionar un elemento como pivote y reordenar 
 * el arreglo en torno a él: coloca los elementos menores a la izquierda y los 
 * mayores a la derecha. Luego aplica el mismo proceso recursivamente a cada parte
 * hasta que todo el arreglo esté ordenado.
 */
public class OrdenamientoQuicksort {

	public static void main(String[] args) {
		
		int[] arr = {4, 5, 2, 1, 7, 10};
		
		
		System.out.println(Arrays.toString(arr));
				
		quicksort(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(arr));		
		
	}
	
	public static void quicksort(int[] arr, int inicio, int fin) {
		
				
		if(inicio >= fin) {
			return;
		}
		
		
		System.out.print("[");
		for (int i =inicio; i <= fin; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
				
		
		int p_izq = inicio;
		int p_der = fin - 1;
		int pivote = arr[fin];	// se elige como pivote el ultimo elemento
		
		// Procesar el arreglo para dejar menores a la izq. de pivote y mayores a la der.
		while (p_izq <= p_der) {
			
			// recorre de izquierda a derecha buscando un elemento mayor o igual al pivote.
			while (p_izq < fin && arr[p_izq] < pivote ) {
				p_izq++;
			}
			
			// recorre de derecha a izquierda buscando un elemento menor al pivote.
			while (p_der > inicio && arr[p_der] > pivote ) {
				p_der--;
			}
			
			// Si los punteros no se cruzaron, intercambiamos los elementos
		    if (p_izq <= p_der) {
		        int temp = arr[p_izq];
		        arr[p_izq] = arr[p_der];
		        arr[p_der] = temp;
		        // Después del intercambio, avanzamos ambos punteros para 
		        // continuar con el siguiente par no procesado.
		        p_izq++;
		        p_der--;
		    }
		}
		
		// Colocar el pivote en su posición final (p_izq es su posición correcta ahora)
		 arr[fin] = arr[p_izq];
		 arr[p_izq] = pivote;
		
		// Llamadas recursisvas para ordenar los subarrays
		quicksort(arr, inicio, p_izq - 1);	// Subarray de elementos menores al pivote
		quicksort(arr, p_izq + 1, fin);		// Subarray de elementos mayores al pivote					
			
	}	

}
