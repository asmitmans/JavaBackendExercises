package cl.backendjava.clase03.bloque1;

import java.util.HashSet;
import java.util.Set;


/*  Obtenga la diferencia entre dos conjuntos  */
public class Ejercicio2 {
	public static void main(String[] args) {
		Set<Integer> A = Set.of(1, 2, 3, 4, 5);
		Set<Integer> B = Set.of(4, 5, 6, 7);
		
		Set<Integer> resta = new HashSet<>(A);
		resta.removeAll(B); 
		
		System.out.println("A - B : " + resta);
	}

}
