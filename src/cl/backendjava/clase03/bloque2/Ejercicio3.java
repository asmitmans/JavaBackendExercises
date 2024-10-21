package cl.backendjava.clase03.bloque2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/* Ejercicios - N-Reinas  
 * Implemente la búsqueda en profundidad (DFS, Depth-First Search)
 * 
 * Un nodo representa una solución parcial o completa del tablero.
 * Los vecinos o hijos de un nodo son las nuevas soluciones generadas
 * al colocar una reina adicional en una fila vacía, siempre y cuando 
 * la configuración sea válida (sin reinas en la misma columna o diagonal).
 * 
 * - Visitados: Son nodos que ya han sido completamente procesados (se generaron
 *   todos sus vecinos). Se añaden al conjunto nodosVisitados para no volver a
 *   procesarlos.
 * - Por visitar: Son nodos que están en la pila, esperando a ser procesados. Una
 *   vez que son procesados, se marcarán como visitados.
 *   
 * 
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		
		Set<List<Integer>> nodosVisitados = new HashSet<>();
		Stack<List<Integer>> pila = new Stack<List<Integer>>();
		List<Integer> solucion = List.of(0, 0, 0, 0, 0, 0, 0, 0);
		
		if (!isValid(solucion)) {
	        System.out.println("La solución inicial no es válida. No se puede continuar.");
	        return;
	    }
		
		pila.push(solucion);
		
		while (!pila.isEmpty()) {
			
			List<Integer> nodo = pila.pop();
			
			if(nodosVisitados.contains(nodo)) {
				continue;
			}
			
			nodosVisitados.add(nodo);
			
			if (nodo.contains(0)) {
				List<List<Integer>> vecinos = generarHijos(nodo);
				
				for (List<Integer> vecino : vecinos) {
					pila.push(vecino);					
				}
				
			} else {
				// Nos detenemos al encontrar la primera solucion completa
				System.out.println("Solución completa: " + nodo);
				break;
			}
		}
		
		
	}
	
	public static List<List<Integer>> generarHijos(List<Integer> solucion) {
		List<List<Integer>> hijos = new ArrayList<List<Integer>>();
		Set<Integer> columnasUsadas = new HashSet<>();
		
		for (Integer col : solucion) {
			if(col!=0) {
				columnasUsadas.add(col);
			}
		}
		
		
		for (int i = 0; i < solucion.size(); i++) {
			if (solucion.get(i) == 0) {
				
				for (int columna = 1; columna <= solucion.size(); columna++) {
					if (!columnasUsadas.contains(columna)) {
						List<Integer> solucionAux = new ArrayList<>(solucion); 
						solucionAux.set(i, columna);
						if (isValid(solucionAux)) {
							hijos.add(solucionAux);
						}
					}
				}
			}
		}
		
		return hijos;
	}
	
	
	public static boolean isValid(List<Integer> solucion) {
		for (int i = 0; i < solucion.size(); i++) {
			for (int j = i + 1; j < solucion.size(); j++) {
				if (solucion.get(i) != 0 && solucion.get(j) != 0) {
					if (solucion.get(i) == solucion.get(j) || 
							Math.abs(i - j) == Math.abs(solucion.get(i) - solucion.get(j))) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	/*
	 * Notas: cambio de Integer[] a List<Integer>:
	 * Copia de lista: Usa new ArrayList<>(solucion) para crear una copia de la lista.
	 * Modificar elementos: Usa set(i, columna) para modificar un elemento en una lista.
	 * 	  
	 * */
	
}
