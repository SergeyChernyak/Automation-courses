package com.andersen;

import com.andersen.hometask2.ShapeInterface;
import com.andersen.hometask2.Circle;
import com.andersen.hometask2.Rectangle;
import com.andersen.hometask2.Square;
import com.andersen.hometask2.Triangle;

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

