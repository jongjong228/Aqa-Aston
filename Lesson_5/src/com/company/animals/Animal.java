package com.company.animals;

public abstract class Animal {

    protected String name;

    public abstract void run(int length);

    public abstract void swim(int length);

    public static void showNumberOfAnimals(){
        Cat.showNumber();
        Dog.showNumber();
    }
}
