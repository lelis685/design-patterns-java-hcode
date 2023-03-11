package br.com.designpatterns.demo.abstractfactory.landvehicles;

public class Motorcycle implements ILandVehicle{

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("iniciando a entrega");
    }

    @Override
    public void getCargo() {
        System.out.println("pegamos a encomenda!");
    }

}
