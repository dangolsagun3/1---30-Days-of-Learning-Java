package projecttt;
import java.util.Scanner;

public class FullName {
    public static void main(StringBufferDemo[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        StringBufferDemo firstName = sc.nextLine();

        System.out.print("Enter your last name: ");
        StringBufferDemo lastName = sc.nextLine();

        StringBufferDemo fullName = firstName + " " + lastName;

        System.out.println("Full Name: " + fullName);
        System.out.println("Uppercase: " + fullName.toUpperCase());
        System.out.println("Lowercase: " + fullName.toLowerCase());

        sc.close();
    }
}