package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ReservaProduto.class)
public abstract class ReservaProduto_ {

	public static volatile SingularAttribute<ReservaProduto, Float> preco;
	public static volatile SingularAttribute<ReservaProduto, Produto> produto;
	public static volatile SingularAttribute<ReservaProduto, Integer> id;
	public static volatile SingularAttribute<ReservaProduto, Reserva> reserva;
	public static volatile SingularAttribute<ReservaProduto, Integer> quantidade;

}

