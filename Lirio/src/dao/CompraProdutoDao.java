/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.CompraProduto;
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
public class CompraProdutoDao {

    private Session sessao = HibernateUtil.getSessionFactory().openSession();
    private Transaction trans;
    private List<CompraProduto> listaCP;
    
    public List<CompraProduto> listarCP(String codCompra) {
        if (sessao.isConnected()) {
            sessao.close();
        }
        sessao = HibernateUtil.getSessionFactory().openSession();

        Criteria cri = sessao.createCriteria(Compra.class);
        Criterion _codigo = Restrictions.like("compra", codCompra, MatchMode.ANYWHERE);
        cri.add(_codigo);
        cri.addOrder(Order.asc("compra"));
        this.listaCP = cri.list();
        return this.listaCP;
    }

    public void cadastrarCP(CompraProduto cp) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.save(cp);
            trans.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void excluirCP(CompraProduto cp) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.delete(cp);
            trans.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void alterarCP(CompraProduto cp) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.update(cp);
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
