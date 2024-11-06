package cl.backendjava.clase07.automotora;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdenCompra {
	
	private Date fecha;
	private List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	private Cliente cliente;
	private Vendedor vendedor;
	
	public OrdenCompra() {
	}
	
	public OrdenCompra(Date fecha, List<Vehiculo> vehiculos, Cliente cliente, Vendedor vendedor) {
		super();
		this.fecha = fecha;
		this.vehiculos = vehiculos;
		this.cliente = cliente;
		this.vendedor = vendedor;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	public Integer calcularTotal() {
		return vehiculos.stream()
				.mapToInt(v->v.getPrecio())
				.sum();
	}
	
}
