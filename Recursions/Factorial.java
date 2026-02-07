
public class Factorial {
    public static void  fact(int n, int fact){
        if(n==0 || n==1){
            System.out.println(fact);
            return;
        }
        fact *= n;
        fact(n-1, fact);
    }

    public static void main(String[] args) {
        int n=5;
        fact(n,1);
    }
}
