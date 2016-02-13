/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.bean;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import model.Reserva;
import model.ReservaProduto;
import model.Produto;
import dao.ProdutoDao;
import dao.ReservaProdutoDao;
import dao.ReservaDao;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import util.ReservaProdutoTableModel;


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
    private List<Reserva> listaR = rd.listarReservas("");
    private List<ReservaProduto> listaRP;
    private ArrayList<ReservaProduto> listaReserva = new ArrayList<ReservaProduto>();
    private List<Produto> listaP;
    private int contador = 0;

    public ResBean(){
        this.listaP = this.pd.listarProdutos("");
        //this.listaRP = this.rpd.listarRP(r);
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

    public String addCarrinho() {
        ListIterator listIt = this.listaReserva.listIterator();
        int posicao = 0;
        if (contador < 0) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error!", "Quantidade Tem Que Ser Maior Que 0."));
            return "fail";
        } else if (p.getQntAtual() < contador) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error!", "Quantidade Inserida Maior Que Quantidade Em Estoque."));
            return "fail";
        } else {
            rp.setProduto(p);
            rp.setReserva(this.r);
            rp.setQuantidade(contador);
            rp.setPreco(contador * p.getPrecoVenda());
            p.setQntAtual(p.getQntAtual() - rp.getQuantidade());
            while (listIt.hasNext()) {
                posicao++;
                ReservaProduto rpIt = (ReservaProduto) listIt.next();
                if (rpIt.getProduto().getId() == p.getId()) {
                    posicao--;
                    rp.setQuantidade(rp.getQuantidade() + rpIt.getQuantidade());
                    rp.setPreco(rp.getPreco() + rpIt.getPreco());
                    r.setPreco(r.getPreco() - rpIt.getPreco());
                    listIt.remove();
                    break;
                }
            }
            this.listaReserva.add(posicao, rp);
            this.r.setPreco(this.r.getPreco() + rp.getPreco());
            this.contador = 0;
            return "sucess";
        }
    }
    public void setListaP(List<Produto> listaP) {
        this.listaP = listaP;
    }
    
    public void listarReservas(String nomeCliente) {
        this.listaR = rd.listarReservas(nomeCliente);
    }
    
    public String excluirReserva(){
        rd.excluirReserva(r);
        this.r = null;
        return null;
     }

    public ArrayList<ReservaProduto> getListaReserva() {
        return listaReserva;
    }

    public void setListaReserva(ArrayList<ReservaProduto> listaReserva) {
        this.listaReserva = listaReserva;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
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
        
        
  
