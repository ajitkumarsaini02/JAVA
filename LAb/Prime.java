import java.util.Scanner;

public class Prime {

    private int n;

    public Prime(int n) {
        this.n = n;
    }

    public boolean isPrime() {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void displayResult() {
        if (isPrime()) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        Prime p = new Prime(num);
        p.displayResult();

        sc.close();
    }
}
