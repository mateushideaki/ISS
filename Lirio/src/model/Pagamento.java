/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Mateus
 */
public abstract class Pagamento {
    private int parcelasPagas;
    private int parcelasNaoPagas;
    private float valorParcela;
    private float valorRestante;
    private int diaVencimento;
    
    public Pagamento(){
        this.parcelasPagas = 0;
    }
    
    public String pagarParcela(){
        if(parcelasNaoPagas > 0){
            this.parcelasPagas++;
            this.parcelasNaoPagas--;
            return "sucesso";
        }
        else{
            return "falha";
        }
    }

    public int getParcelasPagas() {
        return parcelasPagas;
    }

    public void setParcelasPagas(int parcelasPagas) {
        this.parcelasPagas = parcelasPagas;
    }

    public int getParcelasNaoPagas() {
        return parcelasNaoPagas;
    }

    public void setParcelasNaoPagas(int parcelasNaoPagas) {
        this.parcelasNaoPagas = parcelasNaoPagas;
    }

    public float getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(float valorParcela) {
        this.valorParcela = valorParcela;
    }

    public float getValorRestante() {
        return valorRestante;
    }

    public void setValorRestante(float valorRestante) {
        this.valorRestante = valorRestante;
    }

    public int getDiaVencimento() {
        return diaVencimento;
    }

    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }
    
    
    
}
