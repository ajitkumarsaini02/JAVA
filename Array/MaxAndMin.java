
import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int size = sc.nextInt();
        int num[] = new int[size];
         for(int i=0;i<size;i++){
            num[i] =sc.nextInt();
         }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            if(num[i]<min){
                min = num[i];
            }
            if(num[i]>max){
                max = num[i];
            }
        }
        System.out.println("Largest number is :"+max);
        System.out.println("Smallest number is :"+min);
    }
}
