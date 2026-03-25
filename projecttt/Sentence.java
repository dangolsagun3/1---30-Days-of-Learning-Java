package projecttt;
import java.util.Scanner;
public class Sentence {

    public static void main(StringBufferDemo[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        StringBufferDemo sentence = sc.nextLine();

        if (sentence.length() == 0) {
            System.out.println("Sentence is empty!");
        } else {
            char firstChar = sentence.charAt(0);
            char lastChar = sentence.charAt(sentence.length() - 1);

            System.out.println("First character: " + firstChar);
            System.out.println("Last character: " + lastChar);
        }

        System.out.print("Enter a character to count: ");
        char ch = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("The character '" + ch + "' appears " + count + " times.");

        sc.close();
    }
}
