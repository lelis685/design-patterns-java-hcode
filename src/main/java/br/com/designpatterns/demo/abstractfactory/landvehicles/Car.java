package br.com.designpatterns.demo.abstractfactory.landvehicles;

public class Car implements ILandVehicle {

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("iniciando trajeto");
    }

    @Override
    public void getCargo() {
        System.out.println("pegamos os passageiros, tudo pronto");
    }
}
