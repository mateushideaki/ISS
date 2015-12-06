/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Compra;

/**
 *
 * @author lucas
 */
public class CompraTableModel extends AbstractTableModel{
    private static final int Cod = 0;
    private static final int Fornecedor = 1;
    private static final int Data = 2;
    private static final int Total = 3;

    private List<Compra> lista;


    public CompraTableModel(List<Compra> lista) {
        this.lista = new ArrayList<Compra>(lista);
    }
    
    public void setLista(List<Compra> l){
        this.lista = new ArrayList<Compra>(l);
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
            return "Codigo";
        }
        if (column == Fornecedor) {
            return "Fornecedor";
        }
        if (column == Data) {
            return "Data";
        }
        if (column == Total) {
            return "Total";
        }
        return ""; //Nunca deve ocorrer  
    }

    public Object getValueAt(int row, int column) {
        //Precisamos retornar o valor da coluna column e da linha row.  
        Compra c = lista.get(row);
        if (column == Cod) {
            return c.getId();
        } else if (column == Fornecedor) {
            return c.getFornecedor().getNome();
        } else if (column == Data) {
            return c.getDataCompra();
        } else if (column == Total) {
            return c.getTotal();
        }
        
        return ""; //Nunca deve ocorrer  
    }



    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) { 
        return false;
    }


    public Compra get(int row) {
        return lista.get(row);
    }
}
