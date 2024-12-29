package com.company.animals;

public class Dish {

     private int capacity;
     private int fullness;

     public Dish(int capacity){
         fullness = 0;
         this.capacity = capacity;
     }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFullness() {
        return fullness;
    }

    public void setFullness(int fullness) {
        this.fullness = fullness;
    }

    public boolean eat(int food){
         if ((fullness-food) >= 0)
         {
             fullness-= food;
             return true;
         }
         else
             return false;
     }

     public void addFood(int newFood){
         if (fullness + newFood <= fullness){
             fullness+= newFood;
         } else
             fullness = capacity;
     }
}
