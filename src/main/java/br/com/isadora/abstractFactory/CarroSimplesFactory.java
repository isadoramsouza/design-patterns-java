package br.com.isadora.abstractFactory;


import br.com.isadora.abstractFactory.interfaces.CarroFactory;
import br.com.isadora.abstractFactory.interfaces.Roda;
import br.com.isadora.abstractFactory.interfaces.Som;

public class CarroSimplesFactory extends CarroFactory {


    @Override
    public Roda montarRoda() {
        return new RodaSimples();
    }

    @Override
    public Som montarSom() {
        return new SomSimples();
    }
}