/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplobigdecimal;

/**
 *
 * @author aluno
 */
public class Pecas {
    private String peca;
    private int quant;
    private String valor;
    private String mao;

    public Pecas(String peca, int quant, String valor, String mao) {
        this.peca = peca;
        this.quant = quant;
        this.valor = valor;
        this.mao = mao;
    }

    public String getPeca() {
        return peca;
    }

    public void setPeca(String peca) {
        this.peca = peca;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getMao() {
        return mao;
    }

    public void setMao(String mao) {
        this.mao = mao;
    }
    
}
