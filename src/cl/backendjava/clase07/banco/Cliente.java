package cl.backendjava.clase07.banco;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String nombre;
	private String rut;
	private List<Cuenta> cuentas = new ArrayList<>();
	
	public Cliente() {
	}
	
	public Cliente(String nombre, String rut, List<Cuenta> cuentas) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.cuentas = cuentas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	
		
}
