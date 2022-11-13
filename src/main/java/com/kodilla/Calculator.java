package com.kodilla;

public class Calculator {
    public void calculatorAddMethod() {
        int add1 = 7;
        int add2 = 33;

        System.out.println("Add: " +(add1 + add2));
    }
    public void calculatorSubstractMethod() {
        double substract1 = 2.9;
        double substract2 = 1.9;

        System.out.println("Substract: " + (substract1 - substract2));
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculatorAddMethod();
        calculator.calculatorSubstractMethod();
        System.out.println("It works!");
    }
}
