package br.com.isadora.factory;


import br.com.isadora.factory.interfaces.Moeda;

public class Real implements Moeda {
    @Override
    public String getSimbolo() {
        return "R$";
    }
}