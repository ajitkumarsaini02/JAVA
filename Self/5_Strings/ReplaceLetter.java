import java.util.Scanner;

public class ReplaceLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String str = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='e'){
                str += 'i';
            }
            else{
                str += s.charAt(i);
            }
        }
        System.out.println(str);
    }
    
}
