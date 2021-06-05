package ru.den.patterns.decoratorAddExample;

public class AirCondition extends Decorator{
    Car car;

    public AirCondition(Car car) {
        this.car = car;
    }

    @Override
    public int getPrice() {
        return car.getPrice() + 1000;
    }

    @Override
    public String getInfo() {
        return car.getInfo() + " + Air Conditioning";
    }
}
