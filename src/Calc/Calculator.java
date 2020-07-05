package Calc;

public class Calculator {
    private static float a;
    private static float b;

    public static float Sum(float a, float b) {
        Calculator.a = a;
        Calculator.b = b;
        return a + b;
    }

    public static float Sub(float a, float b) {
        Calculator.a = a;
        Calculator.b = b;
        return a - b;
    }

    public static float Multiplication(float a, float b) {
        Calculator.a = a;
        Calculator.b = b;
        return a * b;
    }

    public static float Division(float a, float b) {
        Calculator.a = a;
        Calculator.b = b;
        return a / b;
    }
}
