public class Functions {
    public static void main(String[] args) {
        
        String firstName = "Tony";
        String lastName = "Stark";
        // Concatenation
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        //Length of a string
        System.out.println(fullName.length());
        // Access characters of a string
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
        // compare two strings
        String name1 = "Tony";
        String name2 = "Tony";
        if(name1.equals(name2)){
            System.out.println("They are the same strings");
        }
        else{
            System.out.println("They are different strings");           
        }
        //DO NOT USE == to check for string equality
        //Gives correct answer here
        if(name1 == name2) {
            System.out.println("They are the same string");
        }
        else {
            System.out.println("They are different strings");
        }

        //Gives incorrect answer here
        if(new String("Tony") == new String("Tony")) {
            System.out.println("They are the same string");
        }
        else {
           System.out.println("They are different strings");
        }

        // Substring
        System.out.println(fullName.substring(0,4)); 
        // If you want a char array:
        char[] subChars = fullName.substring(0,4).toCharArray();
        System.out.println(subChars);

        // ParseInt Method to integer class
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);
        // ToString Method of String class
        int num = 123;
        String s = Integer.toString(num);
        System.out.println(s.length());
    }
}