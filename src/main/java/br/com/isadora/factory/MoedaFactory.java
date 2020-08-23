package br.com.isadora.factory;


public class MoedaFactory {

    public static Moeda criarMoeda(Pais pais) {
        if (Pais.BRASIL.equals(pais)) {
            return new Real();
        } else if (Pais.EUA.equals(pais)) {
            return new Dolar();
        }

        throw new IllegalArgumentException("País não existente");
    }
}