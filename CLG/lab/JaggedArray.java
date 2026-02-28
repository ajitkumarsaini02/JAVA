import java.util.Scanner;
public class JaggedArray {
    int[][] arr;
    int rows;
    public JaggedArray(int rows) {
        this.rows = rows;
        arr = new int[rows][];
    }
    public void inputArray() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of columns for row " + i + ": ");
            int cols = sc.nextInt();
            if (cols < 0) {
                System.out.println("Negative size not allowed. Setting to 0.");
                cols = 0;
            }
            arr[i] = new int[cols];
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element for arr[" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public void displayArray() {
        System.out.println("\nThe jagged array is:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the jagged array: ");
        int rows = sc.nextInt();
        JaggedArray obj = new JaggedArray(rows);
        obj.inputArray();
        obj.displayArray();
        sc.close();
    }
}
