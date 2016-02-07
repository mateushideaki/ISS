package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ParcelaCompra.class)
public abstract class ParcelaCompra_ {

	public static volatile SingularAttribute<ParcelaCompra, Float> preco;
	public static volatile SingularAttribute<ParcelaCompra, String> idStr;
	public static volatile SingularAttribute<ParcelaCompra, Date> dataPagamento;
	public static volatile SingularAttribute<ParcelaCompra, Date> dataVencimento;
	public static volatile SingularAttribute<ParcelaCompra, Integer> id;
	public static volatile SingularAttribute<ParcelaCompra, PagamentoFornecedor> pagCompra;
	public static volatile SingularAttribute<ParcelaCompra, String> status;

}

