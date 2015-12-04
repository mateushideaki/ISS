/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Venda;
/**
 *
 * @author Mateus
 */
public class VendaTableModel extends AbstractTableModel{
    private static final int Cod = 0;
    private static final int Cliente = 1;
    private static final int Data = 2;
    private static final int Total = 3;

    private List<Venda> lista;


    public VendaTableModel(List<Venda> lista) {
        this.lista = new ArrayList<Venda>(lista);
    }
    
    public void setLista(List<Venda> l){
        this.lista = new ArrayList<Venda>(l);
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
        if (column == Cliente) {
            return "Cliente";
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
        Venda v = lista.get(row);
        if (column == Cod) {
            return v.getId();
        } else if (column == Cliente) {
            return v.getNomeCliente();
        } else if (column == Data) {
            return v.getDataVenda();
        } else if (column == Total) {
            return v.getTotal();
        }
        
        return ""; //Nunca deve ocorrer  
    }



    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) { 
        return false;
    }


    public Venda get(int row) {
        return lista.get(row);
    }
}
