package com.company;

public class Main {

    public static void main(String[] args) throws MyArrayDataException {

        String[][] first = new String[][]{{"1.1","мясо","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        System.out.println(ArrayMethods.getSumOfElements(first));
        String[][] second = new String[][]{{"1.1","мясо","3"},{"1","2","3"},{"1","2","3"},{"1","2","3"}};
        System.out.println(ArrayMethods.getSumOfElements(second));
        String[][] third = new String[][]{{"1.1","мясо","3"},{"1","2","3"},{"1","2","4"}};
        System.out.println(ArrayMethods.getSumOfElements(third));
        String[][] fourth = new String[][]{{"1.1","мясо","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        System.out.println(ArrayMethods.getSumOfElements(fourth));
        fourth = new String[][]{{"1.1","20","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        System.out.println(ArrayMethods.getSumOfElements(fourth));
    }
}
