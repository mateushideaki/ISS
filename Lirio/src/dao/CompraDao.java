/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Compra;
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
 * @author lucas
 */
public class CompraDao {

    private Session sessao = HibernateUtil.getSessionFactory().openSession();
    private Transaction trans;
    private List<Compra> listaCompras;

    public List<Compra> listarCompras(String nomeFornecedor) {
        if (sessao.isConnected()) {
            sessao.close();
        }
        sessao = HibernateUtil.getSessionFactory().openSession();

        Criteria cri = sessao.createCriteria(Compra.class);
        Criterion _nome = Restrictions.like("fornecedorNome", nomeFornecedor, MatchMode.ANYWHERE);
        Criterion _flag = Restrictions.like("flag", "1" ,MatchMode.ANYWHERE);
        cri.add(_nome);
        cri.add(_flag);
        cri.addOrder(Order.asc("id"));
        this.listaCompras = cri.list();
        return this.listaCompras;
    }

    public void cadastrarCompra(Compra c) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();
            
            sessao.save(c);
            trans.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void excluirCompra(Compra c) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            c.setFlag("0");
            sessao.update(c);
            trans.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void alterarCompra(Compra c) {
    try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.update(c);
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
