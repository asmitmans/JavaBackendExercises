package cl.backendjava.clase03.bloque1;

import java.util.HashSet;
import java.util.Set;


/* Obtenga la intersección de dos conjuntos   */
public class Ejercicio1 {
	public static void main(String[] args) {
		
		Set<Integer> A = Set.of(1, 2, 3, 4, 5);
		Set<Integer> B = Set.of(4, 5, 6, 7);
		
		Set<Integer> interseccion = new HashSet<>(A);
		interseccion.retainAll(B);  
				
		System.out.println("Interseccion de A y B : " + interseccion);
	}

}
