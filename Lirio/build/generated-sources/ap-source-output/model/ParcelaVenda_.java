package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ParcelaVenda.class)
public abstract class ParcelaVenda_ {

	public static volatile SingularAttribute<ParcelaVenda, Float> preco;
	public static volatile SingularAttribute<ParcelaVenda, String> idStr;
	public static volatile SingularAttribute<ParcelaVenda, Date> dataPagamento;
	public static volatile SingularAttribute<ParcelaVenda, Date> dataVencimento;
	public static volatile SingularAttribute<ParcelaVenda, PagamentoCliente> pagVenda;
	public static volatile SingularAttribute<ParcelaVenda, Integer> id;
	public static volatile SingularAttribute<ParcelaVenda, String> status;

}

