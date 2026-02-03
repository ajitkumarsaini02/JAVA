
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows :");
        int r = sc.nextInt();
        System.out.print("Enter no of columns :");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter the elements of array :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array elements are:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
