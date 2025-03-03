package com.company.figures;

public class Circle implements Figure{

    private String borderColor;
    private String fillColor;
    private double radius;

    public Circle(double radius,String borderColor,String fillColor){
        this.radius = radius;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double showPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double showSquare() {
        return  PI * radius * radius;
    }

    @Override
    public String showBorderColor() {
        return borderColor;
    }

    @Override
    public String showFillColor() {
        return fillColor;
    }
}
