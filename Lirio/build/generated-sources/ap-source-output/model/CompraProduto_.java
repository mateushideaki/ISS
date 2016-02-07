package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CompraProduto.class)
public abstract class CompraProduto_ {

	public static volatile SingularAttribute<CompraProduto, Compra> compra;
	public static volatile SingularAttribute<CompraProduto, Produto> produto;
	public static volatile SingularAttribute<CompraProduto, Float> custo;
	public static volatile SingularAttribute<CompraProduto, Integer> id;
	public static volatile SingularAttribute<CompraProduto, Integer> quantidade;

}

