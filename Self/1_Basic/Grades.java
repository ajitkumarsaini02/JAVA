import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        do {
            int marks = sc.nextInt();
            if(marks >=90 && marks <= 100){
                System.out.println("This is Good");
            }
            else if(60 <= marks && marks <= 89 ){
                System.out.println("This is also Good");
            }
            else if(0 <= marks && marks <=59){
                System.out.println("This ia Good as well");
            }
            else{
                System.out.println("Invalid Marks");
            }
            System.out.println("Enter number 0 or 1:");
            a = sc.nextInt();
        } while (a==1);
        sc.close();
    }
    
}
