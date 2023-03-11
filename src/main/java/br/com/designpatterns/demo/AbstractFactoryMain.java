package br.com.designpatterns.demo;


import br.com.designpatterns.demo.abstractfactory.app.Application;
import br.com.designpatterns.demo.abstractfactory.factories.BoatTransport;
import br.com.designpatterns.demo.abstractfactory.factories.ITransportFactory;
import br.com.designpatterns.demo.abstractfactory.factories.NineNineTransport;
import br.com.designpatterns.demo.abstractfactory.factories.UberTransport;

public class AbstractFactoryMain {


    public static Application configureApplication(String company){
        ITransportFactory factory;

        if(company.equals("uber")){
            factory = new UberTransport();
        }else if(company.equals("nine")){
            factory = new NineNineTransport();
        }else{
            factory = new BoatTransport();
        }

        return new Application(factory);
    }

    public static void main(String[] args) {
        Application app = configureApplication("ss");
        app.startRoute();
    }

}
