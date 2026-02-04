
import java.util.Scanner;

public class Prime {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int flag = 0;
    void checkPrime() {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }
    }
    public static void main(String[] args) {
        Prime p = new Prime();
        p.checkPrime();
        if (p.n <= 1) {
            System.out.println(p.n + " is not a prime number.");
        } else if (p.flag == 0) {
            System.out.println(p.n + " is a prime number.");
        } else {
            System.out.println(p.n + " is not a prime number.");
        }
    }
}
