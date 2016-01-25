/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.PagamentoDao;
import dao.ParcelaDao;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import model.Cliente;
import model.Compra;
import model.FactoryPagamento;
import model.Fornecedor;
import model.Pagamento;
import model.PagamentoCliente;
import model.PagamentoFornecedor;
import model.ParcelaCompra;
import model.ParcelaVenda;
import model.Venda;

/**
 *
 * @author Mateus
 */
public class ControlePagamento {

    private PagamentoDao pagamentoDao = new PagamentoDao();
    private ParcelaDao parcelaDao = new ParcelaDao();
    private List<PagamentoCliente> listaPagCli;
    private List<PagamentoFornecedor> listaPagFor;
    private List<ParcelaVenda> listaParcelaVenda;
    private List<ParcelaCompra> listaParcelaCompra;

    public List<PagamentoCliente> listarPagamentoCli(String busca) {
        this.listaPagCli = pagamentoDao.listarPagamentosCliente(busca);
        return this.listaPagCli;
    }
   
    public List<PagamentoFornecedor> listarPagamentoFor(String busca) {
        this.listaPagFor = pagamentoDao.listarPagamentosFornecedor(busca);
        return this.listaPagFor;
    }
    
    public List<ParcelaVenda> listarParcelaVenda(String busca) {
        this.listaParcelaVenda = parcelaDao.listarParcelasCliente(busca);
        return this.listaParcelaVenda;
    }
    
    public List<ParcelaCompra> listarParcelaCompra(String busca) {
        this.listaParcelaCompra = parcelaDao.listarParcelasFornecedor(busca);
        return this.listaParcelaCompra;
    }
    
    public String pagarParcela(ParcelaVenda parcela){
        if(parcela.pagarParcela().equals("sucesso")){
            return parcela.getPagVenda().pagarParcela();
        } else {
            return "parcelaPaga";
        }
    }
    
    public void pagamentoAVista(Venda venda, Cliente cli, float valorTotal){
        PagamentoCliente pag = new PagamentoCliente();
        pag.setVenda(venda);
        pag.setCliente(cli);
        pag.setNomeCliente();
        pag.setDiaVencimento(0);
        pag.setParcelasNaoPagas(0);
        pag.setParcelasPagas(1);
        pag.setValorTotal(valorTotal);
        pag.setValorRestante(0);
        pag.setValorParcela(valorTotal);
        pagamentoDao.cadastrarPagamentoCliente(pag);
    }
    
    public void pagamentoAVista(Compra compra, Fornecedor forn, float valorTotal){
        PagamentoFornecedor pag = new PagamentoFornecedor();
        pag.setCompra(compra); 
        pag.setFornecedor(forn);
        pag.setNomeFornecedor();
        pag.setDiaVencimento(0);
        pag.setParcelasNaoPagas(0);
        pag.setParcelasPagas(1);
        pag.setValorTotal(valorTotal);
        pag.setValorRestante(0);
        pag.setValorParcela(valorTotal);
        pagamentoDao.cadastrarPagamentoFornecedor(pag);
    }
    
    public void cadastrarPagamento(Compra compra, Fornecedor fornecedor, int diaV, int numP, float valorP, float valorT) {
        FactoryPagamento facPag = new FactoryPagamento();
        PagamentoFornecedor pag = facPag.criarPagamento(fornecedor);
        pag.setCompra(compra);
        pag.setDiaVencimento(diaV);
        pag.setParcelasNaoPagas(numP);
        pag.setValorParcela(valorP);
        pag.setValorTotal(valorT);
        pag.setValorRestante(valorT);
        pagamentoDao.cadastrarPagamentoFornecedor(pag);
        Calendar c, auxC;
        Date d, auxD;
        ParcelaCompra parcela;
        int dia, mes, ano;

        auxC = Calendar.getInstance();
        c = Calendar.getInstance();
        auxD = auxC.getTime();
        dia = pag.getDiaVencimento();
        if (dia < auxD.getDay()) {
            mes = auxD.getMonth();
            ano = auxD.getYear();
        } else if (auxD.getMonth() < 12) {
            mes = auxD.getMonth() + 1;
            ano = auxD.getYear();
        } else {
            mes = 1;
            ano = auxD.getYear() + 1;
        }

        for (int i = 1; i <= pag.getParcelasNaoPagas(); i++) {
            parcela = new ParcelaCompra();
            c.set(ano, mes, dia);
            d = c.getTime();
            parcela.setDataVencimento(d);
            parcela.setNome(pag.getNomeFornecedor());
            parcela.setPagCompra(pag);
            parcela.setPreco(pag.getValorParcela());
            parcelaDao.cadastrarParcela(parcela);
            if (d.getMonth() < 12) {
                mes = d.getMonth() + 1;
                ano = d.getYear();
            } else {
                mes = 1;
                ano = d.getYear() + 1;
            }
        }
    }
    
    

    public void cadastrarPagamento(Venda venda, Cliente cliente, int diaV, int numP, float valorP, float valorT) {
        FactoryPagamento facPag = new FactoryPagamento();
        PagamentoCliente pag = facPag.criarPagamento(cliente);
        pag.setVenda(venda);
        pag.setDiaVencimento(diaV);
        pag.setParcelasNaoPagas(numP);
        pag.setValorParcela(valorP);
        pag.setValorTotal(valorT);
        pag.setValorRestante(valorT);
        pagamentoDao.cadastrarPagamentoCliente(pag);
        Calendar c, auxC;
        Date d, auxD;
        ParcelaVenda parcela;
        int dia, mes, ano;

        auxC = Calendar.getInstance();
        c = Calendar.getInstance();
        auxD = auxC.getTime();
        System.out.println(auxD.getYear());
        dia = pag.getDiaVencimento();
        if (dia < auxD.getDay()) {
            mes = auxD.getMonth();
            ano = auxD.getYear();
        } else if (auxD.getMonth() < 12) {
            mes = auxD.getMonth() + 1;
            ano = auxD.getYear();
        } else {
            mes = 1;
            ano = auxD.getYear() + 1;
        }

        for (int i = 1; i <= pag.getParcelasNaoPagas(); i++) {
            parcela = new ParcelaVenda();
            c.set(ano, mes, dia);
            d = c.getTime();
            parcela.setDataVencimento(d);
            parcela.setNome(pag.getNomeCliente());
            parcela.setPagVenda(pag);
            parcela.setPreco(pag.getValorParcela());
            parcelaDao.cadastrarParcela(parcela);
            if (d.getMonth() < 12) {
                mes = d.getMonth() + 1;
                ano = d.getYear();
            } else {
                mes = 1;
                ano = d.getYear() + 1;
            }
        }
    }

    public void excluirPagamento(PagamentoFornecedor pag) throws Exception {
        pagamentoDao.excluirPagamentoFornecedor(pag);
    }

    public void excluirPagamento(PagamentoCliente pag) throws Exception {
        pagamentoDao.excluirPagamentoCliente(pag);
    }

    public void alterarPagamento(PagamentoCliente pag) {
        pagamentoDao.alterarPagamentoCliente(pag);
    }

    public void alterarPagamento(PagamentoFornecedor pag) {
        pagamentoDao.alterarPagamentoFornecedor(pag);
    }
    
}
