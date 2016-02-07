/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package web.dao;
import java.util.List;
import model.Cliente;
import org.hibernate.Session;
import org.hibernate.Transaction;
import web.model.ClienteWeb;
import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import web.util.HibernateUtil;
/**
 *
 * @author lucas
 */
public class ClienteWebDao {
    private Session sessao= util.HibernateUtil.getSessionFactory().openSession();
    private Transaction trans;
    private List<ClienteWeb> listaClientes;
    private List<Cliente> listaCpf;
    
    public List<ClienteWeb> verificarConta(String login, String senha) {
        if (sessao.isConnected()) {
            sessao.close();
        }
        sessao = HibernateUtil.getSessionFactory().openSession();

        Criteria cri = sessao.createCriteria(ClienteWeb.class);
        Criterion _nome = Restrictions.like("login", login, MatchMode.ANYWHERE);
        Criterion _senha = Restrictions.like("senha", senha ,MatchMode.ANYWHERE);
        cri.add(_nome);
        cri.add(_senha);
        cri.addOrder(Order.asc("login"));
        this.listaClientes = cri.list();
        return this.listaClientes;
    }
    
    public List<ClienteWeb> verificarCpf(String login) {
        if (sessao.isConnected()) {
            sessao.close();
        }
        sessao = HibernateUtil.getSessionFactory().openSession();

        Criteria cri = sessao.createCriteria(ClienteWeb.class);
        Criterion _login = Restrictions.like("login", login, MatchMode.ANYWHERE);
        cri.add(_login);
        cri.addOrder(Order.asc("login"));
        this.listaClientes = cri.list();
        return this.listaClientes;
    }
    
    public void cadastrarClienteWeb(ClienteWeb cw){
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.save(cw);
            trans.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void removerClienteWeb(ClienteWeb cw){
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();
            
            sessao.update(cw);
            trans.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void alterarClienteWeb(ClienteWeb cw){
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();
            
            sessao.update(cw);
            trans.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
