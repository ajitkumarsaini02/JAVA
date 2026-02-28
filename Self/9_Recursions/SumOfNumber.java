
public class SumOfNumber {
    public static void sumNumber(int n, int sum) {
        if(n==0){
            System.out.println(sum);
            return;
        }
        
        sum += n;
        sumNumber(n-1, sum);
    }
    public static void main(String[] args) {
        int n=10;
        sumNumber(n, 0);
    }
}
