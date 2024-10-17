package cl.backendjava.clase03.bloque1;

import java.util.HashMap;
import java.util.Map;

/* Invierta un mapa */
public class Ejercicio6 {

	public static void main(String[] args) {
		
		Map<String, String> mapa = new HashMap<String, String>();
		mapa.put("87-594-708", "20733028-8");
		mapa.put("91-106-281", "98790004-6");
		mapa.put("43-571-303", "78687275-4"); 
		mapa.put("43-571-302", "78687275-4"); // valor duplicado
		mapa.put("16-894-711", "60459323-7");
		mapa.put("91-641-667", "58803893-8");
		
		System.out.println("Map original: ");
		for (Map.Entry<String, String> entry : mapa.entrySet()) {
			System.out.printf("%s : %s \n", entry.getKey(),entry.getValue());
		}
		System.out.println();
		
		Map<String, String> mapaInvertido = new HashMap<String, String>();
		
		for (Map.Entry<String, String> entry : mapa.entrySet()) {
			if (mapaInvertido.containsKey(entry.getValue())) {
				System.out.printf("La clave '%s' ya está utilizada por el número telefónico '%s'\n", entry.getValue(), mapaInvertido.get(entry.getValue()));
			} else {
				mapaInvertido.put(entry.getValue(), entry.getKey());
			}			
		}
		
		System.out.println("Map invertido: ");
		for (Map.Entry<String, String> entry : mapaInvertido.entrySet()) {
			System.out.printf("%s : %s \n", entry.getKey(),entry.getValue());
		}
		
		
		/* "El HashMap internamente ordena las claves según el valor hash
		 *  calculado, lo que puede alterar el orden de inserción."
		 */

	}

}