package br.com.designpatterns.demo.abstractfactory.aircrafts;

public class Helicopter implements IAircraft{

    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("iniciando decolagem");
    }

    @Override
    public void getCargo() {
        System.out.println("passageiros ok, ligando helices");
    }

    @Override
    public void wind() {
        System.out.println("ventos a 25km/h, sudeste, vendo ok");
    }
}
