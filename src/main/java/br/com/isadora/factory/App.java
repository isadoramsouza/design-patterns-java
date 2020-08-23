package br.com.isadora.factory;

import br.com.isadora.factory.enumeration.Pais;
import br.com.isadora.factory.interfaces.Moeda;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App{

    private static Logger logger = LoggerFactory.getLogger(App.class.getName());

    public static void main(String[] args) {

        Moeda moeda = MoedaFactory.criarMoeda(Pais.BRASIL);
        /*Moeda moeda = MoedaFactory.criarMoeda(Pais.EUA);*/

        logger.info(moeda.getSimbolo());

    }

}