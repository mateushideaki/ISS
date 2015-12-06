/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import dao.CompraDao;
import java.util.List;
import java.util.Objects;
import model.Compra;
/**
 *
 * @author lucas
 */
public class ControleCompra {
    private Compra compra;
    private CompraDao compraDao = new CompraDao();
    private List<Compra> listaCompras;
    
    public List<Compra> listarCompras(String busca){
        this.listaCompras = compraDao.listarCompras(busca);
        return this.listaCompras;
    }
    
    public void cadastrarCompra(Compra c){
        compraDao.cadastrarCompra(c);
    }
    
    public void excluirCompra(Compra c){
        compraDao.excluirCompra(c);
    }
    
 
    public void alterarCompra(Compra c){
        compraDao.alterarCompra(c);
        
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.compra);
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
        final ControleCompra other = (ControleCompra) obj;
        if (!Objects.equals(this.compra, other.compra)) {
            return false;
        }
        return true;
    }
    
    
}
