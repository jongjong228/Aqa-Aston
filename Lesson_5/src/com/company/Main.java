package com.company;

import com.company.animals.Cat;
import com.company.animals.Dish;
import com.company.animals.Dog;
import com.company.figures.Circle;
import com.company.figures.Rectangle;
import com.company.figures.Triangle;

public class Main {

    public static void main(String[] args) {
	//first task
        Dish mainDish = new Dish(100);
        Cat musa = new Cat("Musia", mainDish);
        musa.run(300);
        musa.run(20);
        musa.swim(60);
        musa.eat(30);
        musa.addFood(50);
        musa.eat(10);
        Dog shpiz = new Dog("Carla");
        shpiz.run(600);
        shpiz.run(100);
        shpiz.swim(12);
        shpiz.swim(8);
        Dog curzhar = new Dog("Alma");
        Dog alabai = new Dog("Jack");
        Dog.showNumber();
        Cat british = new Cat("Mart", mainDish);
        Cat.showNumber();
        Cat.showNumberOfAnimals();
        Cat roza = new Cat("Roza", mainDish);
        Cat[] cats = new Cat[]{musa,british,roza};
        mainDish.addFood(100);
        for (Cat cat : cats) {
            cat.eat(40);
            cat.isHungry();
        }
        // second task
        Circle first = new Circle(5.2, "red", "white");
        System.out.println(first.showPerimeter());
        System.out.println(first.showSquare());
        first.showAllInfo();
        Rectangle second = new Rectangle(2.1, 6.2, "blue", "brown");
        System.out.println(second.showPerimeter());
        System.out.println(second.showSquare());
        second.showAllInfo();
        Triangle third = new Triangle(4, 5, 6, "black", "white");
        System.out.println(third.showPerimeter());
        System.out.println(third.showSquare());
        third.showAllInfo();
    }
}
