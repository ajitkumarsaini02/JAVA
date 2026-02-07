import java.util.Scanner;
public class AscendingDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int size = sc.nextInt();
        int num[] = new int[size];
        for(int i=0;i<size;i++){
           num[i] =sc.nextInt();
        }
        boolean isAscending = true;
        for(int i=0;i<num.length-1;i++){
            if(num[i] > num[i+1]){
                isAscending = false;
            }
        }
        if(isAscending){
            System.out.println("The array is sorted in ascending order");
        }
        else{
            System.out.println("The array is not sorted in ascending order");
        }
        sc.close();
    }
}