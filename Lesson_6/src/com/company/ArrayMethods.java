package com.company;

public class ArrayMethods {

    private static int sumOfElement;

    public static int getSumOfElements(String[][] array){
        try{
            if (array.length !=4 || array[0].length != 4)
            {
                throw new MyArraySizeException("Неправильная размерность массива!");
            }
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
        catch(MyArrayDataException | MyArraySizeException ex){
            System.out.println(ex.getMessage());
            return sumOfElement;
        }
    }
}