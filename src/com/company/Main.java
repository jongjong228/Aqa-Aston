package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkNumbersSum(10,4));
        checkNumber(-2);
        System.out.println(isNumberPositive(0));
        printString("Java",4);
        System.out.println(isYearLeap(2024));
        changeArray();
        enterArray();
        multipleArray();
        enterDiagonal();
        enterArray(10,5);

    }
    public static void printThreeWords(){
        System.out.println("Orange\nBanana\nApple\n");
    }

    //Не совсем понял, надо ли использовать условные операторы, если мы тут видим результат(+ следующие 2 метода)
    public static void checkSumSign(){
        int a = -10;
        int b = 20;
        if (a + b >= 0)
            System.out.println("Сумма положительна\n");
        else
            System.out.println("Сумма отрицательна\n");
    }

    public static void printColor(){
        int value = 30;
        if (value <= 0)
            System.out.println("красный\n");
        else if (value <= 100)
            System.out.println("Желтый\n");
        else
            System.out.println("Зеленый\n");
    }

    public static void compareNumbers(){
        int a = 10;
        int b = 3;
        if (a >= b)
            System.out.println("a >= b\n");
        else
            System.out.println(" a < b\n");
    }

    public static boolean checkNumbersSum(int a, int b){
        return ((a + b >= 10) && (a + b <= 20));
    }

    public static void checkNumber(int value){
        if (value >= 0 )
            System.out.println("Положительное\n");
        else
            System.out.println("Отрицательное\n");
    }

    public static boolean isNumberPositive(int value){
        return (value < 0);
    }

    public static void printString(String a, int num){
        for (int i = 0; i < num; i++) {
            System.out.println(a + '\t');
        }
    }

    public static boolean isYearLeap(int year){
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }

    public static void changeArray(){
        int [] array = new int[]{1,0,0,0,1,0,1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0)
                array[i]++;
            else
                array[i]--;
        }
    }

    public static void enterArray(){
        int []array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i+1;
        }
    }

    public static void multipleArray(){
        int array[] =  new int[]{1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 6) array[i] *= array[i];
        }
    }

    public static void enterDiagonal(){
        int array[][] = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
        }
    }

    public static int[] enterArray(int len, int initialValue){
        int []array = new int[len];
        Arrays.fill(array, initialValue);
        return  array;
    }
}



