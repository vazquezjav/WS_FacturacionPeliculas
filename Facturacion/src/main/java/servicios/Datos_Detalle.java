package servicios;

public class Datos_Detalle {

	
	private int cantidad;
	private String titulo;
	private double precio;
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Datos_Detalle [cantidad=" + cantidad + ", titulo=" + titulo + ", precio=" + precio + "]";
	}
	
	
}
