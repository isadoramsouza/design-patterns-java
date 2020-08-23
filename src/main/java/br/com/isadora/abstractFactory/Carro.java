package br.com.isadora.abstractFactory;


import br.com.isadora.abstractFactory.interfaces.Roda;
import br.com.isadora.abstractFactory.interfaces.Som;

public class Carro {

    Roda roda;
    Som som;

    public void setRoda(Roda roda) {
        this.roda = roda;
    }

    public void setSom(Som som) {
        this.som = som;
    }

    public Roda getRoda() {
        return roda;
    }

    public Som getSom() {
        return som;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "roda=" + getRoda().getInfoRoda() +
                ", som=" + getSom().getInfoSom() +
                '}';
    }
}