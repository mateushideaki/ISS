/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Produto;

/**
 *
 * @author lucas
 */
public class ProdutosConfirmadosTableModel extends AbstractTableModel{
    
    private static final int Cod = 0;
    private static final int Produto = 1;
    private static final int QuantidadeAtual = 2;
    private static final int QuantidadeMinima = 3;
    
    private List<Produto> lista;
    
    public ProdutosConfirmadosTableModel(List<Produto> lista) {
        this.lista = new ArrayList<Produto>(lista);
    }
    
    public void setLista(List<Produto> l){
        this.lista = new ArrayList<Produto>(l);
    }
    
    public int getRowCount() {
        return lista.size();
    }

    public int getColumnCount() {
        return 4;
    }
    
    public String getColumnName(int column) {
        if (column == Cod) {
            return "Codigo";
        }
        if (column == Produto) {
            return "Produto";
        }
        if (column == QuantidadeAtual) {
            return "QuantidadeAtual";
        }
        if (column == QuantidadeMinima) {
            return "QuantidadeMinima";
        }  
        return "";
    }
    
    public Object getValueAt(int row, int column) {
        Produto p = lista.get(row);
        if (column == Cod) {
            return p.getId();
        } else if (column == Produto) {
            return p.getNome();
        } else if (column == QuantidadeAtual) {
            return p.getQntAtual();
        } else if (column == QuantidadeMinima) {
            return p.getQntMinima();
        }
        return ""; //Nunca deve ocorrer
        }
        
    public Class<?> getColumnClass(int columnIndex) {  
        return String.class;
    }
    
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    public Produto get(int row) {
        return lista.get(row);
    }
}