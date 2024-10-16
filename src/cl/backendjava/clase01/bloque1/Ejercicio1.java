package cl.backendjava.clase01.bloque1;

import java.util.Scanner;

/* Calcule el área y perímetro de un rectángulo */
public class Ejercicio1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Ingrese el alto del rectangulo: ");
			int a = Integer.parseInt(scanner.nextLine());
			System.out.println("Ingrese el ancho del rectangulo: ");
			int b = Integer.parseInt(scanner.nextLine());
			
			int perimetro = 2*(a + b);
			int area = a * b;
			
			System.out.println("El perimetro del rectangulo es: " + perimetro);
			System.out.println("El area del rectangulo es: " + area);
		} catch (Exception e) {
			System.out.println("numero ingresado invalido.");
		} finally {
			scanner.close();
		}
		
	}

}
