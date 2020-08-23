package br.com.isadora.abstractFactory;

import br.com.isadora.abstractFactory.enumeration.TipoCarro;
import br.com.isadora.abstractFactory.interfaces.CarroFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static Logger logger = LoggerFactory.getLogger(App.class.getName());

    private static Carro montarCarro(TipoCarro tipo){
        CarroFactory carroFactory = null;

        if(TipoCarro.LUXO.equals(tipo)){
            carroFactory = new CarroLuxoFactory();
        }else if(TipoCarro.SIMPLES.equals(tipo)){
            carroFactory = new CarroSimplesFactory();
        }

        Carro carro = new Carro();
        carro.setRoda(carroFactory.montarRoda());
        carro.setSom(carroFactory.montarSom());

        return carro;
    }

    public static void main(String[] args) {

        Carro carro = montarCarro(TipoCarro.LUXO);
        /*Carro carro = montarCarro(TipoCarro.LUXO);*/

        logger.info(carro.toString());
    }

}