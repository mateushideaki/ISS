/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.FornecedorDao;
import java.util.List;
import java.util.Objects;
import model.Fornecedor;

/**
 *
 * @author Mateus
 */
public class ControleFornecedor {
    private Fornecedor fornecedor = new Fornecedor();
    private FornecedorDao fornecedorDao = new FornecedorDao();
    private List<Fornecedor> listaFornecedores;
    
    public List<Fornecedor> listarFornecedores(String busca){
        this.listaFornecedores = fornecedorDao.listarFornecedores(busca);
        return this.listaFornecedores;
    }
    
    public void cadastrarFornecedor(Fornecedor f){
        fornecedorDao.cadastrarFornecedor(f);
    }
    
    public void excluirFornecedor(Fornecedor f){
        fornecedorDao.excluirFornecedor(f);
    }
    
    public void carregarFornecedor(Fornecedor f) {
        this.fornecedor = f;
    }
    
    public void alterarFornecedor(Fornecedor f){
        fornecedorDao.alterarFornecedor(f);
        
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.fornecedor);
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
        final ControleFornecedor other = (ControleFornecedor) obj;
        if (!Objects.equals(this.fornecedor, other.fornecedor)) {
            return false;
        }
        return true;
    }

    
}
