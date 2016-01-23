/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import java.util.ListIterator;
import model.Reserva;
import model.ReservaProduto;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;
/**
 *
 * @author Danilo
 */
public class ReservaProdutoDao {
    
    private Session sessao = HibernateUtil.getSessionFactory().openSession();
    private Transaction trans;
    private List<ReservaProduto> listaRP;
    
    public List<ReservaProduto> listarRP(Reserva reserva){
        if(sessao.isConnected()){
            sessao.close();
        }
        
        sessao = HibernateUtil.getSessionFactory().openSession();
        
        Criteria cri = sessao.createCriteria(ReservaProduto.class);
        Criterion _codigo = Restrictions.like("reserva", reserva);
        
        cri.add(_codigo);
        cri.addOrder(Order.asc("produto"));
        this.listaRP = cri.list();
        return this.listaRP;
        
    }
    
    public void cadastrarRP(List<ReservaProduto> rp) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();
            
            ListIterator it = rp.listIterator();
            
            while (it.hasNext()) {
                    ReservaProduto rpIt = (ReservaProduto) it.next();
                    sessao.save(rpIt);
                }
            
            trans.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
            
    public void excluirRP(ReservaProduto rp) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.delete(rp);
            trans.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
        
    public void alterarRP(ReservaProduto rp) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.update(rp);
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
}