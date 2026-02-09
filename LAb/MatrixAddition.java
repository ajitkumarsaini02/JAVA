import java.util.Scanner;
public class MatrixAddition{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows of matrix :");
        int n = sc.nextInt();
        System.out.print("Enter the no of column of matrix :");
        int m = sc.nextInt();
        int arr1[][] = new int[n][m];
        System.out.println("Enter the elements od matrix 1 : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        int arr2[][] = new int[n][m];
        System.out.println("Enter the elements od matrix 2 :");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        int arr3[][] = new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Addition of matrices : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}