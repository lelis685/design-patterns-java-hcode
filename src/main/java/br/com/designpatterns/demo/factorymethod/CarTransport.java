package br.com.designpatterns.demo.factorymethod;

import br.com.designpatterns.demo.factorymethod.vehicles.Car;
import br.com.designpatterns.demo.factorymethod.vehicles.IVehicle;

public class CarTransport extends Transport{

    @Override
    protected IVehicle createTransport() {
        return new Car();
    }

}
