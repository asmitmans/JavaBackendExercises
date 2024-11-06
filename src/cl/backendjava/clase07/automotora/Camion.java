package cl.backendjava.clase07.automotora;

public class Camion extends Vehiculo implements IVehiculo {

	public Camion(Integer precio) {
		super(precio);
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("Enciende por llave");
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Acelera mediante pedal");
		
	}

	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		System.out.println("Frena mediante pedal");
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("Apaga mediante llave");
	}
	
	public void soltarCarga() {
		System.out.println("Suelta la carga");
	}

}
