package br.com.isadora.factory;


public class Dolar implements Moeda {
    @Override
    public String getSimbolo() {
        return "USD";
    }
}