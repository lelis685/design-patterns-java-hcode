package br.com.designpatterns.demo.abstractfactory.app;

import br.com.designpatterns.demo.abstractfactory.aircrafts.IAircraft;
import br.com.designpatterns.demo.abstractfactory.boats.IBoat;
import br.com.designpatterns.demo.abstractfactory.factories.ITransportFactory;
import br.com.designpatterns.demo.abstractfactory.landvehicles.ILandVehicle;
import org.jetbrains.annotations.NotNull;

public class Application {

    private ILandVehicle vehicle;
    private IAircraft aircraft;
    private IBoat boat;

    public Application(ITransportFactory factory) {
        this.vehicle = factory.createTransportVehicle();
        this.aircraft = factory.createTransportAirCraft();
        this.boat = factory.createTransportBoat();
    }
    public void startRoute(){
        vehicle.startRoute();
        aircraft.startRoute();
        boat.startRoute();
    }
}
