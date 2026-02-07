import java.util.Scanner;
public class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Enter the position : ");
        int pos = sc.nextInt();

        //Get bit
        int bitMask = 1<<pos;
        if((bitMask & n)==0){
            System.out.println("Bit is zero");
        }
        else{
            System.out.println("Bit is one");
        }

        //Set Bit
        int newNumber = bitMask | n;
        System.out.println("New number is : "+newNumber);

        //Clear bit
        int notBitMask = ~bitMask;
        int newNum = notBitMask & n;
        System.out.println("New number is : "+newNum);

        //Update bit
        System.out.println("Enter operation : ");
        int oper = sc.nextInt();
        if(oper == 1){
            int new_Num = bitMask | n;
            System.out.println("New number is : "+new_Num);
        }
        else{
            int not_bit = ~bitMask;
            int new_number = not_bit & n;
            System.out.println("New number is : "+new_number);
        }
    }
}
