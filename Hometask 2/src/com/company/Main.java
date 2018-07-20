package com.company;

import com.company.shape.Circle;
import com.company.shape.Rectangle;
import com.company.shape.Square;
import com.company.shape.Triangle;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();

        circle.calculateArea();
        circle.calculatePerimeter();

        Square square = new Square();
        square.calculateArea();
        square.calculatePerimeter();

        Rectangle rectangle = new Rectangle();
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        Triangle triangle = new Triangle();
        triangle.calculateArea();
        triangle.calculatePerimeter();
    }
}

