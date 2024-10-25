package cl.backendjava.clase05;

import java.util.Arrays;

public class OrdenamientoSeleccion {

	public static void main(String[] args) {
		
		int[] a = {4, 5, 2, 1, 7, 10};
		int aux = 0;
		int i_menor = 0;
		
		for (int i = 0; i < a.length - 1 ; i++) {
			i_menor = i;
			for (int j = i+1; j < a.length; j++) {
				if(a[j]<a[i_menor]) {
					i_menor=j;
				}			
			}
			aux = a[i];
			a[i] = a[i_menor];
			a[i_menor] = aux;
						
		}
		
		System.out.println(Arrays.toString(a));
				
		
	}

}
