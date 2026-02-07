import java.util.Scanner;


public class Factorial {
    public static void Printfact(int n){
        int a=1;
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        for(int i=n;i>=1;i--){
            a*=i;
        }
        System.out.println("Factorial of "+n+" : "+a);
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        Printfact(n);
    }
}
