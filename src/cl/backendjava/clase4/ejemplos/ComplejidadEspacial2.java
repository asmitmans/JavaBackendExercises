package cl.backendjava.clase4.ejemplos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class ComplejidadEspacial2 {
	
	public static void main(String[] args) {
		
		List<Integer> original = new ArrayList<>(List.of(20, 25, 30, 35, 40));
		
		Random random = new Random();
		
		System.out.println("Original: " + original);
			
		int r1 = 0;
		int r2 = 0;
		int aux = 0;

		for (int i = 0; i < original.size(); i++) {
			
			r1 = random.nextInt(original.size());
			r2 = random.nextInt(original.size());
			
			aux = original.get(r1);

			original.set(r1, original.get(r2));
			original.set(r2, aux);
		}

		System.out.println("Desordenada: " + original);

	}

}
