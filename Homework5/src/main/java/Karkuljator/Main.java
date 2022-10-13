//Взять за основу код калькулятора, написанный на уроке. Добавить в него четыре арифметических действия.
// Подумать над автоматическими тестами в методе main, которые нужно дописать.


package Karkuljator;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        tests();

        Calculater calculater = new Calculater(1, 1);
        while (true) {
            int result = calculater.Calculate();
            System.out.println(result);
        }


    }
    public static void tests(){
        Plus plus = new Plus(1, 4);
        if(plus.Calculate(1, 4) != 5)
             throw new AssertionError("Incorrect test result");
        Divide divide = new Divide(1, 4);
        if(divide.Calculate(12, 3) != 4)
            throw new AssertionError("Incorrect test result");
        Minus minus = new Minus(1, 1);
        if(minus.Calculate(4, 1) != 3)
            throw new AssertionError("Incorrect test result");
        Multiply multiply = new Multiply(1, 4);
        if(multiply.Calculate(2, 4) != 8)
            throw new AssertionError("Incorrect test result");
        System.out.println("All correct");
    }
}
