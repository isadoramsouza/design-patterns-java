package br.com.isadora.factory;

public enum Pais {

    BRASIL("Brasil"),
    EUA("EUA");

    private final String nome;

    Pais(String nome) {
        this.nome = nome;
    }
}