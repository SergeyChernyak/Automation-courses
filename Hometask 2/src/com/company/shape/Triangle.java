package com.company.shape;

public class Triangle extends AbstractShape {

    private double triangleArea;
    private double trianglePerimeter;

    @Override
    public void calculateArea() {
        double tempArea;
        tempArea = (Math.sqrt(3) / 4) * Math.pow(randomDouble, 2);
        triangleArea = Math.round(tempArea * 100.0) / 100.0;
        System.out.println("Площадь треугольника = " + triangleArea);
    }

    @Override
    public void calculatePerimeter() {
        double tempPerimeter;
        tempPerimeter = randomDouble + randomDouble + randomDouble;
        trianglePerimeter = Math.round(tempPerimeter * 100.0) / 100.0;
        System.out.println("Периметр треугольника = " + trianglePerimeter);
    }
}
