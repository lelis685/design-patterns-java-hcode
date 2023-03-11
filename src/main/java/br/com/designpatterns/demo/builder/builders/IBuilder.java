package br.com.designpatterns.demo.builder.builders;

import br.com.designpatterns.demo.builder.components.CarType;
import br.com.designpatterns.demo.builder.components.Engine;
import br.com.designpatterns.demo.builder.components.Transmission;

public interface IBuilder {

    void setCarType(CarType carType);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);

}
