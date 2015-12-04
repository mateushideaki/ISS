/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.List;
import model.Venda;
import model.VendaProduto;
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
public class VendaProdutoDao {
    private Session sessao = HibernateUtil.getSessionFactory().openSession();
    private Transaction trans;
    private List<VendaProduto> listaVP;

    public List<VendaProduto> listarVP(String codVenda) {
        if (sessao.isConnected()) {
            sessao.close();
        }
        sessao = HibernateUtil.getSessionFactory().openSession();

        Criteria cri = sessao.createCriteria(Venda.class);
        Criterion _codigo = Restrictions.like("venda", codVenda, MatchMode.ANYWHERE);
        cri.add(_codigo);
        cri.addOrder(Order.asc("venda"));
        this.listaVP = cri.list();
        return this.listaVP;
    }

    public void cadastrarVP(VendaProduto vp) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.save(vp);
            trans.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void excluirVP(VendaProduto vp) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.delete(vp);
            trans.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void alterarVP(VendaProduto vp) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.update(vp);
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
