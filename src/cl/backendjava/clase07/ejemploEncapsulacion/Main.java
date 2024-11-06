package cl.backendjava.clase07.ejemploEncapsulacion;

public class Main {
	public static void main(String[] args) {
		
		Reloj reloj = new Reloj();
		
		reloj.incrementarHora(49);
		reloj.incrementarMinuto(130);
		
		System.out.println(reloj.obtenerHora());
		System.out.println(reloj.obtenerMinuto());
		System.out.println(reloj.obtenerSegundo());
	}

}
