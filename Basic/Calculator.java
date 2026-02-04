
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose :\n 1 for Addition\n 2 for Subtraction \n 3 for Multiplication\n 4 for Division\n 5 for Modulo or Remainder");
        int choice = sc.nextInt();
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch(choice){
            case 1:
                int sum = a+b;
                System.out.println("Addition = "+sum);
                break;
            case 2:
                int sub = a-b;
                System.out.println("Subtraction = "+sub);
                break;
            case 3:
                int mul = a*b;
                System.out.println("Multiplication = "+mul);
                break;
            case 4:
                int div = a/b;
                System.out.println("Division = "+div);
                break;
            case 5:
                int mod = a%b;
                System.out.println("Modulo or Remainder = "+mod);
                break;
            default:
                System.out.println("Invalid choice ");
        }       
    }
    
}
