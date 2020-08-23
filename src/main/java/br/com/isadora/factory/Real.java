package br.com.isadora.factory;


public class Real implements Moeda {
    @Override
    public String getSimbolo() {
        return "R$";
    }
}