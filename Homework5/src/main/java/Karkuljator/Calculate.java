package Karkuljator;

public abstract class Calculate {
    private final int firstNum;
    private final int secondNum;

    public Calculate(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    interface Calculated {

    };

}
