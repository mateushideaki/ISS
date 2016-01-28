/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Mateus
 */
@Entity
public class PagamentoCliente implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int parcelasPagas;
    private int parcelasNaoPagas;
    private float valorTotal;
    private float valorParcela;
    private float valorRestante;
    private int diaVencimento;
    private String nomeCliente;
    @ManyToOne
    private Cliente cliente;
    @OneToOne
    private Venda venda;
    
    @OneToMany(mappedBy = "pagVenda", cascade = CascadeType.REMOVE)
    private List<ParcelaVenda> lpv;

    public List<ParcelaVenda> getLpv() {
        return lpv;
    }

    public void setLpv(List<ParcelaVenda> lpv) {
        this.lpv = lpv;
    }
    
    
    
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
    
    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente() {
        this.nomeCliente = cliente.getNome();
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.id;
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
        final PagamentoCliente other = (PagamentoCliente) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    
    
    
}
