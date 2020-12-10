package servicios;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import modelo.Cabecera;
import modelo.Detalle;
import negocio.Gestion_Detalle;
import negocio.Gestion_Cabecera;

@Path("/facturacion")
public class Facturacion_Service_Rest {

	@Inject
	private Gestion_Detalle gd;
	
	@Inject 
	private Gestion_Cabecera gc;
	
	
	@POST
	@Path("/guardarFactura")
	@Consumes("application/json") //lo que resive para el cliente
	@Produces("application/json")
	public Resultado crearFactura(Datos_Cabecera datos_cabecera) {
		Detalle detalle = new Detalle();
		detalle.setNombre_pelicula(datos_cabecera.getDatos_detalle().getTitulo());
		detalle.setPrecio_final(datos_cabecera.getDatos_detalle().getPrecio());
		detalle.setCantidad(datos_cabecera.getDatos_detalle().getCantidad());
		detalle.setPrecio_unitario(datos_cabecera.getDatos_detalle().getPrecio());
		System.out.println("Llega = "+detalle);
		
		gd.insert(detalle);
		Detalle ultimo_registro= gd.getLastDetalle();
		System.out.println("Ultima  "+ultimo_registro);
		
		Cabecera cabecera = new Cabecera();
		cabecera.setCedula_usuario(datos_cabecera.getCedula());
		cabecera.setNombre_usuario(datos_cabecera.getNombre());
		cabecera.setTelefono_usuario(datos_cabecera.getTelefono());
		cabecera.setDireccion_usuario(datos_cabecera.getDireccion());
		cabecera.setCodigo_detalle(ultimo_registro);
		//System.out.println("Llega info "+cabecera);
		Resultado resultado = new Resultado();
		
		if(gc.insert(cabecera)) {
			resultado.setCodigo(1);
			resultado.setMensaje("Ok");
		}else {
			resultado.setCodigo(0);
			resultado.setMensaje("Error");
		}
		return resultado;


}
}
