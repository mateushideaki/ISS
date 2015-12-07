/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.VendaDao;
import java.util.List;
import java.util.Objects;
import model.Venda;

/**
 *
 * @author Mateus
 */
public class ControleVenda {
    private Venda venda;
    private VendaDao vendaDao = new VendaDao();
    private List<Venda> listaVendas;
    
    public List<Venda> listarVendas(String busca){
        this.listaVendas = vendaDao.listarVendas(busca);
        return this.listaVendas;
    }
    
    public void cadastrarVenda(Venda v){
        vendaDao.cadastrarVenda(v);
    }
    
    public void excluirVenda(Venda v) throws Exception{
        vendaDao.excluirVenda(v);
    }
    
 
    public void alterarVenda(Venda v){
        vendaDao.alterarVenda(v);
        
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.venda);
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
        final ControleVenda other = (ControleVenda) obj;
        if (!Objects.equals(this.venda, other.venda)) {
            return false;
        }
        return true;
    }

    
}
