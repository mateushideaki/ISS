package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PagamentoCliente.class)
public abstract class PagamentoCliente_ {

	public static volatile SingularAttribute<PagamentoCliente, Float> valorParcela;
	public static volatile SingularAttribute<PagamentoCliente, Cliente> cliente;
	public static volatile SingularAttribute<PagamentoCliente, Venda> venda;
	public static volatile SingularAttribute<PagamentoCliente, Integer> parcelasPagas;
	public static volatile SingularAttribute<PagamentoCliente, Float> valorRestante;
	public static volatile ListAttribute<PagamentoCliente, ParcelaVenda> lpv;
	public static volatile SingularAttribute<PagamentoCliente, Float> valorTotal;
	public static volatile SingularAttribute<PagamentoCliente, Integer> parcelasNaoPagas;
	public static volatile SingularAttribute<PagamentoCliente, Integer> id;
	public static volatile SingularAttribute<PagamentoCliente, String> nomeCliente;
	public static volatile SingularAttribute<PagamentoCliente, Integer> diaVencimento;

}

