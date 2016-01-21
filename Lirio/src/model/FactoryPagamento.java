/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Mateus
 */
public class FactoryPagamento {
    
    public PagamentoFornecedor criarPagamento(Fornecedor fornecedor){
        PagamentoFornecedor pag = new PagamentoFornecedor();
        pag.setFornecedor(fornecedor);
        pag.setNomeFornecedor();
        return pag;
    }
    
    public PagamentoCliente criarPagamento(Cliente cliente){
        PagamentoCliente pag = new PagamentoCliente();
        pag.setCliente(cliente);
        pag.setNomeCliente();
        return pag;
    }
    
    
}
