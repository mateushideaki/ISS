/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
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
public class VendaDao {
    private Session sessao = HibernateUtil.getSessionFactory().openSession();
    private Transaction trans;
    private List<Venda> listaVendas;

    public List<Venda> listarVendas(String nomeCliente) {
        if (sessao.isConnected()) {
            sessao.close();
        }
        sessao = HibernateUtil.getSessionFactory().openSession();

        Criteria cri = sessao.createCriteria(Venda.class);
        Criterion _nome = Restrictions.like("clienteNome", nomeCliente, MatchMode.ANYWHERE);
        cri.add(_nome);
        cri.addOrder(Order.asc("id"));
        this.listaVendas = cri.list();
        return this.listaVendas;
    }

    public void cadastrarVenda(Venda v) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.save(v);
            trans.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void excluirVenda(Venda v) throws Exception{
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.delete(v);
            trans.commit();

        } catch (Exception e) {
            throw(e);
        }
    }

    public void alterarVenda(Venda v) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.update(v);
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
