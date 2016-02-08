/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.bean;

import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Reserva;
import model.ReservaProduto;
import model.Produto;
import dao.ProdutoDao;
import dao.ReservaProdutoDao;
import dao.ReservaDao;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author usuario
 */
@Named(value = "resBean")
@ManagedBean
@SessionScoped
public class ResBean implements Serializable {
    private ReservaDao rd = new ReservaDao();
    private ReservaProdutoDao rpd = new ReservaProdutoDao();
    private Reserva r = new Reserva();
    private ProdutoDao pd = new ProdutoDao();
    private Produto p = new Produto();
    private ReservaProduto rp = new ReservaProduto();
    private List<Reserva> listaR= rd.listarReservas("");
    private List<ReservaProduto> listaRP= rpd.listarRP(r);
    private List<Produto> listaP = pd.listarProdutos("");

    public ResBean(){
    }
    
    public ReservaProdutoDao getRpd() {
        return rpd;
    }

    public void setRpd(ReservaProdutoDao rpd) {
        this.rpd = rpd;
    }

    public ReservaDao getRd() {
        return rd;
    }

    public void setRd(ReservaDao rd) {
        this.rd = rd;
    }

    public Reserva getR() {
        return r;
    }

    public void setR(Reserva r) {
        this.r = r;
    }

    public ProdutoDao getPd() {
        return pd;
    }

    public void setPd(ProdutoDao pd) {
        this.pd = pd;
    }

    public Produto getP() {
        return p;
    }

    public void setP(Produto p) {
        this.p = p;
    }

    public ReservaProduto getRp() {
        return rp;
    }

    public void setRp(ReservaProduto rp) {
        this.rp = rp;
    }

    public List<Reserva> getListaR() {
        return listaR;
    }

    public void setListaR(List<Reserva> listaR) {
        this.listaR = listaR;
    }

    public List<ReservaProduto> getListaRP() {
        return listaRP;
    }

    public void setListaRP(List<ReservaProduto> listaRP) {
        this.listaRP = listaRP;
    }

    public List<Produto> getListaP() {
        return listaP;
    }

    public void setListaP(List<Produto> listaP) {
        this.listaP = listaP;
    }

}
        
        
  
