package org.example;

public abstract class Fruit {

    private double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                '}';
    }

    public double getWeight() {
        return weight;
    }

    public abstract String GetFruitName();
}


