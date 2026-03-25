package projecttt;
import java.util.Scanner;

public class Convert {
    public static void main(StringBufferDemo[] args) {
        Scanner sc = new Scanner(System.in);

        // Take integer and double input
        System.out.print("Enter an integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter a double: ");
        double num2 = sc.nextDouble();

        // Convert numbers to strings
        StringBufferDemo str1 = StringBufferDemo.valueOf(num1);
        StringBufferDemo str2 = StringBufferDemo.valueOf(num2);

        // Concatenate strings
        StringBufferDemo combined = str1 + str2;

        // Convert concatenated string back to double
        double result = Double.parseDouble(combined);

        // Print sum (interpreting concatenated value as a number)
        System.out.println("Concatenated string: " + combined);
        System.out.println("Sum (as number): " + result);

        sc.close();
    }
}
