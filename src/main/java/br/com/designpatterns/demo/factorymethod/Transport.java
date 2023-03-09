package br.com.designpatterns.demo.factorymethod;

import br.com.designpatterns.demo.factorymethod.vehicles.IVehicle;

public abstract class Transport {

    public void startTransport(){
        IVehicle iVehicle = createTransport();
        iVehicle.startRoute();
    }

   protected abstract IVehicle createTransport();

}
