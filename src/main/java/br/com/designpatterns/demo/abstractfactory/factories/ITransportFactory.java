package br.com.designpatterns.demo.abstractfactory.factories;

import br.com.designpatterns.demo.abstractfactory.aircrafts.IAircraft;
import br.com.designpatterns.demo.abstractfactory.landvehicles.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAirCraft();
}
