package org.example;

public class AutoTransmission extends Transmission implements Transmiss{

    @Override
    public void print(){
        System.out.printf("Transmission set 1");
        System.out.printf("Transmission set 2");
        System.out.printf("Transmission set 3");
        System.out.printf("Transmission set 2");
        System.out.printf("Transmission set 1");
    }
}
