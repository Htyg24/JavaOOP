package org.example;

public abstract class ManualTransmission extends Transmission implements ManualTransmiss{
    @Override
    public void print(){
        System.out.println("Transmission set: D\n" +
                "Transmission set: P");
    }
}
