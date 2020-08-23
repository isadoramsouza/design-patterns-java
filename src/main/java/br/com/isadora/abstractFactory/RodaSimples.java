package br.com.isadora.abstractFactory;


import br.com.isadora.abstractFactory.interfaces.Roda;

public class RodaSimples implements Roda {

    @Override
    public String getInfoRoda() {
        return "Roda simples";
    }

}