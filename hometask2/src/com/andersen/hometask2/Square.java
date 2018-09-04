package com.andersen.hometask2;

public class Square extends com.andersen.hometask2.AbstractShape {

    @Override
    public double calculateArea() {
        double tempArea = Math.pow(randomDouble, 2);
        double squareArea = Math.round(tempArea * 100.0) / 100.0;
        System.out.println("Площадь квадрата = " + squareArea);
        return squareArea;
    }

    @Override
    public double calculatePerimeter() {
        double tempPerimeter = 4 * randomDouble;
        double squarePerimeter = Math.round(tempPerimeter * 100.0) / 100.0;
        System.out.println("Периметр квадрата = " + squarePerimeter);
        return squarePerimeter;
    }
}
