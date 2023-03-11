package br.com.designpatterns.demo.abstractfactory.factories;

import br.com.designpatterns.demo.abstractfactory.aircrafts.Airplane;
import br.com.designpatterns.demo.abstractfactory.aircrafts.IAircraft;
import br.com.designpatterns.demo.abstractfactory.landvehicles.Car;
import br.com.designpatterns.demo.abstractfactory.landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAirCraft() {
        return new Airplane();
    }
}
