package br.com.isadora.abstractFactory.enumeration;

public enum TipoCarro {

    LUXO("Luxo"),
    SIMPLES("Simples");

    private final String tipo;

    TipoCarro(String tipo) {
        this.tipo = tipo;
    }
}