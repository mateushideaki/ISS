/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.CompraProduto;

/**
 *
 * @author lucas
 */
public class CompraProdutoTableModel extends AbstractTableModel{
    private static final int Cod = 0;
    private static final int Produto = 1;
    private static final int Quantidade = 2;
    private static final int Custo = 3;

    private List<CompraProduto> lista;
    
    
    public CompraProdutoTableModel(List<CompraProduto> lista) {
        this.lista = new ArrayList<CompraProduto>(lista);
    }
    
    public void setLista(List<CompraProduto> l){
        this.lista = new ArrayList<CompraProduto>(l);
    }
    
    public int getRowCount() {
        return lista.size();
    }

    public int getColumnCount() {
        return 4;
    }
    
    public String getColumnName(int column) {
        //Qual é o nome das nossas colunas?  
        if (column == Cod) {
            return "IDProduto";
        }
        if (column == Produto) {
            return "Produto";
        }
        if (column == Quantidade) {
            return "Quantidade";
        }
        if (column == Custo) {
            return "Custo";
        }
        return ""; //Nunca deve ocorrer  
    }
    
    public Object getValueAt(int row, int column) {
        //Precisamos retornar o valor da coluna column e da linha row.  
        CompraProduto cp = lista.get(row);
        if (column == Cod) {
            return cp.getProduto().getId();
        } else if (column == Produto) {
            return cp.getProduto().getNome();
        } else if (column == Quantidade) {
            return cp.getQuantidade();
        } else if (column == Custo) {
            return cp.getCusto();
        }
        
        return ""; //Nunca deve ocorrer  
    }
    
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) { 
        return false;
    }


    public CompraProduto get(int row) {
        return lista.get(row);
    }
    
}
