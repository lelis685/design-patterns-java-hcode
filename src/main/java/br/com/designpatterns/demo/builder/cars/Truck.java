package br.com.designpatterns.demo.builder.cars;

import br.com.designpatterns.demo.builder.components.CarType;
import br.com.designpatterns.demo.builder.components.Engine;
import br.com.designpatterns.demo.builder.components.Transmission;

public class Truck {

    private final CarType carType;
    private final int seats;
    private final Transmission transmission ;
    private final Engine engine;

    public Truck(CarType carType, int seats, Transmission transmission, Engine engine) {
        this.carType = carType;
        this.seats = seats;
        this.transmission = transmission;
        this.engine = engine;
    }

    public String result() {
        return "Truck{" +
                ", transmission=" + transmission +
                ", engine=" + engine.getPower() +
                '}';
    }
}
