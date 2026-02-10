import java.util.Scanner;

public class Palindrome {

    private int number;

    public Palindrome(int n) {
        this.number = n;
    }

    public boolean isPalindrome() {
        int temp = number;
        int rev = 0;
        while (temp > 0) {
            int d = temp % 10;
            rev = rev * 10 + d;
            temp /= 10;
        }
        return number == rev;
    }

    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(number + " is a Palindrome Number");
        } else {
            System.out.println(number + " is not a Palindrome Number");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        Palindrome obj = new Palindrome(num);
        obj.displayResult();

        sc.close();
    }
}
