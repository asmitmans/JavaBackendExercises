package cl.backendjava.clase06.POO.model;

public class Producto {
	
	private String nombreProducto;
	private Integer precioProducto;
	private Integer cantidadProducto;
		
	public Producto() {
	}
	
	public Producto(String nombreProducto, Integer precioProducto, Integer cantidadProducto) {
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
		this.cantidadProducto = cantidadProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public Integer getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(Integer precioProducto) {
		this.precioProducto = precioProducto;
	}
	public Integer getCantidadProducto() {
		return cantidadProducto;
	}
	public void setCantidadProducto(Integer cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	
	@Override
	public String toString() {
		return "Producto [nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto
				+ ", cantidadProducto=" + cantidadProducto + "]";
	}
	

}
