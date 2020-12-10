package servicios;

public class Datos_Cabecera {

	private String cedula;
	private String nombre;
	private String telefono;
	private String direccion; 
	private Datos_Detalle datos_detalle;
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Datos_Detalle getDatos_detalle() {
		return datos_detalle;
	}
	public void setDatos_detalle(Datos_Detalle datos_detalle) {
		this.datos_detalle = datos_detalle;
	}
	@Override
	public String toString() {
		return "Datos_Cabecera [cedula=" + cedula + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion="
				+ direccion + ", datos_detalle=" + datos_detalle + "]";
	}
	
	
}
