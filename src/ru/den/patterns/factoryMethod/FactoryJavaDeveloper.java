package ru.den.patterns.factoryMethod;

public class FactoryJavaDeveloper implements FactoryDeveloper{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
