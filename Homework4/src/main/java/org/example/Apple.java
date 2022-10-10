package org.example;

public class Apple extends Fruit{
    private static final double weight = 1f;

    public Apple() { super(weight);}

    @Override
    public String GetFruitName() {
        return "Apple";
    }
}