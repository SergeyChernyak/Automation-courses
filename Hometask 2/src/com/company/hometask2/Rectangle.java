package com.company.hometask2;

public class Rectangle extends AbstractShape {

    @Override
    public double calculateArea() {
        double tempArea = randomDouble * randomDouble1;
        double rectangleArea = Math.round(tempArea * 100.0) / 100.0;
        System.out.println("Площадь прямоугольника " + rectangleArea);
        return rectangleArea;
    }

    @Override
    public double calculatePerimeter() {
        double tempPerimeter = 2 * (randomDouble + randomDouble1);
        double rectanglePerimeter = Math.round(tempPerimeter * 100.0) / 100.0;
        System.out.println("Периметр прямоугольника = " + rectanglePerimeter);
        return rectanglePerimeter;
    }
}
