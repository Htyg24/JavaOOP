package org.example;

public class Signalisation {
    private boolean state = true;

    public void enableSignalisation(){
        if (!this.state){
            this.state = true;
            System.out.printf("Signalisation on\n");
        }
    }
    public void disableSignalisation(){
        if (this.state){
            this.state = false;
            System.out.printf("Signalisation off\n");
        }
    }

    public boolean isSignalisation() {
        return state;
    }
}
