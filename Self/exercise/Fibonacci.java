import java.util.Scanner;
public class Fibonacci {
    public static void fib(int n){
        int n1=0;
        int n2=1;
        System.out.print("Fibonacci series :");
        for(int i=1;i<=n;i++){
            System.out.print(n1+" ");
            int c= n1+n2;
            n1=n2;
            n2=c;
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a number :");
        int a = sc.nextInt();
        fib(a);
    }
}
