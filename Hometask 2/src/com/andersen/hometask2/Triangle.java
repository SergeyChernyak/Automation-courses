package com.andersen.hometask2;

public class Triangle extends AbstractShape {

    @Override
    public double calculateArea() {
        double tempArea = (Math.sqrt(3) / 4) * Math.pow(randomDouble, 2);
        double triangleArea = Math.round(tempArea * 100.0) / 100.0;
        System.out.println("Площадь треугольника = " + triangleArea);
        return triangleArea;
    }

    @Override
    public double calculatePerimeter() {
        double tempPerimeter = randomDouble + randomDouble + randomDouble;
        double trianglePerimeter = Math.round(tempPerimeter * 100.0) / 100.0;
        System.out.println("Периметр треугольника = " + trianglePerimeter);
        return trianglePerimeter;
    }
}
