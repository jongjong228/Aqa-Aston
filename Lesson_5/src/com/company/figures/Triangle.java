package com.company.figures;

public class Triangle implements Figure{

    private double a;
    private double b;
    private double c;
    private String borderColor;
    private String fillColor;

    public Triangle(double a, double b, double c, String borderColor, String fillColor){
        this.a = a;
        this.b = b;
        this.c = c;
        this.borderColor = borderColor;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
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

    @Override
    public double showPerimeter() {
        return a + b + c;
    }

    @Override
    public double showSquare() {
        double p = showPerimeter() / 2;
        return  Math.sqrt(p * (p - a) * (p - b) * (p - c));
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
