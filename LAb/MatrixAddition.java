import java.util.Scanner;

public class MatrixAddition {

    private int n, m;
    private int arr1[][];
    private int arr2[][];
    private int result[][];

    public MatrixAddition(int n, int m) {
        this.n = n;
        this.m = m;
        arr1 = new int[n][m];
        arr2 = new int[n][m];
        result = new int[n][m];
    }

    public void inputMatrices() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
    }

    public void addMatrices() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
    }

    public void displayResult() {
        System.out.println("Addition of matrices:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();
        MatrixAddition obj = new MatrixAddition(n, m);
        obj.inputMatrices();
        obj.addMatrices();
        obj.displayResult();

        sc.close();
    }
}
