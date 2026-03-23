// Create a Java program that defines a custom exception class NegativeNumberException, and write a method that throws this exception if a negative number is entered; in the main method, call the method and handle the exception using a try-catch block.

import java.util.Scanner;

// Custom exception class
class NegativeNumberException extends java.lang.Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Negative {
    // Method that throws NegativeNumberException if a negative number is entered
    public static void checkNegative(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Negative number entered: " + number);
        } else {
            System.out.println("You entered a non-negative number: " + number);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        try {
            checkNegative(num); // Call the method that may throw an exception
        } catch (NegativeNumberException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        sc.close();
    }
}