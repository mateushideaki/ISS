package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Compra.class)
public abstract class Compra_ {

	public static volatile SingularAttribute<Compra, Float> total;
	public static volatile SingularAttribute<Compra, String> flag;
	public static volatile SingularAttribute<Compra, String> fornecedorNome;
	public static volatile ListAttribute<Compra, CompraProduto> lcp;
	public static volatile SingularAttribute<Compra, Integer> id;
	public static volatile SingularAttribute<Compra, Fornecedor> fornecedor;
	public static volatile SingularAttribute<Compra, Date> dataRecebimento;
	public static volatile SingularAttribute<Compra, Date> dataCompra;

}

