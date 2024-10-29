package cl.backendjava.clase06.POO.model;

public class Calculadora {
	
	public Calculadora() {
	}

	public double suma(double d, double e) {
		return d + e;
	}
	
	public double resta(double a, double b) {
		return a - b;
	}
	
	public double multiplicar(double a, double b) {
		return a * b;
	}
	
	public double dividir(double a, double b) {
		if (b==0) {
			System.out.println("ERROR division por cero");
			return 0;
		}
		return a / b;
	}
	
	public double potencia(double a, double b) {
		return (float) Math.pow(a, b);
	}
		
	

}
