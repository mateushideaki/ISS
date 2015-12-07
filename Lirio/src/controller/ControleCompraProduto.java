/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CompraProdutoDao;
import java.util.List;
import java.util.Objects;
import model.CompraProduto;

/**
 *
 * @author lucas
 */
public class ControleCompraProduto {
    private CompraProduto cp;
    private CompraProdutoDao compraProdutoDao = new CompraProdutoDao();
    private List<CompraProduto> listaCP;
    
    public List<CompraProduto> listarCP(String busca){
        this.listaCP = compraProdutoDao.listarCP(busca);
        return this.listaCP;
    }
    
    public void cadastrarCP(List<CompraProduto> cp){
        compraProdutoDao.cadastrarCP(cp);
    }
      
    
    public void excluirCP(CompraProduto cp){
        compraProdutoDao.excluirCP(cp);
    }
    
    public void alterarCP(CompraProduto c){
        compraProdutoDao.alterarCP(c);
        
    }

    public CompraProduto getCp() {
        return cp;
    }

    public void setCp(CompraProduto cp) {
        this.cp = cp;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.cp);
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
        final ControleCompraProduto other = (ControleCompraProduto) obj;
        if (!Objects.equals(this.cp, other.cp)) {
            return false;
        }
        return true;
    }
    
    
}
