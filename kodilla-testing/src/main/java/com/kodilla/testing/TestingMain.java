package com.kodilla.testing;
import com.kodilla.testing.Calculatorr.Calculatorr;

public class TestingMain {

    public static void main(String[] args)  {

        Calculatorr calculator = new Calculatorr();
        int a=10;
        int b=17;

        int result = calculator.add(10, 17);
        if (result == 27) {
            System.out.println("Add test is OK :)");
        } else {
            System.out.println("Error!");
        }

        result = calculator.subtract(10, 17);
        if (result == -7) {
            System.out.println("Subtract test is OK :)");
        } else {
            System.out.println("Error!");
        }
    }
}

