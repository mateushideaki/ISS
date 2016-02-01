/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import web.model.ClienteWeb;
import web.util.HibernateUtil;
/**
 *
 * @author lucas
 */
public class ClienteWebDao {
    private Session sessao;
    private Transaction trans;
    
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
            
            cw.setFlag("0");
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
