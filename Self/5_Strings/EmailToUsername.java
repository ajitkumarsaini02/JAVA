import java.util.Scanner;
public class EmailToUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email id :");
        String s = sc.next();
        String str = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='@'){
                break;
            }
            else{
                str += s.charAt(i);
            }
        }
        System.out.println("User name is : " +str);
    }
    
}
