package com.company.figures;

public interface Figure {

    double PI = Math.PI;

    double showPerimeter();

    double showSquare();

    String showBorderColor();

    String showFillColor();

    default void showAllInfo(){
        System.out.println("Периметр фигуры:" + showPerimeter());
        System.out.println("Площадь фигуры:" + showSquare());
        System.out.println("Цвет заливки:" + showFillColor());
        System.out.println("Цвет границы:" + showBorderColor());
    }
}
