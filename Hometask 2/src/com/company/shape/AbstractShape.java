package com.company.shape;

import com.company.hometask.ShapeInterface;

import java.util.Random;

public abstract class AbstractShape implements ShapeInterface {

    Random random = new Random();
    public double randomDouble = genDouble();

    public double randomDouble1 = genDouble();

    public double genDouble(){
        double i = random.nextDouble();
        return i;
    }
}
