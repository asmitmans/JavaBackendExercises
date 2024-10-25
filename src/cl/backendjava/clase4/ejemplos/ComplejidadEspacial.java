package cl.backendjava.clase4.ejemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ComplejidadEspacial {
	
	public static void main(String[] args) {
		
		List<Integer> original = new ArrayList<>(List.of(20, 25, 30, 35, 40));		
		List<Integer> indices = new ArrayList<Integer>();
		List<Integer> desordenada = new ArrayList<>();
		
		
		// Generar indices aleatorios
		while (indices.size() < original.size()) {
            int indiceAleatorio = (int) (Math.random() * original.size());
            if(!indices.contains(indiceAleatorio)) {
            	indices.add(indiceAleatorio);
            }
        }
		
		// Llenar nueva lista
		for (int j=0;j<original.size();j++) {
			desordenada.add(original.get(indices.get(j)));			
		}
        
		
		System.out.println(original);
		System.out.println(indices);
		System.out.println(desordenada);
	}

}
