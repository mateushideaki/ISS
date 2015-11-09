/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.FornecedorDao;
import java.util.List;
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
    
    public void carregarDisciplina(Fornecedor f){
        this.fornecedor = f;
    }
    
    public void alterarFornecedor(){
        fornecedorDao.alterarFornecedor(this.fornecedor);
        this.fornecedor.setCnpj(null);
        this.fornecedor.setEmail(null);
        this.fornecedor.setEnd(null);
        this.fornecedor.setNome(null);
        this.fornecedor.setTel(null);
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    
}
