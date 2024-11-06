package cl.backendjava.clase07.automotora;

public class Persona {
	
	private String rut;
	private String nombre;
	private String direccion;
	private String correo;
	
	public Persona() {
	}
	
	public Persona(String rut, String nombre, String direccion, String correo) {
		this.rut = rut;
		this.nombre = nombre;
		this.direccion = direccion;
		this.correo = correo;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}