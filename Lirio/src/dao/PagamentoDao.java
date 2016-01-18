/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Fornecedor;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;
import model.PagamentoCliente;
import model.PagamentoFornecedor;
import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author Mateus
 */
public class PagamentoDao {
    private Session sessao = HibernateUtil.getSessionFactory().openSession();
    private Transaction trans;
    private List<PagamentoCliente> listaPagCli;
    private List<PagamentoFornecedor> listaPagFor;

    public List<PagamentoFornecedor> listarPagamentosFornecedor(String nomeFornecedor) {
        if (sessao.isConnected()) {
            sessao.close();
        }
        sessao = HibernateUtil.getSessionFactory().openSession();

        Criteria cri = sessao.createCriteria(PagamentoFornecedor.class);
        Criterion _nome = Restrictions.like("fornecedorNome", nomeFornecedor, MatchMode.ANYWHERE);
        cri.add(_nome);
        cri.addOrder(Order.asc("id"));
        this.listaPagFor = cri.list();
        return this.listaPagFor;
    }
    
    public List<PagamentoCliente> listarPagamentosCliente(String nomeCliente) {
        if (sessao.isConnected()) {
            sessao.close();
        }
        sessao = HibernateUtil.getSessionFactory().openSession();

        Criteria cri = sessao.createCriteria(PagamentoCliente.class);
        Criterion _nome = Restrictions.like("clienteNome", nomeCliente, MatchMode.ANYWHERE);
        cri.add(_nome);
        cri.addOrder(Order.asc("id"));
        this.listaPagCli = cri.list();
        return this.listaPagCli;
    }

    public void cadastrarPagamentoFornecedor(PagamentoFornecedor pag) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();
            
            sessao.save(pag);
            trans.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void cadastrarPagamentoCliente(PagamentoCliente pag) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();
            
            sessao.save(pag);
            trans.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void excluirPagamentoFornecedor(PagamentoFornecedor pag) throws Exception{
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.delete(pag);
            trans.commit();

        } catch (Exception e) {
            throw(e);
        }
    }
    
    public void excluirPagamentoCliente(PagamentoCliente pag) throws Exception{
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.delete(pag);
            trans.commit();

        } catch (Exception e) {
            throw(e);
        }
    }

    public void alterarPagamentoFornecedor(PagamentoFornecedor pag) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.update(pag);
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void alterarPagamentoCliente(PagamentoCliente pag) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.update(pag);
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

