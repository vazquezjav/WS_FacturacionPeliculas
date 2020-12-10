package negocio;

import javax.ejb.Stateless;
import javax.inject.Inject;

import datos.DetalleDAO;
import modelo.Detalle;


@Stateless
public class Gestion_Detalle {

	@Inject
	private DetalleDAO detalleDAO;
	
	public void insert(Detalle detalle) {
		detalleDAO.insert(detalle);
	}
	public Detalle getLastDetalle() {
		return detalleDAO.getLastDetalle();
	}
}
