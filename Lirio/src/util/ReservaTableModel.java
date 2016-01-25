/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Reserva;

/**
 *
 * @author Danilo
 */
public class ReservaTableModel extends AbstractTableModel{
    private static final int Cod = 0;
    private static final int Cliente = 1;
    private static final int Data = 2;
    private static final int Preco = 3;

    private List<Reserva> lista;


    public ReservaTableModel(List<Reserva> lista) {
        this.lista = new ArrayList<Reserva>(lista);
    }
    
    public void setLista(List<Reserva> l){
        this.lista = new ArrayList<Reserva>(l);
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
        if (column == Cliente) {
            return "Cliente";
        }
        if (column == Data) {
            return "Data";
        }
        if (column == Preco) {
            return "Preco";
        }
        return ""; 
    }

    public Object getValueAt(int row, int column) {  
        Reserva r = lista.get(row);
        if (column == Cod) {
            return r.getId();
        } else if (column == Cliente) {
            return r.getCliente().getNome();
        } else if (column == Data) {
            return r.getDataReserva();
        } else if (column == Preco) {
            return r.getPreco();
        }
        
        return "";
    }



    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) { 
        return false;
    }


    public Reserva get(int row) {
        return lista.get(row);
    }
}
