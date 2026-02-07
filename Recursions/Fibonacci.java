
public class Fibonacci {
    public static void fibo(int n, int a, int b){
        if(n==0){
            return;
        }
        System.out.print(a+", ");
        fibo(n-1, b, a+b);
    }

    public static void main(String[] args) {
        int n = 10;
        fibo(n, 0, 1);
    }
}
