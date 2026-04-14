// Name    : Ajit Kumar Saini
// Roll No : 2400320100114
// Section : CSE 11

import java.util.Scanner;
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class ThrowAndThrows {
    public static void validateMobile(String mobile) throws InvalidInputException {
        if (!mobile.matches("^[6-9][0-9]{9}$")) {
            throw new InvalidInputException(
                "Invalid Mobile Number! Must start with 6–9 and be exactly 10 digits."
            );
        }
        System.out.println("Valid Mobile Number");
    }
    public static void validateEmail(String email) throws InvalidInputException {
        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            throw new InvalidInputException("Invalid Email Address!");
        }
        System.out.println("Valid Email");
    }
    public static void validateUsername(String username) throws InvalidInputException {
        if (!username.matches("^[a-zA-Z0-9_]{5,}$")) {
            throw new InvalidInputException(
                "Username must be at least 5 characters and contain only letters, digits, or _"
            );
        }
        System.out.println("Valid Username");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();
        try {
            validateMobile(mobile);
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        try {
            validateEmail(email);
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        try {
            validateUsername(username);
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
        System.out.println("Program Ended.");
    }
}