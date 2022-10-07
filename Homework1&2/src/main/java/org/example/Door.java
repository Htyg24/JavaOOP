package org.example;

import java.util.Dictionary;

public class Door {

    private boolean state = false;

    public void open(){
        if (!state){
            this.state = true;
            System.out.println("Door is open");
        }
    }

    public void close(){
        if (state){
            this.state = false;
            System.out.println("Door is close");
        }
    }

}
