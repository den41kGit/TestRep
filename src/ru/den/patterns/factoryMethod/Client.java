package ru.den.patterns.factoryMethod;

public class Client {

    public static void main(String[] args) {
        FactoryDeveloper factoryDeveloper = createConcreteDeveloper("Cpp");
        Developer developer = factoryDeveloper.createDeveloper();
        developer.doWork();
    }

    public static FactoryDeveloper createConcreteDeveloper(String kindOfDeveloper){
        if(kindOfDeveloper.equals("Java"))
            return new FactoryJavaDeveloper();
           else if (kindOfDeveloper.equals("Cpp"))
               return new FactoryCppDeveloper();

        throw new RuntimeException("Нет такого программиста: " + kindOfDeveloper);
    }
}
