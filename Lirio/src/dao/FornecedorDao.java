/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.util.List;
import model.Fornecedor;
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
public class FornecedorDao {
    private Session sessao = HibernateUtil.getSessionFactory().openSession();
    private Transaction trans;
    private List<Fornecedor> listaFornecedores;
    
    public List<Fornecedor> listarFornecedores(String nomeFornecedor) {
        if (sessao.isConnected()) {
            sessao.close();
        }
        sessao = HibernateUtil.getSessionFactory().openSession();
        trans = sessao.beginTransaction();
        
        Criteria cri = sessao.createCriteria(Fornecedor.class);
        Criterion _nome = Restrictions.like("nome", nomeFornecedor, MatchMode.ANYWHERE);
        cri.add(_nome);
        cri.addOrder(Order.asc("nome"));
        this.listaFornecedores = cri.list();
        return this.listaFornecedores;
    }

    public void cadastrarFornecedor(Fornecedor f) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();
            sessao.save(f);
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();   
        }
    }

    public void excluirFornecedor(Fornecedor f) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.delete(f);
            trans.commit();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void alterarFornecedor(Fornecedor f) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.update(f);
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
