/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import model.Produto;
import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Danilo
 */
public class ProdutoDao {
    private Session sessao;
    private Transaction trans;
    private List<Produto> listaProdutos;
    
    public List<Produto> listarProdutos(String nomeProduto) {
        if (sessao.isConnected()) {
            sessao.close();
        }
        sessao = HibernateUtil.getSessionFactory().openSession();

        Criteria cri = sessao.createCriteria(Produto.class);
        Criterion _nome = Restrictions.like("nome", nomeProduto, MatchMode.ANYWHERE);
        cri.add(_nome);
        cri.addOrder(Order.asc("nome"));
        this.listaProdutos = cri.list();
        return this.listaProdutos;
    }
    
    public void cadastrarProduto(Produto p){
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();
        
            Produto produto = new Produto();
            produto.setNome(p.getNome());
            produto.setCategoria(p.getCategoria());
            produto.setQntAtual(p.getQntAtual());
            produto.setQntMinima(p.getQntMinima());
            produto.setPrecoCusto(p.getPrecoCusto());
            produto.setPrecoVenda(p.getPrecoVenda());
        
            sessao.save(produto);
            trans.commit();
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void excluirProduto(Produto p){
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();
        
            sessao.delete(p);
            trans.commit();
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void alterarProduto(Produto p) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.update(p);
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
