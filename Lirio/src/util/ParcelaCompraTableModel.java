/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.ParcelaCompra;
/**
 *
 * @author Mateus
 */
public class ParcelaCompraTableModel extends AbstractTableModel{
    private static final int id = 0;
    private static final int CodCli = 1;
    private static final int NomeCli = 2;
    private static final int ParcelasPagas = 3;
    private static final int ParcelasNaoPagas = 3;
    private static final int ValorRestante = 4;

    private List<ParcelaCompra> lista;


    public ParcelaCompraTableModel(List<ParcelaCompra> lista) {
        this.lista = new ArrayList<ParcelaCompra>(lista);
    }
    
    public void setLista(List<ParcelaCompra> l){
        this.lista = new ArrayList<ParcelaCompra>(l);
    }
    
    public int getRowCount() {
        return lista.size();
    }

    public int getColumnCount() {
        return 4;
    }

    public String getColumnName(int column) {
        //Qual é o nome das nossas colunas?  
        if (column == id) {
            return "Id";
        }
        if (column == CodCli) {
            return "Valor";
        }
        if (column == NomeCli) {
            return "Data_Venc";
        }
        if (column == ParcelasPagas) {
            return "Data_Pagamento";
        }
        if (column == ParcelasNaoPagas) {
            return "Status";
        }
        
        return ""; //Nunca deve ocorrer  
    }

    public Object getValueAt(int row, int column) {
        //Precisamos retornar o valor da coluna column e da linha row.  
        ParcelaCompra v = lista.get(row);
        if (column == id) {
            return v.getId();
        } else if (column == CodCli) {
            return v.getPreco();
        } else if (column == NomeCli) {
            return v.getDataVencimento();
        } else if (column == ParcelasPagas) {
            return v.getDataPagamento();
        } else if (column == ParcelasNaoPagas) {
            return v.getStatus();
        } 
        
        return ""; //Nunca deve ocorrer  
    }



    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) { 
        return false;
    }


    public ParcelaCompra get(int row) {
        return lista.get(row);
    }
}



