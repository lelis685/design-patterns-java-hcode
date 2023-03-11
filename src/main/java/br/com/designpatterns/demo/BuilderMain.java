package br.com.designpatterns.demo;

import br.com.designpatterns.demo.builder.builders.CarBuilder;
import br.com.designpatterns.demo.builder.builders.TruckBuilder;
import br.com.designpatterns.demo.builder.cars.Car;
import br.com.designpatterns.demo.builder.cars.Truck;
import br.com.designpatterns.demo.builder.director.Director;

public class BuilderMain {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);

        Car result = builder.getResult();
        System.out.println(result.getCarType() + " produzido com sucesso");


        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);

        Truck result1 = truckBuilder.getResult();

        System.out.println(result1.result());

    }

}
