package Karkuljator;

import java.util.Scanner;

public class Calculater{
    private final int firstNum;
    private final int secondNum;

    public Calculater(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public int Calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое значение");
        int firstNum = scanner.nextInt();
        System.out.println("Введите второе значение");
        int secondNum = scanner.nextInt();
        System.out.println("Для суммы введите 1\n" +
                "Для вычитания нажмите 2\n" +
                "Для Умножение введите 3\n" +
                "Для деление нажмите 4\n");
        int result;
        int c = scanner.nextInt();
        switch (c){
            case 1:
                Plus plus = new Plus(this.firstNum, this.secondNum);
                return plus.Calculate(firstNum, secondNum);
            case 2:
                Minus minus = new Minus(this.firstNum, this.secondNum);
                return minus.Calculate(firstNum, secondNum);
            case 3:
                Multiply multiply = new Multiply(this.firstNum, this.secondNum);
                return multiply.Calculate(firstNum, secondNum);
            case 4:
                Divide divide = new Divide(this.firstNum, this.secondNum);
                return divide.Calculate(firstNum, secondNum);
            default:
                System.out.println("Введите корректное значение");
        }
        return 0;
    }
}
