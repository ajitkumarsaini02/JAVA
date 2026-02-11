// Write a Java program to demonstrate Compile-time Polymorphism (Method Overloading) by creating a class Calculator
// that performs addition of integers, floating values, and three numbers using overloaded methods.
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public double add(double a, double b, double c) {
        return a + b + c;
    }
    public int subtract(int a, int b){
        return a - b;
    }
    public double subtract(double a, double b){
        return a - b;
    }
    public double subtract(double a, double b, double c){
        return a - b - c;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public double multiply(double a, double b){
        return a*b;
    }
    public double multiply(double a, double b, double c){
        return a*b*c;
    }
    public int divide(int a, int b){
        if(b != 0){
            return a/b;
        } else {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }
    public double divide(double a, double b){
        if(b != 0){
            return a/b;
        } else {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }
    public double divide(double a, double b, double c){
        if(b != 0 && c != 0){
            return a/(b*c);
        } else {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition of integers: " + calculator.add(5, 10));
        System.out.println("Addition of floating values: " + calculator.add(5.5, 10.5));
        System.out.println("Addition of three numbers: " + calculator.add(5.5, 10.5, 15.5));
        System.out.println("Subtraction of integers: " + calculator.subtract(10, 5));
        System.out.println("Subtraction of floating values: " + calculator.subtract(10.5, 5.5));
        System.out.println("Subtraction of three numbers: " + calculator.subtract(15.5, 10.5, 5.5));
        System.out.println("Multiplication of integers: " + calculator.multiply(5, 10));
        System.out.println("Multiplication of floating values: " + calculator.multiply(5.5, 10.5));
        System.out.println("Multiplication of three numbers: " + calculator.multiply(5.5, 10.5, 15.5));
        System.out.println("Division of integers: " + calculator.divide(10, 5));
        System.out.println("Division of floating values: " + calculator.divide(10.5, 5.5));
        System.out.println("Division of three numbers: " + calculator.divide(15.5, 10.5, 5.5));
    }
}