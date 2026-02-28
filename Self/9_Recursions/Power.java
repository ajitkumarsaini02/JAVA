
public class Power {
    public static int  PrintPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int a = PrintPower(x, n-1);
        int xn = x * a;
        return xn;
    }

    public static void main(String[] args) {
        PrintPower(2, 5);
    }
}
