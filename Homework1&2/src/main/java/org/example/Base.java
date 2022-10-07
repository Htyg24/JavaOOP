package org.example;

public class Base {
    private Engine engine;
    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private Wheel wheel4;
    private AutoTransmission transmission;
    private Signalisation signalisation;
    private Door door;

    public Base() {
        engine = new Engine();
        wheel1 = new Wheel();
        wheel2 = new Wheel();
        wheel3 = new Wheel();
        wheel4 = new Wheel();
        transmission = new AutoTransmission();
        signalisation = new Signalisation();
        door = new Door();
    }

    public void start(){
        if (!signalisation.isSignalisation()) {
            engine.start();
        }
    }



    public void stop(){
        engine.stop();
    }

    public void openDoor(){
        door.open();
    }

    public void closeDoor(){
        door.close();
    }

    public void disableSignalisation(){
        signalisation.disableSignalisation();
    }

    public void enabelSignalisation(){
        signalisation.enableSignalisation();
    }

    public void drive() {
        if (engine.getWork()) {
            transmission.SwitchGear(1);
            wheel1.rotate();
            wheel2.rotate();
            wheel3.rotate();
            wheel4.rotate();
        }
    }



    public static void main(String[] args) {
        Base base = new Base();
        base.disableSignalisation();
        base.openDoor();
        base.closeDoor();
        base.start();
        base.transmission.print();
        base.drive();
        base.stop();
        base.enabelSignalisation();
    }
}
