// This code is belong to Ajit Kumar (2400320100114)
import java.util.Scanner;
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.print("Enter two floating values : ");
        double f1 = sc.nextDouble();
        double f2 = sc.nextDouble();
        System.out.print("Enter three floating values : ");
        double f3 = sc.nextDouble();
        double f4 = sc.nextDouble();
        double f5 = sc.nextDouble();
        sc.close();
        System.out.println("This code is belong to Ajit Kumar (2400320100114)");
        System.out.println("Addition of integers: " + calculator.add(n1, n2));
        System.out.println("Addition of floating values: " + calculator.add(f1, f2));
        System.out.println("Addition of three numbers: " + calculator.add(f3, f4, f5));
        System.out.println("Subtraction of integers: " + calculator.subtract(n1, n2));
        System.out.println("Subtraction of floating values: " + calculator.subtract(f1, f2));
        System.out.println("Subtraction of three numbers: " + calculator.subtract(f3, f4, f5));
        System.out.println("Multiplication of integers: " + calculator.multiply(n1, n2));
        System.out.println("Multiplication of floating values: " + calculator.multiply(f1, f2));
        System.out.println("Multiplication of three numbers: " + calculator.multiply(f3, f4, f5));
        System.out.println("Division of integers: " + calculator.divide(n1, n2));
        System.out.println("Division of floating values: " + calculator.divide(f1, f2));
        System.out.println("Division of three numbers: " + calculator.divide(f3, f4, f5));
    }
}