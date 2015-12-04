/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.VendaProdutoDao;
import java.util.List;
import java.util.Objects;
import model.VendaProduto;

/**
 *
 * @author Mateus
 */
public class ControleVendaProduto {
    private VendaProduto vp;
    private VendaProdutoDao vendaProdutoDao = new VendaProdutoDao();
    private List<VendaProduto> listaVP;
    
    public List<VendaProduto> listarVP(String busca){
        this.listaVP = vendaProdutoDao.listarVP(busca);
        return this.listaVP;
    }
    
    public void cadastrarVP(VendaProduto vp){
        vendaProdutoDao.cadastrarVP(vp);
    }
    
    public void excluirVP(VendaProduto vp){
        vendaProdutoDao.excluirVP(vp);
    }
    
 
    public void alterarVP(VendaProduto v){
        vendaProdutoDao.alterarVP(v);
        
    }

    public VendaProduto getVp() {
        return vp;
    }

    public void setVp(VendaProduto vp) {
        this.vp = vp;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.vp);
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
        final ControleVendaProduto other = (ControleVendaProduto) obj;
        if (!Objects.equals(this.vp, other.vp)) {
            return false;
        }
        return true;
    }

    
}
