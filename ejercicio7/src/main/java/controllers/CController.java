package controllers;

import Calculator.Calculator;
import Calculator.CalculatorSoap;

public class CController {
    public static int addition(int a, int b){
        CalculatorSoap soap = new Calculator().getCalculatorSoap();
        return soap.add(a,b);
    }

    public static int division(int a, int b){
        CalculatorSoap soap = new Calculator().getCalculatorSoap();
        return soap.divide(a,b);
    }

    public static int multiply(int a, int b){
        CalculatorSoap soap = new Calculator().getCalculatorSoap();
        return soap.multiply(a,b);
    }

    public static int subtraction(int a, int b){
        CalculatorSoap soap = new Calculator().getCalculatorSoap();
        return soap.subtract(a,b);
    }
}
