package cl.backendjava.clase07.ejemploAbstraccion;

public class Reloj {
	private long segundosTotales;
	
	public int obtenerHora() {
		return (int) (segundosTotales / 3600);
	}
	
	public int obtenerMinuto() {
		int restoMinutos = (int) (this.segundosTotales - obtenerHora() * 3600);
		return restoMinutos / 60;
	}
	
	public int obtenerSegundo() {
		int restoMinutos = (int) (this.segundosTotales - obtenerHora() * 3600);
		return restoMinutos - 60 * obtenerMinuto();
	}

}
