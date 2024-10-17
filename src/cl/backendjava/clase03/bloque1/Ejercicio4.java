package cl.backendjava.clase03.bloque1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Obtenga las palabras únicas de un texto */
public class Ejercicio4 {

	public static void main(String[] args) {
		
		String texto = "Esta es la casa que construyó Jack. Esta es la malta "
				+ "que yacía en la casa que construyó Jack. Esta es la "
				+ "rata que se comió la malta que yacía en la casa que "
				+ "construyó Jack.";
				
		String[] palabras = texto.toLowerCase().replace(".", "").split(" ");
		
		// Metodo 1 : usando un for para llenar el Set
		Set<String> unicas = new HashSet<String>();
		
		for (String word : palabras) {
			unicas.add(word);			
		}

		System.out.println(unicas);
		System.out.println(unicas.size());
		System.out.println("-------------------");
		
		
		// Metodo 2 : pasando el array en la inicializacion de Set
		Set<String> unicas2 = new HashSet<String>(Arrays.asList(palabras));
		System.out.println(unicas2);
		System.out.println(unicas2.size());
		
		
	}

}
