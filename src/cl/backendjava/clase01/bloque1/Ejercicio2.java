package cl.backendjava.clase01.bloque1;

import java.util.Scanner;

/* Calcule el área y perímetro de un círculo */
public class Ejercicio2 {
	
	public static void main(String[] args) {
		final double PI = 3.1415;
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Ingrese el radio del circulo: ");
			double r = Double.parseDouble(scanner.nextLine()); 
								
		    double perimetro = 2 * PI * r;
			double area = PI * r * r;
			
			System.out.printf("El perimetro del circulo es: %.2f%n", perimetro);
			System.out.printf("El area del circulo es: %.2f%n", area);
			
		} catch (NumberFormatException e) {
			System.out.println("numero ingresado invalido.");
			
		} finally {
			scanner.close();
		}
		
	}

}
