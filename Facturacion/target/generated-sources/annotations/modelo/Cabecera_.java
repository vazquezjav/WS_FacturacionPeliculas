package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cabecera.class)
public abstract class Cabecera_ {

	public static volatile SingularAttribute<Cabecera, Integer> codigo_cabecera;
	public static volatile SingularAttribute<Cabecera, String> fecha_emision_cabecera;
	public static volatile SingularAttribute<Cabecera, Detalle> codigo_detalle;
	public static volatile SingularAttribute<Cabecera, String> cedula_usuario;
	public static volatile SingularAttribute<Cabecera, String> direccion_usuario;
	public static volatile SingularAttribute<Cabecera, String> nombre_usuario;
	public static volatile SingularAttribute<Cabecera, String> telefono_usuario;

}

