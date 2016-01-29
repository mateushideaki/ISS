/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ReservaProdutoDao;
import java.util.List;
import java.util.Objects;
import model.Reserva;
import model.ReservaProduto;

/**
 *
 * @author dANILO
 */
public class ControleReservaProduto {
    private ReservaProduto rp;
    private ReservaProdutoDao reservaProdutoDao = new ReservaProdutoDao();
    private List<ReservaProduto> listaRP;
    
    public List<ReservaProduto> listarRP(Reserva reserva){
        this.listaRP = reservaProdutoDao.listarRP(reserva);
        return this.listaRP;
    }
        
    public void cadastrarRP(List<ReservaProduto> rp){
        reservaProdutoDao.cadastrarRP(rp);
    }
      
    
    public void excluirRP(ReservaProduto rp){
        reservaProdutoDao.excluirRP(rp);
    }
    
    public void alterarRP(ReservaProduto r){
        reservaProdutoDao.alterarRP(r);
        
    }

    public ReservaProduto getRp() {
        return rp;
    }

    public void setRp(ReservaProduto rp) {
        this.rp = rp;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.rp);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ControleReservaProduto other = (ControleReservaProduto) obj;
        if (!Objects.equals(this.rp, other.rp)) {
            return false;
        }
        return true;
    }
}
