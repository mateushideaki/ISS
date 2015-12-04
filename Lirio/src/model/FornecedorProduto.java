/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import java.util.Objects;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
/**
 *
 * @author Mateus
 */
@Entity
//Esta classe e intermediaria entre produto e fornecedor, para que seja possivel cadastrar 
//produtos iguais para fornecedores diferentes, com preços diferentes.
public class FornecedorProduto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(name = "fornecedor_id", referencedColumnName="id")
    private Fornecedor fornecedor;
    @ManyToOne
    @JoinColumn(name = "produto_id", referencedColumnName="id")
    private Produto produto;
    private String nomeProduto;
    private String nomeFornecedor;
    private float preco;

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor f) {
        this.fornecedor = f;
        this.nomeFornecedor = f.getNome();
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto p) {
        this.produto = p;
        this.nomeProduto = p.getNome();
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    
    
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.id;
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
        final FornecedorProduto other = (FornecedorProduto) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}
