package cl.backendjava.clase07.automotora;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Vendedor vendedor = new Vendedor("1111-1", "Vendedor1","Direccion1","correo@mail.com",50000);
		Cliente cliente = new Cliente("1111-1", "Cliente1","Direccion2","correo2@mail.com");
		Vehiculo camion = new Camion(50000);
		Vehiculo automovil = new Automovil(50000);
		Vehiculo motocicleta = new Motocicleta(50000);
		List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		vehiculos.add(motocicleta);
		vehiculos.add(automovil);
		vehiculos.add(camion);
		OrdenCompra ordenCompra = new OrdenCompra(new Date(),vehiculos,cliente,vendedor);
		System.out.println(ordenCompra.calcularTotal());
		
		// Cuando se requiere usar un metodo de una clase en particular
		vehiculos.stream().forEach(v->{
			if(v instanceof Camion) {
				System.out.println("Camion");
				((Camion) v).soltarCarga();
			}
		});
		
		
	}

}
