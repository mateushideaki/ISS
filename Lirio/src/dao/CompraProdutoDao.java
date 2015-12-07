/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import java.util.ListIterator;
import model.Compra;
import model.CompraProduto;


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
    
    public List<CompraProduto> listarCP(Compra compra){
        if(sessao.isConnected()){
            sessao.close();
        }
        
        sessao = HibernateUtil.getSessionFactory().openSession();
        
        Criteria cri = sessao.createCriteria(CompraProduto.class);
        Criterion _codigo = Restrictions.like("compra", compra);
        
        cri.add(_codigo);
        cri.addOrder(Order.asc("produto"));
        this.listaCP = cri.list();
        return this.listaCP;
        
    }
    
    public void cadastrarCP(List<CompraProduto> cp) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();
            
            ListIterator it = cp.listIterator();
            
            while (it.hasNext()) {                      //remove o produto da lista
                    CompraProduto cpIt = (CompraProduto) it.next();
                    sessao.save(cpIt);
                }
            
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