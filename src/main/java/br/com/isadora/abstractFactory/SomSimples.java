package br.com.isadora.abstractFactory;


import br.com.isadora.abstractFactory.interfaces.Som;

public class SomSimples implements Som {

    @Override
    public String getInfoSom() {
        return "Som simples";
    }
}