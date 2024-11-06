package cl.backendjava.clase07.automotora;

public class Motocicleta extends Vehiculo implements IVehiculo {
	
	public Motocicleta(Integer precio) {
		super(precio);
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("Enciende mediante boton");
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Acelera desde el volante");
	}

	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		System.out.println("Frena desde el volante");
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("Apaga mediante boton");
		
	}

}
