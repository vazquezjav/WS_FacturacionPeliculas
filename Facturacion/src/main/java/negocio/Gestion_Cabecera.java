package negocio;

import javax.ejb.Stateless;
import javax.inject.Inject;

import datos.CabeceraDAO;
import modelo.Cabecera;

@Stateless
public class Gestion_Cabecera {

	@Inject
	private CabeceraDAO facturaDAO;
	
	public boolean insert(Cabecera cabecera) {
		return facturaDAO.insert(cabecera);
	}
}
