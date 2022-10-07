package org.example;

public class Engine {
    private Boolean work = false;

    public void start() {
        if (!this.work) {
            System.out.println("Engine start");
            this.work = true;
        }
    }

    public void stop(){
        if (this.work) {
            System.out.println("Engine stop");
            this.work = false;
        }
    }

    public void ThrottleUp(int level){
        if (this.work)
            System.out.printf("Throttle up %d \n", level);
    }

    public Boolean getWork() {
        return work;
    }
}
