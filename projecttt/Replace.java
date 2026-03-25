package projecttt;
import java.util.Scanner;

public class Replace {
    public static void main(StringBufferDemo[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        StringBufferDemo sentence = sc.nextLine();

        sentence = sentence.trim();

        StringBufferDemo modifiedSentence = sentence.replace("Java", "Python");

        System.out.println("Modified sentence: " + modifiedSentence);

        sc.close();
    }
}