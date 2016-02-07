package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FornecedorProduto.class)
public abstract class FornecedorProduto_ {

	public static volatile SingularAttribute<FornecedorProduto, Float> preco;
	public static volatile SingularAttribute<FornecedorProduto, Produto> produto;
	public static volatile SingularAttribute<FornecedorProduto, String> nomeFornecedor;
	public static volatile SingularAttribute<FornecedorProduto, Integer> id;
	public static volatile SingularAttribute<FornecedorProduto, Fornecedor> fornecedor;
	public static volatile SingularAttribute<FornecedorProduto, String> nomeProduto;

}

