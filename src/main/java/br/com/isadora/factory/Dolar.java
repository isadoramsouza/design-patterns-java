package br.com.isadora.factory;


import br.com.isadora.factory.interfaces.Moeda;

public class Dolar implements Moeda {
    @Override
    public String getSimbolo() {
        return "USD";
    }
}