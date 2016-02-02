/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesTeste;

import java.util.Calendar;
import java.util.Date;
import model.ParcelaVenda;

/**
 *
 * @author Mateus
 */
public class PagarParcela {
    
    public String pagarParcela(ParcelaVenda parcela){
        Calendar c = Calendar.getInstance();
        Date d = c.getTime();
        if(parcela.getStatus().equals("Pendente")){
            parcela.setStatus("Pago");
            return "sucesso";
        } else if (parcela.getStatus().equals("Pago")) {
            return "parcelaPaga";
        } else {
            return "Erro, status inconsistente.";
        }
    }
}
