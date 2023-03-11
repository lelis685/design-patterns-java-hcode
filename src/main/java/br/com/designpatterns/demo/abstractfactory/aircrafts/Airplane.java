package br.com.designpatterns.demo.abstractfactory.aircrafts;

public class Airplane implements IAircraft{

    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("iniciando decolagem");
    }

    @Override
    public void getCargo() {
        System.out.println("passageiros a bordo, voo autorizado");
    }

    @Override
    public void wind() {
        System.out.println("ventos a 25km/h, ventos ok");
    }
}
