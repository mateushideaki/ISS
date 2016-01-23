/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Reserva;
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
 * @author Danilo
 */
public class ReservaDao {

    private Session sessao = HibernateUtil.getSessionFactory().openSession();
    private Transaction trans;
    private List<Reserva> listaReservas;

    public List<Reserva> listarReservas(String nomeCliente) {
        if (sessao.isConnected()) {
            sessao.close();
        }
        sessao = HibernateUtil.getSessionFactory().openSession();

        Criteria cri = sessao.createCriteria(Reserva.class);
        Criterion _nome = Restrictions.like("clienteNome", nomeCliente, MatchMode.ANYWHERE);
        cri.add(_nome);
        cri.addOrder(Order.asc("id"));
        this.listaReservas = cri.list();
        return this.listaReservas;
    }

    public void cadastrarReserva(Reserva r) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();
            
            sessao.save(r);
            trans.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void excluirReserva(Reserva r) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.update(r);
            trans.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void alterarReserva(Reserva r) {
    try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.update(r);
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}