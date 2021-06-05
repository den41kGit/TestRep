package ru.den.patterns.factoryMethod;

public class FactoryCppDeveloper implements FactoryDeveloper{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
