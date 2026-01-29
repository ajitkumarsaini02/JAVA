public class MaxOfNumbers{
    public static void main(String[] args){
        int a=10;
        int b=64;
        int c=63;
        if(a>b && a>c){
            System.out.println("A is greater than B and C!");
        }
        else if(b>c && b>a){
            System.out.println("B is greater than A and C!");
        }
        else{
            System.out.println("C is greater than B and C!");
        }
    }
}