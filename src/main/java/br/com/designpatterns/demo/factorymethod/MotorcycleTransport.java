package br.com.designpatterns.demo.factorymethod;

import br.com.designpatterns.demo.factorymethod.vehicles.IVehicle;
import br.com.designpatterns.demo.factorymethod.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport{

    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
