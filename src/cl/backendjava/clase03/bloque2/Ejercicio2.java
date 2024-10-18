package cl.backendjava.clase03.bloque2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Ejercicios - N-Reinas  
 * Implemente una función que genere los vecinos de un nodo
 * 
 * Un nodo representa una solución parcial o completa del tablero.
 * Los vecinos o hijos de un nodo son las nuevas soluciones generadas
 * al colocar una reina adicional en una fila vacía, siempre y cuando 
 * la configuración sea válida (sin reinas en la misma columna o diagonal).
 * 
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		
		Integer[] solucion = {1, 3, 5, 7, 2, 0, 0, 0}; 
		System.out.println("nodo : \n" + Arrays.toString(solucion));
				
		System.out.println("vecinos : ");
		generarHijos(solucion).forEach(hijo-> {
			System.out.println(Arrays.toString(hijo));
			});
	}
	
	public static List<Integer[]> generarHijos(Integer[] solucion) {
		List<Integer[]> hijos = new ArrayList<Integer[]>();
		Set<Integer> columnasUsadas = new HashSet<>();
		
		for (Integer col : solucion) {
			if(col!=0) {
				columnasUsadas.add(col);
			}
		}
		
		
		for (int i = 0; i < solucion.length; i++) {
			if (solucion[i] == 0) {
				
				for (int columna = 1; columna <= solucion.length; columna++) {
					if (!columnasUsadas.contains(columna)) {
						Integer[] solucionAux = Arrays.copyOf(solucion, solucion.length);
						solucionAux[i] = columna;
						if (isValid(solucionAux)) {
							hijos.add(solucionAux);
						}
					}
				}
			}
		}
		
		return hijos;
	}
	
	
	public static boolean isValid(Integer[] solucion) {
		for (int i = 0; i < solucion.length; i++) {
			for (int j = i + 1; j < solucion.length; j++) {
				if (solucion[i] != 0 && solucion[j] != 0) {
					if (solucion[i] == solucion[j] || 
							Math.abs(i - j) == Math.abs(solucion[i] - solucion[j])) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
}
