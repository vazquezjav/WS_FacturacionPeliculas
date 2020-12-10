package datos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Detalle;

@Stateless
public class DetalleDAO {

	@Inject
	private EntityManager em;
	
	public void insert(Detalle detalle) {
		em.persist(detalle);
	}
	
	public Detalle getLastDetalle() {
		String jpql = "SELECT d FROM Detalle d ORDER BY d.codigo_detalle DESC";
		Query q = em.createQuery(jpql, Detalle.class);
		List<Detalle> cuentas =q.getResultList();
		Detalle d =cuentas.get(0);
		return d;
	}
}
