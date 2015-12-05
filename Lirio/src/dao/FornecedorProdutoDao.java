/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Fornecedor;
import model.FornecedorProduto;
import model.Produto;
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
public class FornecedorProdutoDao {
    private Session sessao = HibernateUtil.getSessionFactory().openSession();
    private Transaction trans;
    private List<FornecedorProduto> lista;
    private List<FornecedorProduto> lista2;
    
    public List<FornecedorProduto> listar(String nomeFornecedor) {
        if (sessao.isConnected()) {
            sessao.close();
        }
        sessao = HibernateUtil.getSessionFactory().openSession();

        Criteria cri = sessao.createCriteria(FornecedorProduto.class);
        Criterion _nome = Restrictions.like("nomeFornecedor", nomeFornecedor, MatchMode.ANYWHERE);
        cri.add(_nome);
        cri.addOrder(Order.asc("nomeFornecedor"));
        this.lista = cri.list();
        return this.lista;
    }
    
    public List<FornecedorProduto> listar2(String nomeFornecedor, String nomeProduto) {
        if (sessao.isConnected()) {
            sessao.close();
        }
        sessao = HibernateUtil.getSessionFactory().openSession();

        Criteria cri = sessao.createCriteria(FornecedorProduto.class);
        Criterion _nomeFor = Restrictions.like("nomeFornecedor", nomeFornecedor, MatchMode.ANYWHERE);
        cri.add(_nomeFor);
        cri.addOrder(Order.asc("nomeFornecedor"));
        Criteria cri2 = sessao.createCriteria(Produto.class);
        Criterion _nomeProd = Restrictions.like("nomeProduto", nomeProduto, MatchMode.ANYWHERE);
        cri.add(_nomeProd);
        cri.addOrder(Order.asc("nomeProduto"));
        this.lista2 = cri.list();
        return this.lista2;
    }

    public void cadastrar(FornecedorProduto fp) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.save(fp);
            trans.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void alterarFP(FornecedorProduto fp) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.update(fp);
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void excluir(FornecedorProduto fp) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.delete(fp);
            trans.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
