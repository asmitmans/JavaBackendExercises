package cl.backendjava.clase03.bloque1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Ejercicio4 {

	public static void main(String[] args) {
		
		String frase = "Esta es la casa que construyó Jack. Esta es la malta "
				+ "que yacía en la casa que construyó Jack. Esta es la "
				+ "rata que se comió la malta que yacía en la casa que "
				+ "construyó Jack.";
				
		String[] palabras = frase.toLowerCase().replace(".", "") .split(" ");
		Set<String> unicasSet = new HashSet<String>();
		
		for (String word : palabras) {
			unicasSet.add(word);			
			System.out.println(word);
		}
		
		System.out.println("-------------------");
		
		System.out.println(unicasSet);
		System.out.println(unicasSet.size());
		
		Set<String> unicasSet2 = new HashSet<String>(Arrays.asList(palabras));
		
		System.out.println(unicasSet2);
		System.out.println(unicasSet2.size());

	}

}
