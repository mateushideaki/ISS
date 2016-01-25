/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



/**
 *
 * @author Mateus
 */
@Entity
public class PagamentoFornecedor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Fornecedor fornecedor;
    private String nomeFornecedor;
    private Compra compra;
    private int parcelasPagas;
    private int parcelasNaoPagas;
    private float valorTotal;
    private float valorParcela;
    private float valorRestante;
    private int diaVencimento;
    
    
    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
    
    public String pagarParcela(){
        if(parcelasNaoPagas > 0){
            this.parcelasPagas++;
            this.parcelasNaoPagas--;
            this.valorRestante = this.valorRestante - this.valorParcela;
            return "sucesso";
        }
        else{
            return "falha";
        }
    }

    public int getParcelasPagas() {
        return parcelasPagas;
    }

    public void setParcelasPagas(int parcelasPagas) {
        this.parcelasPagas = parcelasPagas;
    }

    public int getParcelasNaoPagas() {
        return parcelasNaoPagas;
    }

    public void setParcelasNaoPagas(int parcelasNaoPagas) {
        this.parcelasNaoPagas = parcelasNaoPagas;
    }

    public float getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(float valorParcela) {
        this.valorParcela = valorParcela;
    }

    public float getValorRestante() {
        return valorRestante;
    }

    public void setValorRestante(float valorRestante) {
        this.valorRestante = valorRestante;
    }

    public int getDiaVencimento() {
        return diaVencimento;
    }

    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }
    
    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor() {
        this.nomeFornecedor = fornecedor.getNome();
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
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
        final PagamentoFornecedor other = (PagamentoFornecedor) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    
    
}
