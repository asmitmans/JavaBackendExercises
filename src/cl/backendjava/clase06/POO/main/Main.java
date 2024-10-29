package cl.backendjava.clase06.POO.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cl.backendjava.clase06.POO.model.Calculadora;
import cl.backendjava.clase06.POO.model.Persona;
import cl.backendjava.clase06.POO.model.Producto;

public class Main {

	public static void main(String[] args) {
		
		// Ejemplo uso de la clase persona
		//Persona juan = new Persona("111111-1", "Juan", "Perez", "jp@mail.com","La Calle 123" );
		//System.out.println(juan);
		
			
		entregaBoleta(ingresoProductos());
		
		// Ejercicio Calculadora
		/*
		Calculadora cal = new Calculadora();
		System.out.println(cal.suma(5.5, 5.5));
		System.out.println(cal.resta(5.5, 5.5));
		System.out.println(cal.multiplicar(5.5, 5.5));
		System.out.println(cal.dividir(1000, 4));
		System.out.println(cal.potencia(5.5, 2));
		*/
		
		
				
	}
	
	public static List<Producto> ingresoProductos() {
		List<Producto> productos = new ArrayList<Producto>();
		Scanner sc = new Scanner(System.in);
		
		String respuesta = "";
		do {
			System.out.println("Ingresa el nombre del producto: ");
			String nombreProducto = sc.nextLine();
			System.out.println("Ingresa el precio del producto: ");
			String precioProducto = sc.nextLine();
			System.out.println("Ingresa la cantidad del producto: ");
			String cantidadProducto = sc.nextLine();
			
			Producto producto = new Producto(nombreProducto, Integer.parseInt(precioProducto), Integer.parseInt(cantidadProducto));
			productos.add(producto);
			
			System.out.println("Desea ingresar mas productos: ");
			respuesta = sc.nextLine();
			
			
		} while (respuesta.equals("Si"));
				
		return productos;
	}
	
	
	public static void entregaBoleta(List<Producto> productos) {
		
		productos.stream().forEach((producto)-> {
			System.out.println(String.format("%s %d %d",
					producto.getNombreProducto(),
					producto.getPrecioProducto(),
					producto.getCantidadProducto()));
		});
		
		Integer total = productos.stream()
				.mapToInt(p->p.getPrecioProducto()*p.getCantidadProducto())
				.sum();
			System.out.println("Total : " + total);
	}
	
	

}
