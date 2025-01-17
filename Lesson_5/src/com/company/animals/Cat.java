package com.company.animals;

public class Cat extends Animal{

    private static int number;
    private boolean satiety;

    public Cat(String name){
        this.name = name;
        this.satiety = false;
        Cat.number++;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Cat.number = number;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    @Override
    public void run(int length) {
        if (length > 200)
        {
            System.out.println("Кот не может пробежать " + length);
        }
        else
            System.out.println("Кот " + name + " пробежал " + length + " метров");
    }

    @Override
    public void swim(int length) {
        System.out.println("Коты не умеют плавать!!!" + name + " тоже не умеет");
    }

    public static void showNumber(){
        System.out.println("Всего котов:" + Cat.number);
    }

    public void eat(int food,Dish dish){
         if (!dish.takeFood(food)) {
             System.out.println("Кот не наелся");
         } else {
             System.out.println("Коту хватило еды");
             satiety = true;
         }
    }

    public void isHungry(){
        System.out.println("Голодна ли " + name + "?" + !satiety);
    }
}
