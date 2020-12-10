package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Detalle.class)
public abstract class Detalle_ {

	public static volatile SingularAttribute<Detalle, String> nombre_pelicula;
	public static volatile SingularAttribute<Detalle, Double> precio_unitario;
	public static volatile SingularAttribute<Detalle, Integer> codigo_detalle;
	public static volatile SingularAttribute<Detalle, Double> precio_final;
	public static volatile SingularAttribute<Detalle, Integer> cantidad;

}

