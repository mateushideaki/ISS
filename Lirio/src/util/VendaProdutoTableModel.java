/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.VendaProduto;
/**
 *
 * @author Mateus
 */
public class VendaProdutoTableModel extends AbstractTableModel{
     private static final int Cod = 0;
    private static final int Venda = 1;
    private static final int Produto = 2;
    private static final int Quantidade = 3;
    private static final int Custo = 4;

    private List<VendaProduto> lista;


    public VendaProdutoTableModel(List<VendaProduto> lista) {
        this.lista = new ArrayList<VendaProduto>(lista);
    }
    
    public void setLista(List<VendaProduto> l){
        this.lista = new ArrayList<VendaProduto>(l);
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
        if (column == Venda) {
            return "Venda";
        }
        if (column == Produto) {
            return "Produto";
        }
        if (column == Custo) {
            return "Custo";
        }
        return ""; //Nunca deve ocorrer  
    }

    public Object getValueAt(int row, int column) {
        //Precisamos retornar o valor da coluna column e da linha row.  
        VendaProduto vp = lista.get(row);
        if (column == Cod) {
            return vp.getId();
        } else if (column == Venda) {
            return vp.getVenda().getId();
        } else if (column == Produto) {
            return vp.getProduto().getNome();
        } else if (column == Quantidade) {
            return vp.getQuantidade();
        } else if (column == Custo) {
            return vp.getCusto();
        }
        
        return ""; //Nunca deve ocorrer  
    }



    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) { 
        return false;
    }


    public VendaProduto get(int row) {
        return lista.get(row);
    }
}
