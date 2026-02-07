public class CountMazePaths {
    
    public static int countPaths(int i, int j, int m, int n){
        if(n==m){
            return 0;
        }
        if(i==m-1 || j==n-1){
            return 1;
        }
        int horPaths = countPaths(i+1, j, m, n);
        int verPaths = countPaths(i, j+1, m, n);
        return horPaths + verPaths;
    }

    public static void main(String[] args) {
        int n=5, m=4;
        System.out.println(countPaths(0,0, m, n));
    }

}
