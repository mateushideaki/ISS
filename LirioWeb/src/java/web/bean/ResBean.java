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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
    private Reserva reserva = new Reserva();
    private ReservaProduto rr = new ReservaProduto();
    private ProdutoDao pd = new ProdutoDao();
    private Produto p = new Produto();
    private ReservaProduto rp = new ReservaProduto();
    private List<Reserva> listaR = rd.listarReservas("");
    private List<ReservaProduto> listaRP;
    private ArrayList<ReservaProduto> listaReserva = new ArrayList<ReservaProduto>();
    private List<Produto> listaP;
    private int cont;
    private int cont2;
    private int num =0;
    private double total = 0;

    public ResBean(){
        this.listaP = this.pd.listarProdutos("");
        
    }
    
    public ReservaProdutoDao getRpd() {
        return rpd;
    }

    public void setRpd(ReservaProdutoDao rpd) {
        this.rpd = rpd;
    }

    public int getCont2() {
        return cont2;
    }

    public void setCont2(int cont2) {
        this.cont2 = cont2;
    }

    public ReservaDao getRd() {
        return rd;
    }

    public void setRd(ReservaDao rd) {
        this.rd = rd;
    }

    public ReservaProduto getRr() {
        return rr;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setRr(ReservaProduto rr) {
        this.rr = rr;
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

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public List<ReservaProduto> getListaRP() {
        return listaRP;
    }

    public void setListaRP(List<ReservaProduto> listaRP) {
        this.listaRP = listaRP;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public List<Produto> getListaP() {
        return listaP;
    }

    public void addCarrinho() {
        ListIterator listIt = this.listaReserva.listIterator();
        ReservaProduto rpp = new ReservaProduto();
        int posicao = 0;
        if (cont < 1) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Quantidade Tem Que Ser Maior Que 0."));
            
        } else if (p.getQntAtual() < cont) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Quantidade Inserida Maior Que Quantidade Em Estoque."));
            
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info!", "Produto adicionado ao carrinho."));
            rpp.setProduto(p);
            rpp.setReserva(this.reserva);
            rpp.setQuantidade(cont);
            rpp.setPreco(cont * p.getPrecoVenda());
            num++;
            p.setQntAtual(p.getQntAtual() - rpp.getQuantidade());
            while (listIt.hasNext()) {
                posicao++;
                ReservaProduto rpIt = (ReservaProduto) listIt.next();
                if (rpIt.getProduto().getId() == p.getId()) {
                    posicao--;
                    rpp.setQuantidade(rpp.getQuantidade() + rpIt.getQuantidade());
                    rpp.setPreco(rpp.getPreco() + rpIt.getPreco());
                    reserva.setPreco(reserva.getPreco() - rpIt.getPreco());
                    num--;
                    listIt.remove();
                    break;
                }
            }
            this.listaReserva.add(posicao, rpp);
            this.reserva.setPreco(this.reserva.getPreco() + rpp.getPreco());
        }
    }
    
    public void rmvCarrinho() {
        ListIterator listIt = this.listaReserva.listIterator();
        Produto prod = new Produto();
        int posicao = 0;
        if (cont2 < 1) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Quantidade Tem Que Ser Maior Que 0."));
            
        } else if (rr.getQuantidade() < cont2) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Quantidade Inserida Maior Que Quantidade Na Reserva."));
            
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info!", "Quantidade removida do carrinho."));
            prod = rr.getProduto();
            prod.setQntAtual(prod.getQntAtual()+ cont2);
            p.setQntAtual(p.getQntAtual() - rr.getQuantidade());
                    while (listIt.hasNext()) {
                        posicao++;
                        ReservaProduto rpIt = (ReservaProduto) listIt.next();
                        if (rpIt == rr) {
                            posicao--;
                            listIt.remove();
                            break;
                        }
                    }
                    if (cont2 < rr.getQuantidade()) {
                        rr.setQuantidade(rr.getQuantidade() - cont2);
                        rr.setPreco(rr.getPreco() - cont2 * prod.getPrecoVenda());
                        listaReserva.add(posicao, rr);
                        this.reserva.setPreco(this.reserva.getPreco() - prod.getPrecoVenda() * cont2);
                    } else {
                        num--;
                        this.reserva.setPreco(this.reserva.getPreco() - prod.getPrecoVenda() * rr.getQuantidade());
                    }
        }
    }
    
    public String registrarReserva(){
        if(this.reserva.getPreco() <= 0){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Reserva Sem Produtos. A reserva nao sera cadastrada."));
            return null;
        }
        else{
                
                Date d = new Date();
                Calendar cal = new GregorianCalendar();
                cal.setTime(d);
                this.reserva.setDataReserva(d);
                this.rd.cadastrarReserva(this.reserva);
                this.rpd.cadastrarRP(this.listaReserva);
                this.reserva = new Reserva();
                this.listaReserva = new ArrayList<ReservaProduto>();
                return "reserva";
        }
    }
    public void setListaP(List<Produto> listaP) {
        this.listaP = listaP;
    }
    
    public void listarReservas(String nomeCliente) {
        this.listaR = rd.listarReservas(nomeCliente);
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
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
        
        
  
