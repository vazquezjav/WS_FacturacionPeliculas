package datos;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Cabecera;

@Stateless
public class CabeceraDAO {
	@Inject
	private EntityManager em;
	
	public boolean insert(Cabecera cabecera) {
		java.util.Date fecha = new java.util.Date();
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		cabecera.setFecha_emision_cabecera(sdf.format(fecha));
		System.out.println("Llega info guarda "+cabecera.getCedula_usuario());
		
		boolean inserta=false;
		try {
			em.persist(cabecera);
			inserta= true;
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		return inserta;
	}
}
