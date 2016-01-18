/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.util.List;
import model.Cliente;
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
public class ClienteDao {
    private Session sessao = HibernateUtil.getSessionFactory().openSession();
    private Transaction trans;
    private List<Cliente> listaClientes;

    public List<Cliente> listarClientes(String nomeCliente) {
        if (sessao.isConnected()) {
            sessao.close();
        }
        sessao = HibernateUtil.getSessionFactory().openSession();

        Criteria cri = sessao.createCriteria(Cliente.class);
        Criterion _nome = Restrictions.like("nome", nomeCliente, MatchMode.ANYWHERE);
        cri.add(_nome);
        cri.addOrder(Order.asc("nome"));
        this.listaClientes = cri.list();
        return this.listaClientes;
    }

    public void cadastrarCliente(Cliente c) {
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

    public void excluirCliente(Cliente c) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            c.setFlag(0);
            sessao.update(c);
            trans.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void alterarCliente(Cliente c) {
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
