package br.com.designpatterns.demo.factorymethod;

import br.com.designpatterns.demo.factorymethod.vehicles.Bike;
import br.com.designpatterns.demo.factorymethod.vehicles.IVehicle;

public class BikeTransport extends Transport{

    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
