package br.com.designpatterns.demo.abstractfactory.factories;

import br.com.designpatterns.demo.abstractfactory.aircrafts.Helicopter;
import br.com.designpatterns.demo.abstractfactory.aircrafts.IAircraft;
import br.com.designpatterns.demo.abstractfactory.boats.Boat;
import br.com.designpatterns.demo.abstractfactory.boats.IBoat;
import br.com.designpatterns.demo.abstractfactory.landvehicles.ILandVehicle;
import br.com.designpatterns.demo.abstractfactory.landvehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAirCraft() {
        return new Helicopter();
    }

    @Override
    public IBoat createTransportBoat() {
        return new Boat();
    }
}
