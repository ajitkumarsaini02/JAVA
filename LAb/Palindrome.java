
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int temp = n, rev =0;
        while(n > 0){
            int d = n % 10;
            rev = rev * 10 + d;
            n /= 10;
        }
        if(temp == rev){
            System.out.println(temp+" is a Palindrome Number");
        }
        else{
            System.out.println(temp+" is not a Palindrome Number");
        }
    }
}
