package br.com.designpatterns.demo;

import br.com.designpatterns.demo.factorymethod.BikeTransport;
import br.com.designpatterns.demo.factorymethod.CarTransport;
import br.com.designpatterns.demo.factorymethod.MotorcycleTransport;
import br.com.designpatterns.demo.factorymethod.Transport;

public class FactoryMethodMain {

    private static Transport transport;

    public static void main(String[] args) {

        configure(args[0]);

        if(transport != null){
            runTransport();
        }

    }

    private static void runTransport() {
        transport.startTransport();
    }

    private static void configure(String type) {
        switch (type){
            case "uber" -> transport = new CarTransport();
            case "log" -> transport = new MotorcycleTransport();
            case "eats" -> transport = new BikeTransport();
            default -> System.out.println("Selecione o tipo de entrega");
        }
    }

}
