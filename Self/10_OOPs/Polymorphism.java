import java.util.Scanner;
class Calculate {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public double add(double a, double b, double c) {
        return a + b + c;
    }
}
public class Polymorphism{

    public static void main(String[] args) {
            Calculate poly = new Calculate();
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
            System.out.println("Addition of integers: " + poly.add(n1, n2));
            System.out.println("Addition of floating values: " + poly.add(f1, f2));
            System.out.println("Addition of three numbers: " + poly.add(f3, f4, f5));
    }
}