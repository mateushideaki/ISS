/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.ReservaProduto;

/**
 *
 * @author Danilo
 */

public class ReservaProdutoTableModel extends AbstractTableModel{
    private static final int Cod = 0;
    private static final int Produto = 1;
    private static final int Quantidade = 2;
    private static final int Preco = 3;

    private List<ReservaProduto> lista;
    
    
    public ReservaProdutoTableModel(List<ReservaProduto> lista) {
        this.lista = new ArrayList<ReservaProduto>(lista);
    }
    
    public void setLista(List<ReservaProduto> l){
        this.lista = new ArrayList<ReservaProduto>(l);
    }
    
    public int getRowCount() {
        return lista.size();
    }

    public int getColumnCount() {
        return 4;
    }
    
    public String getColumnName(int column) {
        if (column == Cod) {
            return "IDProduto";
        }
        if (column == Produto) {
            return "Produto";
        }
        if (column == Quantidade) {
            return "Quantidade";
        }
        if (column == Preco) {
            return "Preco";
        }
        return ""; 
    }
    
    public Object getValueAt(int row, int column) {
        ReservaProduto rp = lista.get(row);
        if (column == Cod) {
            return rp.getProduto().getId();
        } else if (column == Produto) {
            return rp.getProduto().getNome();
        } else if (column == Quantidade) {
            return rp.getQuantidade();
        } else if (column == Preco) {
            return rp.getPreco();
        }
        
        return ""; //Nunca deve ocorrer  
    }
    
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) { 
        return false;
    }


    public ReservaProduto get(int row) {
        return lista.get(row);
    }
    
}

