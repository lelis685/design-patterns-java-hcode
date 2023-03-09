package br.com.designpatterns.demo.factorymethod.vehicles;

public class Bike implements IVehicle{

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o delivery");
    }

    @Override
    public void getCargo() {
        System.out.println("Ja pegamos a comida");
    }
}
