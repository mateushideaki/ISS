/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Cliente;

/**
 *
 * @author lucas
 */
public class ClienteTableModel extends AbstractTableModel{
    //Terminar ainda
    private static final int Cod = 0;
    private static final int Cliente = 1;
    private static final int RG = 2;
    private static final int Endereço = 3;
    private static final int Tel = 4;
    
    private List<Cliente> lista;

    //Esse é um construtor, que recebe a nossa lista de livros  
    public ClienteTableModel(List<Cliente> lista) {
        this.lista = new ArrayList<Cliente>(lista);
    }
    
    public void setLista(List<Cliente> l){
        this.lista = new ArrayList<Cliente>(l);
    }
    
    public int getRowCount() {
        //Quantas linhas tem sua tabela? Uma para cada item da lista.  
        return lista.size();
    }

    public int getColumnCount() {
        //Quantas colunas tem a tabela? Nesse exemplo, só 2.  
        return 5;
    }

    public String getColumnName(int column) {
        //Qual é o nome das nossas colunas?  
        if (column == Cod) {
            return "Codigo";
        }
        if (column == Cliente) {
            return "Cliente";
        }
        if (column == RG) {
            return "RG";
        }
        if (column == Endereço) {
            return "Endereço";
        }
        if (column == Tel){
            return "Tel";
        }
        return ""; //Nunca deve ocorrer  
    }

    public Object getValueAt(int row, int column) {
        //Precisamos retornar o valor da coluna column e da linha row.  
        Cliente c = lista.get(row);
        if (column == Cod) {
            return c.getId();
        } else if (column == Cliente) {
            return c.getNome();
        }else if (column == RG){
            return c.getRg();
        } else if (column == Tel) {
            return c.getTel();
        } else if (column == Endereço) {
            return c.getEndereco();
        }
        
        return ""; //Nunca deve ocorrer  
    }

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

    public Cliente get(int row) {
        return lista.get(row);
    }
    
}
