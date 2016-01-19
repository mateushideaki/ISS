/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import dao.ConfirmarCompraDao;
import java.util.List;
import java.util.Objects;
import model.ConfirmarCompra;
/**
 *
 * @author lucas
 */
public class ControleConfirmarCompra {
    private ConfirmarCompra compra;
    private ConfirmarCompraDao confirmarCompraDao = new ConfirmarCompraDao();
    private List<ConfirmarCompra> listaCompras;
    
    public List<ConfirmarCompra> listarCompras(String busca){
        this.listaCompras = confirmarCompraDao.listarCompras(busca);
        return this.listaCompras;
    }
    
    public void cadastrarCompra(ConfirmarCompra c){
        confirmarCompraDao.cadastrarCompra(c);
    }
    
    public void excluirCompra(ConfirmarCompra c){
        confirmarCompraDao.excluirCompra(c);
    }
    
 
    public void alterarCompra(ConfirmarCompra c){
        confirmarCompraDao.alterarCompra(c);
        
    }

    public ConfirmarCompra getCompra() {
        return compra;
    }

    public void setCompra(ConfirmarCompra compra) {
        this.compra = compra;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.compra);
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
        final ControleConfirmarCompra other = (ControleConfirmarCompra) obj;
        if (!Objects.equals(this.compra, other.compra)) {
            return false;
        }
        return true;
    }

    
    
    
}
