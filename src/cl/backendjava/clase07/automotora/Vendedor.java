package cl.backendjava.clase07.automotora;

public class Vendedor extends Persona {
	
	private Integer sueldo;
	
	public Vendedor() {
		super();
	}
	
	public Vendedor(String rut, String nombre, String direccion, String correo, Integer sueldo) {
		super(rut, nombre, direccion, correo);
		this.sueldo = sueldo;
	}

	public Integer getSueldo() {
		return sueldo;
	}

	public void setSueldo(Integer sueldo) {
		this.sueldo = sueldo;
	}

}
