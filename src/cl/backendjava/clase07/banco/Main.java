package cl.backendjava.clase07.banco;

public class Main {
	
	public static void main(String[] args) {
		Banco banco = new Banco();
		
		// crear clientes y las cuentas
		banco.crearClientes();
		
		// Monstrar info antes de la simulacion
		System.out.println("Informacion antes de la simulacion");
		banco.mostrarInfo();
		
		// Simular transacciones
		banco.simular();
		
		// Monstrar info antes de la simulacion
		System.out.println("Informacion después de la simulacion");
		banco.mostrarInfo();
		
	}

}
