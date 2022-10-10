package org.example;

import java.util.ArrayList;

public class Box {

    private double weight = 0;
    private ArrayList<Fruit> box = new ArrayList<>();
    private String fruitType = null;


    public Box SumBoxes(Box box){
        if ((box.fruitType == this.fruitType && box.fruitType == "Orange") || this.fruitType == null) {
            while (!box.box.isEmpty()) {
                box.SubFruit();
                this.AddFruit(new Orange());
            }
        }
        else if((box.fruitType == this.fruitType && box.fruitType == "Apple") || this.fruitType == null){
            while (!box.box.isEmpty()) {
                box.SubFruit();
                this.AddFruit(new Apple());
            }
        }
        return box;
    }


    public boolean Equals(Box box){
        return box.GetWeight() == this.GetWeight();
    }


    public Double GetWeight(){
        Double weight = 0.0;
        for (Fruit fruit:box){
            weight += fruit.getWeight();
        }
        return weight;
    }


    public ArrayList<? extends Fruit> AddFruit(Fruit fruit) {
        if (!(box.size() > 0)) {
            box.add(fruit);
            this.fruitType = fruit.GetFruitName();
            return box;
        }
        if (box.get(0).GetFruitName() == fruit.GetFruitName()) {
            box.add(fruit);
        }
        return box;
    }


    public ArrayList<? extends Fruit> SubFruit(){
        if (!box.isEmpty()) {
            box.remove(0);
        }
        if (box.size() == 0){
            this.fruitType = null;
        }
        return box;
    }

}
