package com.company.shape;

public class Rectangle extends AbstractShape {

    private double rectangleArea;
    private double RectanglePerimeter;

    @Override
    public void calculateArea() {
        double tempArea;
        tempArea = randomDouble * randomDouble1;
        rectangleArea = Math.round(tempArea * 100.0) / 100.0;
        System.out.println("Площадь прямоугольника " + rectangleArea);
    }

    @Override
    public void calculatePerimeter() {
        double tempPerimeter;
        tempPerimeter = 2 * (randomDouble + randomDouble1);
        RectanglePerimeter = Math.round(tempPerimeter * 100.0) / 100.0;
        System.out.println("Периметр прямоугольника = " + RectanglePerimeter);
    }
}
