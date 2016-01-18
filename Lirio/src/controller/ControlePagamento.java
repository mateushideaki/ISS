/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.PagamentoDao;
import java.util.List;
import model.Pagamento;
import model.PagamentoCliente;
import model.PagamentoFornecedor;



/**
 *
 * @author Mateus
 */
public class ControlePagamento {
    private PagamentoDao pagamentoDao = new PagamentoDao();
    private List<PagamentoCliente> listaPagCli;
    private List<PagamentoFornecedor> listaPagFor;
    
    public List<PagamentoCliente> listarPagamentoCli(String busca){
        this.listaPagCli = pagamentoDao.listarPagamentosCliente(busca);
        return this.listaPagCli;
    }
    
    public List<PagamentoFornecedor> listarPagamentoFor(String busca){
        this.listaPagFor = pagamentoDao.listarPagamentosFornecedor(busca);
        return this.listaPagFor;
    }
    
    public void cadastrarPagamento(PagamentoFornecedor pag){
        pagamentoDao.cadastrarPagamentoFornecedor(pag);
    }
    
    public void cadastrarPagamento(PagamentoCliente pag){
        pagamentoDao.cadastrarPagamentoCliente(pag);
    }
    
    public void excluirPagamento(PagamentoFornecedor pag) throws Exception{
        pagamentoDao.excluirPagamentoFornecedor(pag);
    }
    
    public void excluirPagamento(PagamentoCliente pag) throws Exception{
        pagamentoDao.excluirPagamentoCliente(pag);
    }
    
 
    public void alterarPagamento(PagamentoCliente pag){
        pagamentoDao.alterarPagamentoCliente(pag);
    }
    
    public void alterarPagamento(PagamentoFornecedor pag){
        pagamentoDao.alterarPagamentoFornecedor(pag);
    } 
}

