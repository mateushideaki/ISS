package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PagamentoFornecedor.class)
public abstract class PagamentoFornecedor_ {

	public static volatile SingularAttribute<PagamentoFornecedor, Float> valorParcela;
	public static volatile SingularAttribute<PagamentoFornecedor, Compra> compra;
	public static volatile SingularAttribute<PagamentoFornecedor, Integer> parcelasPagas;
	public static volatile SingularAttribute<PagamentoFornecedor, Float> valorRestante;
	public static volatile ListAttribute<PagamentoFornecedor, ParcelaCompra> lpf;
	public static volatile SingularAttribute<PagamentoFornecedor, String> nomeFornecedor;
	public static volatile SingularAttribute<PagamentoFornecedor, Float> valorTotal;
	public static volatile SingularAttribute<PagamentoFornecedor, Integer> parcelasNaoPagas;
	public static volatile SingularAttribute<PagamentoFornecedor, Integer> id;
	public static volatile SingularAttribute<PagamentoFornecedor, Fornecedor> fornecedor;
	public static volatile SingularAttribute<PagamentoFornecedor, Integer> diaVencimento;

}

