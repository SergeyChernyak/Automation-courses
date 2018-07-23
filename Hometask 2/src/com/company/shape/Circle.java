package com.company.shape;

public class Circle extends AbstractShape {

    private double circleArea;
    private double circlePerimeter;

    @Override
    public void calculateArea() {
        double tempArea = (Math.PI) * Math.pow(randomDouble, 2);
        circleArea = Math.round(tempArea * 100.0) / 100.0;
         System.out.println("Площадь круга = " + circleArea);
    }

    @Override
    public void calculatePerimeter() {
        double tempPerimeter = 2 * (Math.PI) * randomDouble;
        circlePerimeter = Math.round(tempPerimeter * 100.0) / 100.0;
        System.out.println("Периметр круга = " + circlePerimeter);
    }
}
