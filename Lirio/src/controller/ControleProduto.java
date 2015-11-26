/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProdutoDao;
import java.util.List;
import java.util.Objects;
import model.Produto;

/**
 *
 * @author Danilo
 */
public class ControleProduto {
    private Produto produto = new Produto();
    private ProdutoDao produtoDao = new ProdutoDao();
    private List<Produto> listaProdutos;

     public List<Produto> listarProdutos(String busca){
        this.listaProdutos = produtoDao.listarProdutos(busca);
        return this.listaProdutos;
    }
     
    public void cadastrarProduto(Produto p){
        produtoDao.cadastrarProduto(p);
    }
    
    public void excluirProduto(Produto p){
        produtoDao.excluirProduto(p);
    }
    
    public void alterarProduto(Produto p){
        produtoDao.alterarProduto(p);
    }
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.produto);
        return hash;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ControleProduto other = (ControleProduto) obj;
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        return true;
    }   
}