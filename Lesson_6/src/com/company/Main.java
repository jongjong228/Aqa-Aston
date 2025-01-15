package com.company;

public class Main {

    public static void main(String[] args) throws MyArrayDataException {

        String[][] first = new String[3][4];
        ArrayMethods.checkArraySize(first);
        String[][] second = new String[4][3];
        ArrayMethods.checkArraySize(second);
        String[][] third = new String[3][3];
        ArrayMethods.checkArraySize(third);
        String[][] fourth = new String[4][4];
        ArrayMethods.checkArraySize(fourth);
        fourth = new String[][]{{"1.1","мясо","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        System.out.println(ArrayMethods.getSumOfElements(fourth));
        fourth = new String[][]{{"1.1","20","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        System.out.println(ArrayMethods.getSumOfElements(fourth));
    }
}
