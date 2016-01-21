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
import model.Pagamento;
import model.PagamentoCliente;
import model.PagamentoFornecedor;
import model.ParcelaCompra;
import model.ParcelaVenda;

/**
 *
 * @author Mateus
 */
public class ControlePagamento {

    private PagamentoDao pagamentoDao = new PagamentoDao();
    private ParcelaDao parcelaDao = new ParcelaDao();
    private List<PagamentoCliente> listaPagCli;
    private List<PagamentoFornecedor> listaPagFor;

    public List<PagamentoCliente> listarPagamentoCli(String busca) {
        this.listaPagCli = pagamentoDao.listarPagamentosCliente(busca);
        return this.listaPagCli;
    }

    public List<PagamentoFornecedor> listarPagamentoFor(String busca) {
        this.listaPagFor = pagamentoDao.listarPagamentosFornecedor(busca);
        return this.listaPagFor;
    }

    public void cadastrarPagamento(PagamentoFornecedor pag) {
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
    
    

    public void cadastrarPagamento(PagamentoCliente pag) {
        pagamentoDao.cadastrarPagamentoCliente(pag);
        Calendar c, auxC;
        Date d, auxD;
        ParcelaVenda parcela;
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
