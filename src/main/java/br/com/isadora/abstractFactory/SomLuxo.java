package br.com.isadora.abstractFactory;


import br.com.isadora.abstractFactory.interfaces.Som;

public class SomLuxo implements Som {

    @Override
    public String getInfoSom() {
        return "Som de luxo";
    }
}