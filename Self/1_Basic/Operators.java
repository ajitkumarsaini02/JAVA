public class Operators {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // 1. Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2. Unary Operators
        System.out.println("\nUnary Operators:");
        System.out.println("++a = " + (++a));
        System.out.println("--b = " + (--b));
        System.out.println("!true = " + (!true));

        // 3. Assignment Operators
        int c = 20;
        System.out.println("\nAssignment Operators:");
        c += 5;
        System.out.println("c += 5 : " + c);
        c -= 3;
        System.out.println("c -= 3 : " + c);
        c *= 2;
        System.out.println("c *= 2 : " + c);
        c /= 4;
        System.out.println("c /= 4 : " + c);

        // 4. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // 5. Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x     : " + (!x));

        // 6. Bitwise Operators
        int m = 5;  
        int n = 3;   
        System.out.println("\nBitwise Operators:");
        System.out.println("m & n = " + (m & n));
        System.out.println("m | n = " + (m | n));
        System.out.println("m ^ n = " + (m ^ n));
        System.out.println("~m = " + (~m));

        // 7. Shift Operators
        System.out.println("\nShift Operators:");
        System.out.println("m << 1 = " + (m << 1));
        System.out.println("m >> 1 = " + (m >> 1));
        System.out.println("m >>> 1 = " + (m >>> 1));

        // 8. Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max value = " + max);

        // 9. instanceof Operator
        String str = "Java";
        System.out.println("\nInstanceof Operator:");
        System.out.println("str instanceof String : " + (str instanceof String));
    }
}
