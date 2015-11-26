/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Fornecedor;

/**
 *
 * @author Mateus
 */
public class FornecedorTableModel extends AbstractTableModel{

    private static final int Cod = 0;
    private static final int Fornecedor = 1;
    private static final int Tel = 2;
    private static final int Endereço = 3;

    private List<Fornecedor> lista;


    public FornecedorTableModel(List<Fornecedor> lista) {
        this.lista = new ArrayList<Fornecedor>(lista);
    }
    
    public void setLista(List<Fornecedor> l){
        this.lista = new ArrayList<Fornecedor>(l);
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
        if (column == Tel) {
            return "Tel";
        }
        if (column == Endereço) {
            return "Endereço";
        }
        return ""; //Nunca deve ocorrer  
    }

    public Object getValueAt(int row, int column) {
        //Precisamos retornar o valor da coluna column e da linha row.  
        Fornecedor f = lista.get(row);
        if (column == Cod) {
            return f.getId();
        } else if (column == Fornecedor) {
            return f.getNome();
        } else if (column == Tel) {
            return f.getTel();
        } else if (column == Endereço) {
            return f.getEnd();
        }
        
        return ""; //Nunca deve ocorrer  
    }



    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) { 
        return false;
    }


    public Fornecedor get(int row) {
        return lista.get(row);
    }
}

