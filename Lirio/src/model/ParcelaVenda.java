/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Mateus
 */
@Entity
public class ParcelaVenda implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private float preco;
    private Date dataVencimento;
    private Date dataPagamento;
    private String nome;
    private String status;
    @ManyToOne
    private PagamentoCliente pagVenda;
    
    public ParcelaVenda(){
        this.status = "Pendente";
    }
    
    public PagamentoCliente getPagVenda() {
        return pagVenda;
    }

    public void setPagVenda(PagamentoCliente pagVenda) {
        this.pagVenda = pagVenda;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    
    public String getStatus() {
        return status;
    }

    public String pagarParcela() {
        if(this.status.equals("Pendente")){
            Calendar c = Calendar.getInstance();
            this.dataPagamento = c.getTime();
            this.dataPagamento.setTime(id);
            this.status = "Pago";
            return "sucesso";
        }
        return "falha";
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.id;
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
        final ParcelaVenda other = (ParcelaVenda) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}