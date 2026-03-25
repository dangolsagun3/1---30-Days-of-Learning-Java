// Create a Java program that creates a StringBuffer with a sentence input by the user, appends " - Learning Java" at the end, inserts "Awesome " at the beginning, reverses the StringBuffer, and prints the final result. 

package projecttt;

import java.util.Scanner;

public class StringBufferDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take sentence input from user
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Create StringBuffer
        StringBuffer sb = new StringBuffer(input);

        // Reverse the StringBuffer
        sb.reverse();

        // Append " - Learning Java"
        sb.append(" - Learning Java");

        // Insert "Awesome " at the beginning
        sb.insert(0, "Awesome ");

        // Print final result
        System.out.println("Final result: " + sb);

        sc.close();
    }
}
