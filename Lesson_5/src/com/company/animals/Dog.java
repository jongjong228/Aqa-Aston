package com.company.animals;

public class Dog extends Animal{

    private static int number;

    public Dog(String name){
        this.name = name;
        Dog.number++;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Dog.number = number;
    }

    @Override
    public void run(int length) {
        if (length > 500)
        {
            System.out.println("Собака не может пробежать " + length);
        }
        else
            System.out.println("Собака " + name + " пробежала " + length + " метров");
    }

    @Override
    public void swim(int length) {
        if (length > 10)
        {
            System.out.println("Собака не может проплыть " + length);
        }
        else
            System.out.println("Собака " + name + " проплыла " + length + " метров");
    }

    public static void showNumber(){
        System.out.println("Всего собак:" + Dog.number);
    }
}
