package cl.backendjava.clase07.ejemploEncapsulacion;

public class Reloj {
	private int hora;
	private int minuto;
	private int segundo;
	
	public int obtenerHora() {
		return hora;
	}
	
	public int obtenerMinuto() {
		return minuto;
	}
	
	public int obtenerSegundo() {
		return segundo;
	}
	
	public void incrementarHora(int incremento) {
		this.hora += incremento % 24;
	}
	
	public void incrementarMinuto(int incremento) {
		if (incremento >= 60) {
			int horasDeIncremento = incremento / 60;
			this.incrementarHora(horasDeIncremento);
			
			incremento -= 60 * horasDeIncremento;
		}
		
		this.minuto += incremento;
	}
}
