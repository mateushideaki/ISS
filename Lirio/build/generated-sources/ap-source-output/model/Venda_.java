package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Venda.class)
public abstract class Venda_ {

	public static volatile SingularAttribute<Venda, Cliente> cliente;
	public static volatile SingularAttribute<Venda, Float> total;
	public static volatile SingularAttribute<Venda, Date> dataVenda;
	public static volatile ListAttribute<Venda, VendaProduto> lvp;
	public static volatile SingularAttribute<Venda, String> clienteNome;
	public static volatile SingularAttribute<Venda, Integer> id;
	public static volatile ListAttribute<Venda, PagamentoCliente> lpc;

}

