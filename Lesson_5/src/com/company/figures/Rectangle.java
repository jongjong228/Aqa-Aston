package com.company.figures;

public class Rectangle implements Figure{

    private String borderColor;
    private String fillColor;
    private double a;
    private double b;

    public Rectangle(double a, double b, String borderColor, String fillColor){
        this.a = a;
        this.b = b;
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

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double showPerimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public double showSquare() {
        return a * b;
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
