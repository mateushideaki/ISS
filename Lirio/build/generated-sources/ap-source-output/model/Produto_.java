package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Produto.class)
public abstract class Produto_ {

	public static volatile SingularAttribute<Produto, Float> precoVenda;
	public static volatile SingularAttribute<Produto, String> categoria;
	public static volatile SingularAttribute<Produto, Integer> qntAtual;
	public static volatile SingularAttribute<Produto, String> nome;
	public static volatile SingularAttribute<Produto, Integer> id;
	public static volatile SingularAttribute<Produto, Integer> qntMinima;

}

