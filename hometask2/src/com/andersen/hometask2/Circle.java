package com.andersen.hometask2;

public class Circle extends com.andersen.hometask2.AbstractShape {

    @Override
    public double calculateArea() {
        double tempArea = (Math.PI) * Math.pow(randomDouble, 2);
        double circleArea = Math.round(tempArea * 100.0) / 100.0;
        System.out.println("Площадь круга = " + circleArea);
        return circleArea;
    }

    @Override
    public double calculatePerimeter() {
        double tempPerimeter = 2 * (Math.PI) * randomDouble;
        double circlePerimeter = Math.round(tempPerimeter * 100.0) / 100.0;
        System.out.println("Периметр круга = " + circlePerimeter);
        return circlePerimeter;
    }
}
