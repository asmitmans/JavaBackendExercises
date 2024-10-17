package cl.backendjava.clase03.bloque1;

import java.util.HashSet;
import java.util.Set;


/*  Compruebe si un conjunto B es subconjunto (está contenido) dentro de un 
 * conjunto A  */
public class Ejercicio3 {
	public static void main(String[] args) {
		
		Set<Integer> A = Set.of(1, 2, 3, 4, 5);
		Set<Integer> B = Set.of(2, 1);
		Set<Integer> C = Set.of(1, 2, 7);
		
		boolean isSubSetB = A.containsAll(B);
		boolean isSubSetC = A.containsAll(C);
		
		System.out.println("B es subconjunto de A : " + isSubSetB);
		System.out.println("C es subconjunto de A : " + isSubSetC);
	}

}
