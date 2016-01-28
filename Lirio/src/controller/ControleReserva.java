/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ReservaDao;
import java.util.List;
import java.util.Objects;
import model.Reserva;
/**
 *
 * @author Danilo
 */
public class ControleReserva {
    private Reserva reserva;
    private ReservaDao reservaDao = new ReservaDao();
    private List<Reserva> listaReservas;
    
    public List<Reserva> listarReservas(String busca){
        this.listaReservas = reservaDao.listarReservas(busca);
        return this.listaReservas;
    }
    
    public void cadastrarReserva(Reserva r){
        reservaDao.cadastrarReserva(r);
    }
    
    public void excluirReserva(Reserva r){
        reservaDao.excluirReserva(r);
    }
    
 
    public void alterarReserva(Reserva r){
        reservaDao.alterarReserva(r);
        
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.reserva);
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
        final ControleReserva other = (ControleReserva) obj;
        if (!Objects.equals(this.reserva, other.reserva)) {
            return false;
        }
        return true;
    }
    
    
}
