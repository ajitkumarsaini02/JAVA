import java.util.Scanner;
public class SpiralMatrix {
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
        System.out.println("Spiral order Matrix is : ");
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;
        while(rowStart <= rowEnd && colStart <= colEnd){
            for(int i=colStart;i<=colEnd;i++){
                System.out.print(matrix[rowStart][i] + " ");
            }
            rowStart++;

            for(int i=rowStart;i<=rowEnd;i++){
                System.out.print(matrix[i][colEnd] + " ");
            }
            colEnd--;

            for(int i=colEnd;i>=colStart;i--){
                System.out.print(matrix[rowEnd][i] + " ");
            }
            rowEnd--;
            for(int i=rowEnd;i>=rowStart;i--){
                System.out.print(matrix[i][colStart] + " ");
            }
            colStart++;
            System.out.println();
        }
    }
    
}