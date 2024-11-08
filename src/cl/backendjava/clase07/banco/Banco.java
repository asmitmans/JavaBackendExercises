package cl.backendjava.clase07.banco;

import java.util.HashMap;
import java.util.Map;

public class Banco {
	
	private Map<String, Cliente> clientes = new HashMap<>();
	private Map<Integer, Cuenta> cuentas = new HashMap<>();
	
	public void crearClientes() {
		
		// Crear clientes
		clientes.put("11111111-1", new Cliente("Juan Perez", "11111111-1"));
		clientes.put("22222222-2", new Cliente("Antonia Gonzales", "22222222-2"));
		
		// crear cuentas
		cuentas.put(1, new CuentaAhorro(1,1000));
		cuentas.put(2, new CuentaCorriente(2,2000));
		
		// asocio las cuentas a clientes
		clientes.get("11111111-1").getCuentas().add(cuentas.get(1));
		clientes.get("22222222-2").getCuentas().add(cuentas.get(2));
						
	}
	
	public void simular() {
		
		Cliente clienteOrigen = clientes.get("11111111-1");
		Cliente clienteDestino = clientes.get("22222222-2");

		if (clienteOrigen != null && !clienteOrigen.getCuentas().isEmpty() &&
		    clienteDestino != null && !clienteDestino.getCuentas().isEmpty()) {
		    
		    clienteOrigen.getCuentas().get(0).transferir(100, clienteDestino.getCuentas().get(0));
		} else {
		    System.out.println("Error: Verifique que los clientes y sus cuentas existan.");
		}
		
	}
	
	public void mostrarInfo() {
		cuentas.values().stream().forEach(System.out::println);
	}
	
	

}
