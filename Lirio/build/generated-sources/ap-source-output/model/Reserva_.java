package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Reserva.class)
public abstract class Reserva_ {

	public static volatile SingularAttribute<Reserva, Float> preco;
	public static volatile SingularAttribute<Reserva, Cliente> cliente;
	public static volatile SingularAttribute<Reserva, Date> dataReserva;
	public static volatile SingularAttribute<Reserva, Integer> id;
	public static volatile ListAttribute<Reserva, ReservaProduto> lrp;
	public static volatile SingularAttribute<Reserva, String> nomeCliente;

}

