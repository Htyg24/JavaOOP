package org.example;

public class Orange extends Fruit{
    private static final double weight = 1.5f;

    public Orange() { super(weight);
    }

    @Override
    public String GetFruitName() {
        return "Oringe";
    }
}