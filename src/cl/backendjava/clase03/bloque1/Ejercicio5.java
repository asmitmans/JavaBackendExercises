package cl.backendjava.clase03.bloque1;

import java.util.HashMap;
import java.util.Map;

/* Obtenga la frecuencia de aparición de palabras en un texto */
public class Ejercicio5 {

	public static void main(String[] args) {
		
		String texto = "Esta es la casa que construyó Jack. Esta es la malta "
				+ "que yacía en la casa que construyó Jack. Esta es la "
				+ "rata que se comió la malta que yacía en la casa que "
				+ "construyó Jack.";
		String[] palabras = texto.toLowerCase().replace(".", "").split(" ");
		
		// Conteo de palabras
		HashMap<String, Integer> conteoPalabras = new HashMap<String, Integer>();
		for (String palabra: palabras) {
			conteoPalabras.put(palabra, conteoPalabras.getOrDefault(palabra,0) + 1);
		}
		
		// Mostrar resultado				
		for (Map.Entry<String, Integer> entry : conteoPalabras.entrySet()) {
		    System.out.println(entry.getKey() + ": " + entry.getValue());
		}
				
	}

}
