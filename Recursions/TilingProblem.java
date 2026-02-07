public class TilingProblem {
    public static int placeTile(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        return placeTile(n-m, m) + placeTile(n-1, m);
    }
    public static void main(String[] args) {
        int n=6, m=4;
        int x=placeTile(n, m);
        System.out.println(x);
    }
}
