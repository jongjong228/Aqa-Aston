package com.company;

public class ArrayMethods {

    private static int sumOfElement;

    public static void checkArraySize(String[][] array){
        try{
            int i = array.length;
            int j;
            if (i != 0) {
                j = array[0].length;
            } else {
                System.out.println("Измените размерность массива!");
                return;
            }
            if (i != 4 || j != 4) throw  new MyArraySizeException("Размерность не удовлетворяет условию");
        }
        catch (MyArraySizeException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static int getSumOfElements(String[][] array){
        try{
          sumOfElement = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    try{
                        sumOfElement += Double.parseDouble(array[i][j]);
                    }catch (NumberFormatException ex){
                        throw new MyArrayDataException("Элемент не является числом на позиции[" + i + "][" + j + "]!");
                    }
                }
            }
          return sumOfElement;
        }
        catch(MyArrayDataException ex){
            System.out.println(ex.getMessage());
            return sumOfElement;
        }
    }
}