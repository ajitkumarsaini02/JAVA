// using HashMap to print an integer value and its square in a given range
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMapSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = sc.nextInt();
        Map<Integer, Integer> squareMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            squareMap.put(i, i * i);
        }
        System.out.println(squareMap);
    }
}
