package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="factura_detalle")
public class Detalle {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "codigo_detalle")
	private int codigo_detalle;
	
	@Column(name = "nombre_pelicula")
	private String nombre_pelicula;
	
	@Column(name = "precio_unitario")
	private double precio_unitario;
	
	@Column(name = "cantidad")
	private int  cantidad;
	
	@Column(name = "precio_final")
	private double precio_final;
	
	
	public int getCodigo_detalle() {
		return codigo_detalle;
	}


	public void setCodigo_detalle(int codigo_detalle) {
		this.codigo_detalle = codigo_detalle;
	}


	public String getNombre_pelicula() {
		return nombre_pelicula;
	}


	public void setNombre_pelicula(String nombre_pelicula) {
		this.nombre_pelicula = nombre_pelicula;
	}


	public double getPrecio_unitario() {
		return precio_unitario;
	}


	public void setPrecio_unitario(double precio_unitario) {
		this.precio_unitario = precio_unitario;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public double getPrecio_final() {
		return precio_final;
	}


	public void setPrecio_final(double precio_final) {
		this.precio_final = precio_final;
	}


	@Override
	public String toString() {
		return "Detalle [codigo_detalle=" + codigo_detalle + ", nombre_pelicula=" + nombre_pelicula
				+ ", precio_unitario=" + precio_unitario + ", cantidad=" + cantidad + ", precio_final=" + precio_final
				+ "]";
	}
	
	
	
}
