package ru.den.patterns.decoratorAddExample;

abstract class Car {
    String name = "Unnamed Car";

    public String getInfo(){
        return name;
    }

    public abstract int getPrice();
}
