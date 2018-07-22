package com.company;

import com.company.hometask.ShapeInterface;
import com.company.shape.Circle;
import com.company.shape.Rectangle;
import com.company.shape.Square;
import com.company.shape.Triangle;

public class Main {

    public static void main(String[] args) {
        ShapeInterface circle = new Circle();
        circle.calculateArea();
        circle.calculatePerimeter();

        ShapeInterface square = new Square();
        square.calculateArea();
        square.calculatePerimeter();

        ShapeInterface rectangle = new Rectangle();
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        ShapeInterface triangle = new Triangle();
        triangle.calculateArea();
        triangle.calculatePerimeter();
    }
}

