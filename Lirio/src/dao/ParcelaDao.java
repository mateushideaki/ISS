/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.ParcelaCompra;
import model.ParcelaVenda;
import model.Venda;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

/**
 *
 * @author Mateus
 */
public class ParcelaDao {
    private Session sessao = HibernateUtil.getSessionFactory().openSession();
    private Transaction trans;
    private List<ParcelaVenda> listaParcelasVenda;
    private List<ParcelaCompra> listaParcelasCompra;

    public List<ParcelaVenda> listarParcelasCliente(String nomeCliente) {
        if (sessao.isConnected()) {
            sessao.close();
        }
        sessao = HibernateUtil.getSessionFactory().openSession();

        Criteria cri = sessao.createCriteria(ParcelaVenda.class);
        Criterion _nome = Restrictions.like("clienteNome", nomeCliente, MatchMode.ANYWHERE);
        cri.add(_nome);
        cri.addOrder(Order.asc("id"));
        this.listaParcelasVenda = cri.list();
        return this.listaParcelasVenda;
    }
    
    public List<ParcelaCompra> listarParcelasFornecedor(String nomeFornecedor) {
        if (sessao.isConnected()) {
            sessao.close();
        }
        sessao = HibernateUtil.getSessionFactory().openSession();

        Criteria cri = sessao.createCriteria(ParcelaCompra.class);
        Criterion _nome = Restrictions.like("nome", nomeFornecedor, MatchMode.ANYWHERE);
        cri.add(_nome);
        cri.addOrder(Order.asc("id"));
        this.listaParcelasCompra = cri.list();
        return this.listaParcelasCompra;
    }

    public void cadastrarParcela(ParcelaVenda p) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.save(p);
            trans.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void cadastrarParcela(ParcelaCompra p) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.save(p);
            trans.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void excluirParcela(ParcelaVenda p) throws Exception{
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.delete(p);
            trans.commit();

        } catch (Exception e) {
            throw(e);
        }
    }
    
    public void excluirParcela(ParcelaCompra p) throws Exception{
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.delete(p);
            trans.commit();

        } catch (Exception e) {
            throw(e);
        }
    }
    
    public void alterarParcela(ParcelaVenda p) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.update(p);
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void alterarParcela(ParcelaCompra p) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.update(p);
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
