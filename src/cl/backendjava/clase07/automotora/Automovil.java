package cl.backendjava.clase07.automotora;

public class Automovil extends Vehiculo implements IVehiculo {

	public Automovil(Integer precio) {
		super(precio);
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("Enciende por boton");
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
		System.out.println("Se apaga mediante boton");
	}


}
