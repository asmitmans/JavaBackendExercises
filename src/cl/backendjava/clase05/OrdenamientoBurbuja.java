package cl.backendjava.clase05;

import java.util.Arrays;

public class OrdenamientoBurbuja {

	public static void main(String[] args) {
		
		int[] a = {4, 5, 2, 1, 7, 10};
		int aux = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length-i; j++) {
				if (a[j] < a[j-1]) {
					aux = a[j];
					a[j] = a[j-1];
					a[j-1] = aux;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
		
	}

}
