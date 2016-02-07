package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(VendaProduto.class)
public abstract class VendaProduto_ {

	public static volatile SingularAttribute<VendaProduto, Venda> venda;
	public static volatile SingularAttribute<VendaProduto, Produto> produto;
	public static volatile SingularAttribute<VendaProduto, Float> custo;
	public static volatile SingularAttribute<VendaProduto, Integer> id;
	public static volatile SingularAttribute<VendaProduto, Integer> quantidade;

}

