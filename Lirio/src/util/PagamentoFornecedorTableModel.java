/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.PagamentoFornecedor;
/**
 *
 * @author Mateus
 */
public class PagamentoFornecedorTableModel extends AbstractTableModel{
    private static final int id = 0;
    private static final int CodFor = 1;
    private static final int NomeFor = 2;
    private static final int ParcelasPagas = 3;
    private static final int ParcelasNaoPagas = 3;
    private static final int ValorRestante = 4;

    private List<PagamentoFornecedor> lista;


    public PagamentoFornecedorTableModel(List<PagamentoFornecedor> lista) {
        this.lista = new ArrayList<PagamentoFornecedor>(lista);
    }
    
    public void setLista(List<PagamentoFornecedor> l){
        this.lista = new ArrayList<PagamentoFornecedor>(l);
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
        if (column == CodFor) {
            return "CNPJ";
        }
        if (column == NomeFor) {
            return "Nome_For";
        }
        if (column == ParcelasPagas) {
            return "Parcelas_Pagas";
        }
        if (column == ParcelasNaoPagas) {
            return "Parcelas_Pendentes";
        }
        if (column == ValorRestante) {
            return "Valor_Restante";
        }
        return ""; //Nunca deve ocorrer  
    }

    public Object getValueAt(int row, int column) {
        //Precisamos retornar o valor da coluna column e da linha row.  
        PagamentoFornecedor v = lista.get(row);
        if (column == id) {
            return v.getId();
        } else if (column == CodFor) {
            return v.getFornecedor().getCnpj();
        } else if (column == NomeFor) {
            return v.getNomeFornecedor();
        } else if (column == ParcelasPagas) {
            return v.getParcelasPagas();
        } else if (column == ParcelasNaoPagas) {
            return v.getParcelasNaoPagas();
        } else if (column == ValorRestante) {
            return v.getValorRestante();
        }
        
        return ""; //Nunca deve ocorrer  
    }



    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) { 
        return false;
    }


    public PagamentoFornecedor get(int row) {
        return lista.get(row);
    }
}


