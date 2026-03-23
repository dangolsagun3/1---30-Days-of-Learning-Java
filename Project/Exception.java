import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[1]; // array of size 1

        try {
            // taking two numbers from user
            System.out.print("Enter first number: ");
            arr[0] = sc.nextInt();

            System.out.print("Enter second number: ");
            arr[1] = sc.nextInt(); // will cause ArrayIndexOutOfBoundsException

            // performing division
            int result = arr[0] / arr[1];
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }

        sc.close();
    }
}