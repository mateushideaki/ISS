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
import java.util.Objects;

/**
 *
 * @author usuario
 */

@ManagedBean
@SessionScoped
public class ResBean implements Serializable {
    private ReservaDao rd = new ReservaDao();
    private ReservaProdutoDao rpd = new ReservaProdutoDao();
    private Reserva r = new Reserva();
    private ProdutoDao pd = new ProdutoDao();
    private Produto p = new Produto();
    private ReservaProduto rp = new ReservaProduto();
    private List<Reserva> listaR;
    private List<ReservaProduto> listaRP;
    private List<Produto> listaP;

    public ResBean(){
        this.listaP = this.pd.listarProdutos("");
        //this.listaRP = this.rpd.listarRP(r);
        //this.listaR = this.rd.listarReservas("");
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.r);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ResBean other = (ResBean) obj;
        if (!Objects.equals(this.r, other.r)) {
            return false;
        }
        return true;
    }
    
    

}
        
        
  
