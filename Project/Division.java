// Create a Java program that performs division of two numbers inside a try block, handles any exceptions, and prints a message inside a finally block that executes regardless of whether an exception occurred. 

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // taking two numbers from user
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            // performing division
            int result = num1 / num2;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        finally {
            System.out.println("Division operation attempted.");
        }

        sc.close();
    }
}