package br.com.designpatterns.demo.factorymethod.vehicles;

public class Car implements IVehicle{

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o trajeto");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegando passageiros, tudo pronto.");
    }
}
