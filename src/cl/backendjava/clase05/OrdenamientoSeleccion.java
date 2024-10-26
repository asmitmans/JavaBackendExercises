package cl.backendjava.clase05;

import java.util.Arrays;

/**
 * Algoritmo de Ordenamiento por Selección
 *
 * Descripción simplificada: Ordena los números de menor a mayor.
 * En cada pasada, encuentra el elemento menor en la parte desordenada del arreglo
 * y lo intercambia con el primer elemento desordenado, expandiendo el grupo ordenado.
 */
public class OrdenamientoSeleccion {

	public static void main(String[] args) {
		
		int[] a = {4, 5, 2, 1, 7, 10};
		
		System.out.println(Arrays.toString(a));
				
		int i_menor = 0;
		int aux = 0;
		for (int i = 0; i < a.length - 1; i++) {
			i_menor = i;							// asigno primer elemento desordenado como menor
			for (int j = i; j < a.length; j++) {
				if (a[j] < a[i_menor]) {			// si hay otro menor => i_menor se cambia
					i_menor = j;				
				}
			}
			aux = a[i];								// intercambio menor con primero desordenado
			a[i] = a[i_menor];
			a[i_menor] = aux;
		}
		
		System.out.println(Arrays.toString(a));		
		
	}

}
