package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="factura_cabecera")
public class Cabecera {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "codigo_cabecera")
	private int codigo_cabecera;
	
	@Column(name = "fecha_emision_cabecera")
	private String fecha_emision_cabecera;
	
	@Column(name = "cedula_usuario")
	private String cedula_usuario;
	
	@Column(name = "nombre_usuario")
	private String nombre_usuario;
	
	@Column(name = "telefono_usuario")
	private String telefono_usuario;
	
	@Column(name = "direccion_usuario")
	private String direccion_usuario;
	
	@OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="codigo_detalle", nullable=false)
	private Detalle codigo_detalle;

	public int getCodigo_cabecera() {
		return codigo_cabecera;
	}

	public void setCodigo_cabecera(int codigo_cabecera) {
		this.codigo_cabecera = codigo_cabecera;
	}

	public String getFecha_emision_cabecera() {
		return fecha_emision_cabecera;
	}

	public void setFecha_emision_cabecera(String fecha_emision_cabecera) {
		this.fecha_emision_cabecera = fecha_emision_cabecera;
	}

	public String getCedula_usuario() {
		return cedula_usuario;
	}

	public void setCedula_usuario(String cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getTelefono_usuario() {
		return telefono_usuario;
	}

	public void setTelefono_usuario(String telefono_usuario) {
		this.telefono_usuario = telefono_usuario;
	}

	public String getDireccion_usuario() {
		return direccion_usuario;
	}

	public void setDireccion_usuario(String direccion_usuario) {
		this.direccion_usuario = direccion_usuario;
	}

	public Detalle getCodigo_detalle() {
		return codigo_detalle;
	}

	public void setCodigo_detalle(Detalle codigo_detalle) {
		this.codigo_detalle = codigo_detalle;
	}

	@Override
	public String toString() {
		return "Cabcera [codigo_cabecera=" + codigo_cabecera + ", fecha_emision_cabecera=" + fecha_emision_cabecera
				+ ", cedula_usuario=" + cedula_usuario + ", nombre_usuario=" + nombre_usuario + ", telefono_usuario="
				+ telefono_usuario + ", direccion_usuario=" + direccion_usuario + ", codigo_detalle=" + codigo_detalle
				+ "]";
	}
	
	
	
}
