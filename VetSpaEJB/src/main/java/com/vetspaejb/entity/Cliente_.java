package com.vetspaejb.entity;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-06-10T16:23:36.314-0500")
@StaticMetamodel(Cliente.class)
public class Cliente_ {
	public static volatile SingularAttribute<Cliente, Integer> id;
	public static volatile SingularAttribute<Cliente, String> dni;
	public static volatile SingularAttribute<Cliente, String> nombre;
	public static volatile SingularAttribute<Cliente, String> nombreSeg;
	public static volatile SingularAttribute<Cliente, String> apellidoPat;
	public static volatile SingularAttribute<Cliente, String> apellidoMat;
	public static volatile SingularAttribute<Cliente, Date> fechaNac;
	public static volatile SingularAttribute<Cliente, Integer> sexo;
	public static volatile SingularAttribute<Cliente, String> celular;
	public static volatile SingularAttribute<Cliente, String> direccion;
	public static volatile SingularAttribute<Cliente, Distrito> distrito;
}
