package cl.backendjava.clase03.bloque2;

/*  Ejercicios - N-Reinas  */
/*  Implemente una función que valide si una solución es válida  */
public class Ejercicio1 {

	public static void main(String[] args) {
		
		//int[] solucion = {0, 4, 7, 5, 2, 6, 1, 3}; // Solución válida
		//int[] solucion = {0, 4, 7, 5, 2, 6, 6, 3}; // Solución inválida (columna)
		//int[] solucion = {0, 2, 3, 6, 4, 3, 5, 7}; // Solución inválida (diagonal)
		int[] solucion = {1, 3, 5, 7, 2, 0, 6, 4}; // Solución válida
				
		
		boolean isValid = true;
		for (int i=0; i<solucion.length;i++) {
			if(solucion[i] == 0) {
				continue;
			}
			
			for (int j=i+1;j<solucion.length;j++) {
				if (solucion[j] == 0) {
					continue;
				}
				
				System.out.println(i + "," + solucion[i] + " : " + j + "," + solucion[j]);
				
				if (solucion[i] == solucion[j]) {
					isValid = false;
					break;
				}
				
				if ( Math.abs(i - j) == Math.abs(solucion[i] - solucion[j]) ) {
					isValid = false;
					break;
				}
								
			}
			if (!isValid) {
		        break;
		    }
		}
		
		if(isValid) {
			System.out.println("Solucion valida");
		} else {
			System.out.println("Solucion invalida");
		}

	}
	
	
	/*
	 * Nota sobre diagonales:
	 * ∣i−j∣==∣solucion[i]−solucion[j]∣ significa que están en la misma diagonal, 
	 * ya que la pendiente es 1 (o -1).
	 * Relacionándolo con rectas: las diagonales son líneas donde el cambio en
	 * y (filas) es igual al cambio en x (columnas).
	 * 
	 * */
	
}
