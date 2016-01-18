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
public class PagamentoCliente implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Cliente cliente;
    private String nomeCliente;

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
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.cliente);
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
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        return true;
    }
    
    
}
