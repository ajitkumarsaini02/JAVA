import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows :");
        int n = sc.nextInt();
        System.out.print("Enter no of columns :");
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        System.out.println("Enter the elements of array :");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose of Matrix is : ");
        for(int j=0;j<m;j++){
            for (int i=0;i<n;i++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
