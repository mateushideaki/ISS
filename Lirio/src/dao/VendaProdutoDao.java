/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.List;
import java.util.ListIterator;
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

    public List<VendaProduto> listarVP(Venda venda) {
        if (sessao.isConnected()) {
            sessao.close();
        }
        sessao = HibernateUtil.getSessionFactory().openSession();

        Criteria cri = sessao.createCriteria(VendaProduto.class);
        Criterion _codigo = Restrictions.like("venda", venda);
        cri.add(_codigo);
        cri.addOrder(Order.asc("produto"));
        this.listaVP = cri.list();
        return this.listaVP;
    }

    public void cadastrarVP(List<VendaProduto> vp) {
        try {
            if (sessao.isConnected()) {
                sessao.close();
            }
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();
            
            ListIterator it = vp.listIterator();
            
            while (it.hasNext()) {                      //remove o produto da lista
                    VendaProduto vpIt = (VendaProduto) it.next();
                    sessao.save(vpIt);
                }
            
            
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
