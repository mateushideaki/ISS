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

    //Esse é um construtor, que recebe a nossa lista de livros  
    public FornecedorTableModel(List<Fornecedor> lista) {
        this.lista = new ArrayList<Fornecedor>(lista);
    }

    public int getRowCount() {
        //Quantas linhas tem sua tabela? Uma para cada item da lista.  
        return lista.size();
    }

    public int getColumnCount() {
        //Quantas colunas tem a tabela? Nesse exemplo, só 2.  
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

    /*public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Fornecedor titulo = lista.get(rowIndex);
        //Vamos alterar o valor da coluna columnIndex na linha rowIndex com o valor aValue passado no parâmetro.  
        //Note que vc poderia alterar 2 campos ao invés de um só.  
        if (columnIndex == COL_TITULO) {
            titulo.setTitulo(aValue.toString());
        } else if (columnIndex == COL_AUTOR) {
            titulo.getAutor().setNome(aValue.toString());
        }
    }*/

    public Class<?> getColumnClass(int columnIndex) {
        //Qual a classe das nossas colunas? Como estamos exibindo texto, é string.  
        return String.class;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //Indicamos se a célula da rowIndex e da columnIndex é editável. Nossa tabela toda é.  
        return false;
    }
    //Já que esse tableModel é de livros, vamos fazer um get que retorne um livro inteiro.  
    //Isso elimina a necessidade de chamar o getValueAt() nas telas.   

    public Fornecedor get(int row) {
        return lista.get(row);
    }
}

