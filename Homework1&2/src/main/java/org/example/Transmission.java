package org.example;

public abstract class Transmission {

    private int gearNumber;
    public void SwitchGear(int number){
        this.gearNumber = number;
        System.out.printf("Switch gear on %d\n", gearNumber);
    }
}

