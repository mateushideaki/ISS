/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.FornecedorProduto;
/**
 *
 * @author Mateus
 */
public class FornecedorProdutoTableModel extends AbstractTableModel{
    private static final int CodFornecedor = 0;
    private static final int Fornecedor = 1;
    private static final int Produto = 2;
    private static final int PrecoCompra = 3;

    private List<FornecedorProduto> lista;


    public FornecedorProdutoTableModel(List<FornecedorProduto> lista) {
        this.lista = new ArrayList<FornecedorProduto>(lista);
    }
    
    public void setLista(List<FornecedorProduto> l){
        this.lista = new ArrayList<FornecedorProduto>(l);
    }
    
    public int getRowCount() {
        return lista.size();
    }

    public int getColumnCount() {
        return 4;
    }

    public String getColumnName(int column) {
        //Qual é o nome das nossas colunas?  
        if (column == CodFornecedor) {
            return "CodigoFornecedor";
        }
        if (column == Fornecedor) {
            return "Fornecedor";
        }
        if (column == Produto) {
            return "Produto";
        }
        if (column == PrecoCompra) {
            return "PrecoCompra";
        }
        return ""; //Nunca deve ocorrer  
    }

    public Object getValueAt(int row, int column) {
        //Precisamos retornar o valor da coluna column e da linha row.  
        FornecedorProduto f = lista.get(row);
        if (column == CodFornecedor) {
            return f.getFornecedor().getId();
        } else if (column == Fornecedor) {
            return f.getNomeFornecedor();
        } else if (column == Produto) {
            return f.getNomeProduto();
        } else if (column == PrecoCompra) {
            return f.getPreco();
        }
        
        return ""; //Nunca deve ocorrer  
    }



    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) { 
        return false;
    }


    public FornecedorProduto get(int row) {
        return lista.get(row);
    }
}
