package cl.backendjava.clase06.POO.model;

public class Persona {
	
	private String rut;
	private String nombre;
	private String apellido;
	private String correo;
	private String direccion;
	
	public Persona() {
	}

	public Persona(String rut, String nombre, String apellido, String correo, String direccion) {
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.direccion = direccion;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona [rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo
				+ ", direccion=" + direccion + "]";
	}
	
	
}
