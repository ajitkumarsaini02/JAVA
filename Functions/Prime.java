package functions;

public class Prime {
    public static void isPrime(int n) {
        if(n<1){
            System.out.println(n+" is not a prime number");
        }
        else{
            for(int i=1;i<=n;i++){
                if(n%i!=0){
                    System.out.println(n+" is a prime number");
                }
                else{
                    System.out.println(n+" is not a prime number");
                }
            }
        }
    }
}
