/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.FornecedorProdutoDao;
import java.util.List;
import java.util.Objects;
import model.FornecedorProduto;

/**
 *
 * @author Mateus
 */
public class ControleFornecedorProduto {
    private FornecedorProduto fp;
    private FornecedorProdutoDao fpDao = new FornecedorProdutoDao();
    private List<FornecedorProduto> listaFP;
    
    public List<FornecedorProduto> listarFP(String busca){
        this.listaFP = fpDao.listar(busca);
        return this.listaFP;
    }
    
    public List<FornecedorProduto> listar2FP(String busca,String busca2){
        this.listaFP = fpDao.listar2(busca,busca2);
        return this.listaFP;
    }
    
    public void cadastrarFP(FornecedorProduto fp){
        fpDao.cadastrar(fp);
    }
    
    public void alterarFP(FornecedorProduto fp){
        fpDao.alterarFP(fp);
    }
    
    public void excluirFP(FornecedorProduto fp){
        fpDao.excluir(fp);
    }

    public FornecedorProduto getFp() {
        return fp;
    }

    public void setFp(FornecedorProduto fp) {
        this.fp = fp;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.fp);
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
        final ControleFornecedorProduto other = (ControleFornecedorProduto) obj;
        if (!Objects.equals(this.fp, other.fp)) {
            return false;
        }
        return true;
    }

     
    

}
